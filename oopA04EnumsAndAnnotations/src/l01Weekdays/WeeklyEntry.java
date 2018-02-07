package l01Weekdays;

public class WeeklyEntry implements Comparable<WeeklyEntry>{
	private Weekday day;
	private String note;
	
	public WeeklyEntry(String day, String note) {
		this.day = Weekday.valueOf(day.toUpperCase());
		this.note = note;
	}
	
	public String getNote() {
		return note;
	}

	@Override
	public int compareTo(WeeklyEntry o) {
		return day.compareTo(o.day);
	}
	
	@Override
	public String toString() {
		return day.toString() + " - " + note;
	}
}
