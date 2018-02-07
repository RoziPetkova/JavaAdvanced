package core.commands;

import core.Command;

public class AttackCommand extends Command{

	protected AttackCommand(String[] params) {
		super(params);
	}

	@Override
	public String execute() {
		super.getBlobRepo().getByName(super.getParams()[0]).attack(super.getBlobRepo().getByName(super.getParams()[1]));
		return null;
	}

}
