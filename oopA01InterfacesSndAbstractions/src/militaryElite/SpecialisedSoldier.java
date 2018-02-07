package militaryElite;

public class SpecialisedSoldier extends Private {
	

	private Corps corps;
	
	protected SpecialisedSoldier(String id, String firstName, String lastName, String salary, String corps) {
		super(id, firstName, lastName, salary);
		this.setCorps(corps);
	}

	private void setCorps(String corps) {
		this.corps = corps.equals("Airforces") ? Corps.Aiforces 
				: corps.equals("Marines") ? Corps.Marines : null;
		if (this.corps == null)
			throw new IllegalArgumentException();
	}
}
enum Corps{Aiforces, Marines }