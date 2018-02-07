package petClinics;

public class Room {	
	private Pet pet;
	
	public Pet getPet() {
		return pet;
	}
	
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	 @Override
	    public String toString() {
		 return isEmpty() ? "Room empty" : pet.toString();
	    }
	 
	 public boolean isEmpty() {
		 return pet == null;
	 }
}