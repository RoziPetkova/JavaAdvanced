package l02WearningLevels;

// values can be more than one, 
// int something
// string something
//... so when you create set the enum to one of the constants all of its values are given to the constructor and are set.
public enum Importance {
	LOW(0), NORMAL(1), MEDIUM(2), HIGH(3); //values or just use their indexes

	private int value;
	
	private Importance(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
