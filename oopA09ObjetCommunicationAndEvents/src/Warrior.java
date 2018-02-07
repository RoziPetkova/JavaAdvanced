import interfaces.Target;

public class Warrior extends AbstractHero {

    private static final String ATTACK_MESSAGE = "%s damages %s for %s";

    public Warrior(String id, int dmg) {
        super(id, dmg);
    }

    @Override
    protected void executeClassSpecificAttack(Target target, int dmg) {
        System.out.println(String.format(ATTACK_MESSAGE, this, target, dmg));
        target.receiveDamage(dmg);
    }

	@Override
	public void setTarget(java.lang.annotation.Target target) {
		// TODO Auto-generated method stub
		
	}
}
