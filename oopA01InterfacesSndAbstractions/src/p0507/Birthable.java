package p0507;


public abstract class Birthable {
		
	private String bitrhDay;
	
	public Birthable(String bitrhDay) {
		this.bitrhDay = bitrhDay;
	}
	
	public String getBitrhDay() {
		return bitrhDay;
	}
	public boolean isBurthinYear(String year) {
		return bitrhDay.endsWith(year);
	}
}
