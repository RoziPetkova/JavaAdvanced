package P01_ExtendedArrayList;

import java.util.ArrayList;

public class ExtendedArrayList<T extends Comparable<T>> extends ArrayList<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public T max() {
		T maxElement = super.get(0);

		while (super.iterator().hasNext()) {
			T next = iterator().next();
			if (maxElement.compareTo(next) > 0)
				maxElement = next;
		}
		
		return maxElement;
	}
}