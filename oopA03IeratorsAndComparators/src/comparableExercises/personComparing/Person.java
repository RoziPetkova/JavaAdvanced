package comparableExercises.personComparing;

import java.util.Objects;

public class Person implements Comparable<Person> {

	private String name;
	private String town;
	private Integer age;

	public Person(String name, String town, int age) {
		this.name = name;
		this.town = town;
		this.age = age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getTown() {
		return town;
	}

	public int getAge() {
		return age;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (!(obj instanceof Person))
			return false;

		Person p = (Person) obj;
		return age.equals(p.getAge()) && name.equals(p.getName());

	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.getName()) == 0 ? age.compareTo(o.getAge()) 
				: name.compareTo(o.getName());
		//return this.name.compareTo(o.getName()) == 0 ? age.compareTo(o.getAge()) == 0 ? town.compareTo(o.getTown()) : 1 : 1;
	}
}
