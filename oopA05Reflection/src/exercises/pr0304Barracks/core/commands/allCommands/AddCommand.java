package exercises.pr0304Barracks.core.commands.allCommands;

import exercises.pr0304Barracks.contracts.Unit;
import exercises.pr0304Barracks.core.commands.Command;

public class AddCommand extends Command{

	@Override
	public String execute() {
		String unitType = super.getData()[1];
		Unit unitToAdd =super.getUnitFactory().createUnit(unitType);
		super.getRepository().addUnit(unitToAdd);
		String output = unitType + " added!";
		return output;
	}
}
