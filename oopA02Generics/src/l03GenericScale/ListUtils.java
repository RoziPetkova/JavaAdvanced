package l03GenericScale;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {
	
	
	public static <T extends Comparable<T>> T getMin(List<T> listche) {
		if(listche.isEmpty())
			throw new IllegalArgumentException();
		
		T minElement = listche.get(0);		
		for (int i = 1; i < listche.size(); i++) {
			minElement = minElement.compareTo(listche.get(i)) < 0 ? minElement : listche.get(i);
		}
		
		return minElement;
	}
		
	public static <T> void flatten(List<? super T> destination, List<List<? extends T>> sourse){
		for (List<? extends T> list : sourse) {
			destination.addAll(list);
		}
	}
		
	public static <T> void addAll(List<? super T> destination, List<? extends T> sourse) {
		destination.addAll(sourse);
	}

	public static <T extends Comparable<T>> T getMax(List<T> listche) {
		if (listche.isEmpty())
			throw new IllegalArgumentException();

		T maxElement = listche.get(0);
		for (int i = 1; i < listche.size(); i++) {
			maxElement = maxElement.compareTo(listche.get(i)) > 0 ? maxElement : listche.get(i);
		}

		return maxElement;
	}

	public static List<Integer> getNullIndices(List<?> list) {

		List<Integer> nulls = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == null)
				nulls.add(i);
		}
		return nulls;
	}
}
