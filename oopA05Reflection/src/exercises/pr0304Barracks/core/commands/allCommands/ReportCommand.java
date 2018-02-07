package exercises.pr0304Barracks.core.commands.allCommands;

import exercises.pr0304Barracks.core.commands.Command;

public class ReportCommand extends Command{


	@Override
	public String execute() {
		return super.getRepository().getStatistics();
	}
}
