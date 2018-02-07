package p09LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomList<T extends Comparable<T>> implements Iterable<T> {

	private List<T> customList = new ArrayList<>();

	public void add(T element) {
		customList.add(element);
	}

	public boolean remove(T element) {
		return customList.remove(element);
	}
	public int getSize() {
		return customList.size();
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
	
	@SuppressWarnings({ "unchecked"})
	@Override
	public boolean equals(Object obj) {
		if (this.getClass() != obj.getClass())
			return false;
		T toCompare = (T) obj;
		if (this == toCompare)
			return true;
		return false;
	}
}
