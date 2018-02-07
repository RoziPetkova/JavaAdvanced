package e1013infernoInfinity.commands;

import java.util.Map;

import e1013infernoInfinity.repository.Weapon;

public class CompareCommand extends BaceCommand {

	@Override
	public String execute() {
		Map<String, Weapon> weapons = super.getWeaponRepository().getAllWeapons();
		if (weapons.containsKey(super.getParams()[0]) && weapons.containsKey(super.getParams()[1]))
			return Weapon.printComparingResult(Weapon.compare(weapons.get(super.getParams()[0]), weapons.get(super.getParams()[1])));

		return null;
	}

}
