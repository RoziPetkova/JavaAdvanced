package e1013infernoInfinity;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import e1013infernoInfinity.annotations.Inject;
import e1013infernoInfinity.commands.Executable;
import e1013infernoInfinity.repositories.Repository;
import e1013infernoInfinity.repository.Weapon;

public class Engine implements Runnable {

	private static final String TERMINATE_COMMAND = "END";
	private static final String COMMAND_CLASS_PATH = "e1013infernoInfinity.commands.";
	private static final String COMMAND_CLASS_NAME_SUFFIX = "Command";

	@SuppressWarnings("unused")
	private String[] params;
	@SuppressWarnings("unused")
	private Repository<Weapon> weapons;
	private BufferedReader reader;

	public Engine(BufferedReader reader, Repository<Weapon> weapons) {
		this.reader = reader;
		this.weapons = weapons;
	}

	@Override
	public void run() {
		String line = null;

		try {
			while ((line = reader.readLine()) != null && !line.equals(Engine.TERMINATE_COMMAND)) {
				String[] params = line.split(";");
				String result = dispachedCommand(params[0], Arrays.stream(params).skip(1).toArray(String[]::new));

				if (result != null)
					System.out.println(result);
			}
		} catch (IOException | ArrayIndexOutOfBoundsException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public String dispachedCommand(String command, String[] tokens) throws InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		this.params = tokens;
		
		Class<Executable> commandClass = (Class<Executable>) Class.forName(COMMAND_CLASS_PATH + command + COMMAND_CLASS_NAME_SUFFIX);
		Constructor<Executable> declaredConstructor = commandClass.getDeclaredConstructor();
		Executable executable = declaredConstructor.newInstance();

		injectDependencies(executable);
		return executable.execute();
	}

	private void injectDependencies(Executable executable) throws IllegalArgumentException, IllegalAccessException {
		Field[] fields = executable.getClass().getSuperclass().getDeclaredFields();

		for (Field field : fields) {
			if (field.isAnnotationPresent(Inject.class)) {
				Field[] currentFields = this.getClass().getDeclaredFields();
				for (Field currentField : currentFields) {
					if (field.getType().equals(currentField.getType())) {
						field.setAccessible(true);
						field.set(executable, currentField.get(this));
					}
				}
			}
		}

	}
}
