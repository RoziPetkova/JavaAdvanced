package l03GenericScale;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Integer> toCompare = new ArrayList<>();
		Collections.addAll(toCompare, 1,2,3,5,4,9);
		System.out.println(ListUtils.getMax(toCompare));
		System.out.println(ListUtils.getMin(toCompare));	
		
	}
}
