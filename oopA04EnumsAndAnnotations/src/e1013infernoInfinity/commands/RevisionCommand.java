package e1013infernoInfinity.commands;

import e1013infernoInfinity.annotations.BasicCustomInfo;
import e1013infernoInfinity.repository.Weapon;

public class RevisionCommand extends BaceCommand {

	@Override
	public String execute() {
		BasicCustomInfo annotation = Weapon.class.getAnnotation(BasicCustomInfo.class);
		return String.format("Revision: %s", annotation.revision());
	}

}
