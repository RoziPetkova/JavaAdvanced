package comparableExercises.personComparing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// String line;
		int index = Integer.parseInt(reader.readLine()) - 1;
		Set<Person> persons = new TreeSet<>();
		Set<Person> personsHashset = new HashSet<>();

		// while ((line = reader.readLine()) != null && !line.equals("END")) {
		// String[] params = line.split("\\s");
		// persons.add(new Person(params[0], params[2],
		// Integer.parseInt(params[1])));
		// }

		while (index >= 0) {
			String[] params = reader.readLine().split("\\s");
			Person pepi = new Person(params[0], Integer.parseInt(params[1]));
			
			persons.add(pepi);
			personsHashset.add(pepi);
			
			index--;
		}
		
		System.out.println(persons.size());
		System.out.println(personsHashset.size());
	}
}
