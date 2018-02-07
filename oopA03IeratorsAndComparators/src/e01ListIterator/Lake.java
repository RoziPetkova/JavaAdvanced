package e01ListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {
	private List<Integer> numbers;
	
	
	public List<Integer> getNumbers() {
		return numbers;
	}

	public Lake() {
		numbers = new ArrayList<>();
	}
	
	public void setNumbers(String... numbers) {
		for (String integer : numbers) {
			this.numbers.add(Integer.parseInt(integer));
		}
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			public int currentIndex = 0;	
			@Override
			public boolean hasNext() {
				return currentIndex < numbers.size() && numbers.get(currentIndex) != null ; 
			}
			@Override
			public Integer next() {
				return numbers.get(currentIndex++);
			}
		};
	}
}
