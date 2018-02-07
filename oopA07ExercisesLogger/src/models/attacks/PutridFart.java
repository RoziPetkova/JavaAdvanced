package models.attacks;

import interfaces.Blob;

public class PutridFart extends AbstractAttack {

	@Override
    public void execute(Blob attacker, Blob target) {
        target.setHealth(target.getHealth() - attacker.getDamage());
    }
}
