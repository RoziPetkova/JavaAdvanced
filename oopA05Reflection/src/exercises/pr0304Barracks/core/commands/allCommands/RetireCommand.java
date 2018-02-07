package exercises.pr0304Barracks.core.commands.allCommands;

import exercises.pr0304Barracks.core.commands.Command;

public class RetireCommand extends Command {


	@Override
	public String execute() {
		try {
			super.getRepository().removeUnit(super.getData()[1]);
		} catch (IllegalArgumentException e) {
			return e.getMessage();
		}
		return String.format("%s retired!", super.getData()[1]);
	}
}
