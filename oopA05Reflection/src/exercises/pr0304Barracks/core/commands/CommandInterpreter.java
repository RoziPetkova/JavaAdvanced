package exercises.pr0304Barracks.core.commands;

import java.lang.reflect.InvocationTargetException;
import exercises.pr0304Barracks.contracts.Executable;


public class CommandInterpreter implements exercises.pr0304Barracks.contracts.CommandInterpreter{

	private final static String COMMAND_PATH = "exercises.pr0304Barracks.core.commands.allCommands.";
	private final static String COMMAND_SUFFIX = "Command";

	
	public CommandInterpreter() {
	}
	
	@Override
	public Executable interpretCommand(String[] data, String commandName) {
		String commandName2 = commandName.substring(0,1).toUpperCase() + commandName.substring(1);
		try {
		 	@SuppressWarnings("unchecked")
			Class<? extends Executable> commantToReturn = (Class<? extends Executable>)
															Class.forName(COMMAND_PATH + commandName2 + COMMAND_SUFFIX);
		 	return (Executable) commantToReturn.getConstructors()[0].newInstance();
		} catch (ClassNotFoundException | InstantiationException 
				| IllegalAccessException | IllegalArgumentException 
				| InvocationTargetException | SecurityException e) {
			throw new RuntimeException("Invalid command!");
		}
	}
}
