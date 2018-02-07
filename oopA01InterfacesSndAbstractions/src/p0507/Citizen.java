package p0507;

public class Citizen extends Birthable implements OwnsID, Person, Buyer {

	private String id;
	private String name;
	private int age;
	int foodAmmound;
	
	public Citizen(String name, int age, String id, String bitrhDay) {
		super(bitrhDay);
		this.age = age;
		this.name = name;
		this.id =id;
	}

	public String getId() {
		return id;
	}

	@Override
	public boolean corectID(String number) {
		return id.endsWith(number);
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void buyFood() {
		foodAmmound += 10;
	}

	@Override
	public int getFoodAmmound() {
		return foodAmmound;
	}
}
