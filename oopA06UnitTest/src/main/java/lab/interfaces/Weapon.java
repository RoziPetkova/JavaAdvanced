package lab.interfaces;

import lab.Dummy;

public interface Weapon {
//	public int attackPoints;
//	public int durabilityPoints;

	public int getDurabilityPoints();

	public void attack(Dummy target);

	public void takeAttack(Target attackPoints);

}
