package l03GenericScale;

import java.lang.reflect.Array;

public class ArrayCreator {	
	
	@SuppressWarnings({ "unchecked", "unused", })
	public static <T> T[] create(int length, T item){
		Object[] objects = new Object[length];
		
		for (Object object : objects) {
			object = item;
			System.out.println("ajkdh");
		}
		return (T[])objects;
	}
	
	
	
	@SuppressWarnings({ "unchecked", "unused" })
	public static <T> T[] create(Class<T> theClass, int length, T item){
		
		T[] objects = (T[]) Array.newInstance(theClass, length);
		
		for (Object object : objects) {
			object = item;
			System.out.println("gsdgsdg");
		}
		
		return objects;
	}
}
