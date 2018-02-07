package l01Weekdays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WeeklyCalendar {
	
	List<WeeklyEntry> entries;
	
	public WeeklyCalendar() {
		entries = new ArrayList<WeeklyEntry>();
	}
	
	public void addEntry(String weekday, String notes){
		entries.add(new  WeeklyEntry(weekday, notes));
	}
	
	public Iterable<WeeklyEntry> getWeeklySchedule(){
		 entries.sort(Comparator.naturalOrder());
		 return entries;
	}
}
