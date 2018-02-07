package e1013infernoInfinity.commands;

import java.util.Map;

import e1013infernoInfinity.repository.Weapon;

public class PrintCommand extends BaceCommand {

	@Override
	public String execute() {
		Map<String, Weapon> weapons = super.getWeaponRepository().getAllWeapons();
		if (weapons.containsKey(super.getParams()[0])) {
			return weapons.get(super.getParams()[0]).toString();
		}
		return null;
	}

}
