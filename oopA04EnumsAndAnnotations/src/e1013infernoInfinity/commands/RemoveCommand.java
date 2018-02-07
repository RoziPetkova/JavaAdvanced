package e1013infernoInfinity.commands;

import java.util.Map;

import e1013infernoInfinity.repository.Weapon;

public class RemoveCommand extends BaceCommand {

	@Override
	public String execute() {
		Map<String, Weapon> weapons = super.getWeaponRepository().getAllWeapons();
		if (super.getWeaponRepository().getAllWeapons().containsKey(super.getParams()[0])) {
			weapons.get(super.getParams()[0]).removeGem(Integer.parseInt(super.getParams()[1]));
		}
		return null;
	}

}
