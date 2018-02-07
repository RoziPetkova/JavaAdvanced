package militaryElite;

public class Engineer extends SpecialisedSoldier {

	protected Engineer(String id, String firstName, String lastName, String salary, String corps) {
		super(id, firstName, lastName, salary, corps);
		// TODO Auto-generated constructor stub
	}
}


class Repair  {

    private String partName;
    private Integer hoursWorked;

    public Repair(String partName, Integer hoursWorked) {
        this.partName = partName;
        this.hoursWorked = hoursWorked;
    }

    public String getPartName() {
        return this.partName;
    }

    public Integer getHoursWorked() {
        return this.hoursWorked;
    }

    public String toString() {
        return String.format("Part Name: %s Hours Worked: %s",
                this.getPartName(),
                this.getHoursWorked());
    }
}