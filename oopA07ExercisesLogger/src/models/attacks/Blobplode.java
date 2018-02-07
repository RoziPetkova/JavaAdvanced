package models.attacks;

import interfaces.Blob;

public class Blobplode extends AbstractAttack {

	private static final int BLOBPLODE_DAMAGE_MULTIPLIER = 2;
	private static final int BLOBPLODE_HEALTH_DIVIDER = 2;

	@Override
	public void execute(Blob attacker, Blob target) {
	    attacker.setHealth(attacker.getHealth() - (attacker.getHealth() / BLOBPLODE_HEALTH_DIVIDER));
        target.setHealth(target.getHealth() - (attacker.getDamage() * BLOBPLODE_DAMAGE_MULTIPLIER));
	}
}
