package exercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomList<T extends Comparable<T>> implements Iterable<T> {

	private List<T> customList = new ArrayList<>();

	public void add(T element) {
		customList.add(element);
	}

	public void remove(int index) {
		customList.remove(index);
	}
	
	public boolean contains(T element){
		return customList.stream().anyMatch(x -> x.equals(element));
	}
	
	public void swap(int i1, int i2) {
		T element = customList.get(i1);
		customList.set(i1, customList.get(i2));
		customList.set(i2, element);
	}
	
	public int countGreaterThan(T element){
		int count = 0;
		for (T t : customList) {
			if (t.compareTo(element) > 0)
				count++;
		}
		return count;
	}
	
	public void print() {	
		forEach(System.out::println);
	}
	
	public T getMin() {	
		T minElement = customList.get(0);		
		for (int i = 1; i < customList.size(); i++) {
			minElement = minElement.compareTo(customList.get(i)) < 0 ? minElement : customList.get(i);
		}	
		return minElement;
	}
	
	public T getMax() {	
		T maxElement = customList.get(0);		
		for (int i = 1; i < customList.size(); i++) {
			maxElement = maxElement.compareTo(customList.get(i)) > 0 ? maxElement : customList.get(i);
		}	
		return maxElement;
	}

	public void sort() {
		customList.sort((el1, el2) -> el1.compareTo(el2));
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			private int currentIndex = 0;

			@Override
			public boolean hasNext() {
				return currentIndex < customList.size() && customList.get(currentIndex) != null;
			}

			@Override
			public T next() {
				return customList.get(currentIndex++);
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
}
