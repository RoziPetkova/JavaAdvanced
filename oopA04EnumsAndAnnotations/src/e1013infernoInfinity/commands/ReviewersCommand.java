package e1013infernoInfinity.commands;

import e1013infernoInfinity.annotations.BasicCustomInfo;
import e1013infernoInfinity.repository.Weapon;

public class ReviewersCommand extends BaceCommand{

	@Override
	public String execute() {
		BasicCustomInfo annotation = Weapon.class.getAnnotation(BasicCustomInfo.class);
		return String.format("Reviewers: %s", String.join(", ", annotation.reviewers()));	
	}
}
