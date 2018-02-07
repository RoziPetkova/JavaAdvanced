package exercises.pr0304Barracks.core;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;

import exercises.pr0304Barracks.contracts.CommandInterpreter;
import exercises.pr0304Barracks.contracts.Executable;
import exercises.pr0304Barracks.contracts.Inject;
import exercises.pr0304Barracks.contracts.Repository;
import exercises.pr0304Barracks.contracts.UnitFactory;
import exercises.pr0304Barracks.core.commands.Invoker;
import exercises.pr0304Barracks.core.commands.allCommands.FightCommand;

public class Engine implements Runnable {

	@SuppressWarnings("unused")
	private Repository repository;
	@SuppressWarnings("unused")
	private UnitFactory unitFactory;
	String[] data;
	private Invoker invoker;
	private CommandInterpreter interpret;

	public Engine(Repository repository, UnitFactory unitFactory, Invoker invoker, CommandInterpreter interpret) {
		this.repository = repository;
		this.unitFactory = unitFactory;
		this.invoker = invoker;
		this.interpret = interpret;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		while (true) {
			try {
				String input = reader.readLine();
				data = input.split("\\s+");
				String commandName = data[0];
				
				Executable theCommand = interpret.interpretCommand(data, commandName);
				if (theCommand instanceof FightCommand)
					break;

				invoker.setCommand(theCommand);
				injectDependencied(theCommand);
				System.out.println(invoker.execute());
				
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			} catch (IOException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void injectDependencied(Executable command) throws IllegalArgumentException, IllegalAccessException {
		Field[] commandFields = command.getClass().getSuperclass().getDeclaredFields();
		Field[] thisfields = this.getClass().getDeclaredFields();
		
		for (Field commandfield : commandFields) {
			if(commandfield.isAnnotationPresent(Inject.class)){
				for (Field field : thisfields) {
					if(commandfield.getName().equals(field.getName())){
						commandfield.setAccessible(true);
						field.setAccessible(true);
						commandfield.set(command, field.get(this));
					}
				}
			}	
		}
	}
}
