package p0507;

public class Rable implements Buyer{
	
	
	int foodAmmound;
	private String name;
	private String group;
	private int age;

	public Rable(String name, int age, String group) {
		this.age = age;
		this.name = name;
		this.group = group;
	}
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	
	public String getGroup() {
		return group;
	}
	
	@Override
	public void buyFood() {
		foodAmmound +=5;
	}

	@Override
	public int getFoodAmmound() {
		return foodAmmound;
	}
}
