package exercises.pr0304Barracks.models.units;

public class Gunner extends AbstractUnit {

	private static final int PIKEMAN_HEALTH = 20;
	private static final int PIKEMAN_DAMAGE = 20;

	public Gunner() {
		super(PIKEMAN_HEALTH, PIKEMAN_DAMAGE);
	}
}
