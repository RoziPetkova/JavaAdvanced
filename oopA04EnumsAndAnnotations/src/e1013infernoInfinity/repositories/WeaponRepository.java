package e1013infernoInfinity.repositories;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import e1013infernoInfinity.repository.Weapon;

public class WeaponRepository<T extends Weapon> implements Repository<Weapon>{
	
	private Map<String, Weapon> weapons;
	
	public WeaponRepository() {
		this.weapons = new HashMap<>();
	}

	@Override
	public Map<String, Weapon> getAllWeapons() {
		return Collections.unmodifiableMap(weapons);
	}

	@Override
	public void add(Weapon element) {
		weapons.putIfAbsent(element.getName(), element);
	}

	@Override
	public void remove(Weapon element) {
		if(weapons.containsKey(element.getName()))
			weapons.remove(element.getName());
	}
}
