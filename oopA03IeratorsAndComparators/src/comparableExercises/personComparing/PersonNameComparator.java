package comparableExercises.personComparing;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().length() > o2.getName().length() ? 1 :
			   o1.getName().length() < o2.getName().length() ? - 1
			:  o1.getName().compareToIgnoreCase(o2.getName());
			
	}

}
