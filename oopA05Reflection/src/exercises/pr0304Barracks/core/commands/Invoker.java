package exercises.pr0304Barracks.core.commands;

import exercises.pr0304Barracks.contracts.Executable;

public class Invoker implements Executable {

	private Executable command;
	
	public void setCommand(Executable command) {
		this.command = command;
	}

	@Override
	public String execute() {
		return command.execute();
	}
}
