package e1013infernoInfinity.commands;

import e1013infernoInfinity.repository.Weapon;

public class CreateCommand extends BaceCommand {

	@Override
	public String execute() {
		super.getWeaponRepository().add(new Weapon(super.getParams()[0], super.getParams()[1]));

		return null;
	}

}
