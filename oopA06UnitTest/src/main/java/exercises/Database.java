package exercises;

import java.util.ArrayList;
import java.util.List;

public class Database {

	List<Integer> integers;

	public Database() {
		integers = new ArrayList<Integer>();
	}

	public void add(int a) {
		integers.add(a);
	}

	public void remove(int a) {
		int index = 0;
		for (int i = 0; i < integers.size(); i++) {
			if (integers.get(i) == a) {
				index = i;
				break;
			}
		}
		integers.remove(index);
	}

	public List<Integer> getintegers() {
		return integers;
	}
}
