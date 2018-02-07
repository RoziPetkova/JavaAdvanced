package e1013infernoInfinity.commands;

import e1013infernoInfinity.annotations.BasicCustomInfo;
import e1013infernoInfinity.repository.Weapon;

public class DescriptionCommand extends BaceCommand{

	@Override
	public String execute() {
		BasicCustomInfo annotation = Weapon.class.getAnnotation(BasicCustomInfo.class);
		return String.format("Class description: %s", annotation.description());	
	}
}
