package factories;

import java.lang.reflect.InvocationTargetException;

import interfaces.Executable;

public final class CommandFactory {

	private final static String COMMAND_PATH_ = "core.commands.";
	private final static String COMMAND_ = "Connand";
	private static Executable command;

	public static Executable generateCommand(String[] params) throws ClassNotFoundException, IllegalArgumentException, InvocationTargetException,
			SecurityException, InstantiationException, IllegalAccessException {
		String writeCommandName = params[0].substring(0, 1).toUpperCase() + params[0].substring(1);
		@SuppressWarnings("unchecked")
		Class<? extends Executable> aclass = (Class<? extends Executable>) Class.forName(COMMAND_PATH_ + writeCommandName + COMMAND_);
		command = (Executable) aclass.getDeclaredConstructors()[0].newInstance(params);
		return command;
	}
}
