package exercises;

import java.util.List;

public class Methods {
	
	public static <E>  void swap(List<E> list, int i1, int i2) {
		E element = list.get(i1);
		list.set(i1, list.get(i2));
		list.set(i2, element);
	}
	
	public static <T extends Comparable<T>> int count(List<T> list, T e1) {
		int counter = 0;
		
		for (T t : list) {
			if(e1.compareTo(t) < 0)
				counter++;
		}
		return counter; 
	}
}
