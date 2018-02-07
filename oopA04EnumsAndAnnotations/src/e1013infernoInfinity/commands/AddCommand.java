package e1013infernoInfinity.commands;

import java.util.Map;

import e1013infernoInfinity.repository.Weapon;

public class AddCommand extends BaceCommand {

	@Override
	public String execute() {
		Map<String, Weapon> weapons = super.getWeaponRepository().getAllWeapons();
		if (weapons.containsKey(super.getParams()[0]))
			weapons.get(super.getParams()[0]).addGem(Integer.parseInt(super.getParams()[1]), super.getParams()[2]);

		return null;
	}

}
