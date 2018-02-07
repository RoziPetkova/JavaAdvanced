package e1013infernoInfinity.repository;

import java.util.Arrays;

import e1013infernoInfinity.annotations.BasicCustomInfo;


@BasicCustomInfo(author = "Pesho", revision = 3, description = "Used for Java OOP Advanced course - Enumerations and Annotations.", 
																											reviewers = { "Pesho", "Svetlio" })


public class Weapon implements Comparable<Weapon> {
	private WeaponTypes type;
	String name;
	private int pstrength = 0;
	private int pagility = 0;
	private int pvitality = 0;
	int personalMinDamage;
	int personalMaxDamage;

	public Weapon(String type, String name) {
		this.type = WeaponTypes.valueOf(type);
		this.name = name;
		personalMaxDamage = this.type.getInitialMaxDamage();
		personalMinDamage = this.type.getInitialMinDamage();
	}

	public void addGem(int index, String gemTypeStr) {
		if (index < type.getSockets().length && Arrays.stream(Gem.values()).map(Gem::name).anyMatch(x -> x.equals(gemTypeStr))) {
			type.getSockets()[index] = Gem.valueOf(gemTypeStr);
			pstrength += Gem.valueOf(gemTypeStr).getStrength();
			pagility += Gem.valueOf(gemTypeStr).getAgility();
			pvitality += Gem.valueOf(gemTypeStr).getVitality();
		}
	}

	private int sumMinDamage() {
		return personalMinDamage + pstrength * 2 + pagility;
	}

	private int sumMaxDamage() {
		return personalMaxDamage + pstrength * 3 + pagility * 4;
	}

	public int getPvitality() {
		return pvitality;
	}
	
	public String getName() {
		return name;
	}

	public void removeGem(int index) {
		if (index < type.getSockets().length && type.getSockets()[index] != null) {
			pstrength -= type.sockets[index].getStrength();
			pagility -= type.sockets[index].getAgility();
			pvitality -= type.sockets[index].getVitality();
			this.type.sockets[index] = null;
		}
	}

	public static Weapon compare(Weapon first, Weapon second) {
		return first.compareTo(second) == 1 ? first : second;
	}
	
	public static String printComparingResult(Weapon greater ) {
		return greater.toString() + String.format(" (Item Level: %s)",
				((double)(greater.sumMaxDamage() + greater.sumMinDamage()) / 2) + greater.pstrength + greater.pagility + greater.pvitality );
	}

	@Override
	public String toString() {
		return String.format("%s: %s-%s Damage, +%s Strength, +%s Agility, +%s Vitality", 
				name, sumMinDamage(), sumMaxDamage(), pstrength, pagility, pvitality);

	}


	@Override
	public int compareTo(Weapon o) {
		return ((double)(sumMaxDamage() + sumMinDamage()) / 2) + pstrength + pagility + pvitality 
				> ((double)(o.sumMaxDamage() + o.sumMinDamage()) / 2) + o.pstrength +  o.pagility +  o.pvitality ? 1 : 0;
	}
}
