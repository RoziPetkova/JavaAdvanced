package militaryElite;

public class Private extends Soldier {

	double salary;
	
	protected Private(String id, String firstName, String lastName, String salary) {
		super(id, firstName, lastName);
		this.salary = Double.parseDouble(salary);
	}

}
