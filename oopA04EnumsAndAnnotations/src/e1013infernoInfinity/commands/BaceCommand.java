package e1013infernoInfinity.commands;

import e1013infernoInfinity.annotations.Inject;
import e1013infernoInfinity.repositories.Repository;
import e1013infernoInfinity.repository.Weapon;

public abstract class BaceCommand implements Executable {

	@Inject
	private String[] params;
	@Inject
	private Repository<Weapon> weapons;

	protected BaceCommand() {
	}

	public String[] getParams() {
		return this.params;
	}

	public Repository<Weapon> getWeaponRepository() {
		return this.weapons;
	}

}
