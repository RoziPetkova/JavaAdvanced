package lab;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
//	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		// Task 01
//		Class aclass = Reflection.class;
//		System.out.println("class " + aclass.getSimpleName());
//		System.out.println(aclass.getSuperclass());
//		Class[] interfaces = aclass.getInterfaces();
//		for (Class class1 : interfaces) {
//			System.out.println(class1);
//		}
//		Reflection ref = (Reflection)aclass.newInstance();
//		System.out.println(ref);
		
		
		//Task 02
//		Arrays.stream(Reflection.class.getDeclaredMethods())
//			.filter(method -> method.getName().startsWith("get"))
//				.sorted(Comparator.comparing(Method::getName))
//				.forEach(m -> System.out.println(m.getName() + " will return " + m.getReturnType()));
//		
//		Arrays.stream(Reflection.class.getDeclaredMethods())
//		.filter(method -> method.getName().startsWith("set"))
//			.sorted(Comparator.comparing(Method::getName))
//			.forEach(m -> System.out.println(m.getName() + " and will set field of " + m.getParameterTypes()[0]));
//		
		
		// Task03	
		Class<Reflection> aclacc = Reflection.class;
		
		List<Field> fields = Arrays.stream(aclacc.getDeclaredFields())
		.sorted(new Comparator<Field>() {
			@Override
			public int compare (Field o1, Field o2){
				return o1.getName().compareTo(o2.getName());
			}
		}).collect(Collectors.toList());
		
		for (Field field : fields) {
			if(!Modifier.isPrivate(field.getModifiers()))
				System.out.println(field.getName() + " must be private!");
		}
		
		List<Method> methods = Arrays.stream(aclacc.getDeclaredMethods()).sorted(new Comparator<Method>() {
			@Override
			public int compare (Method o1, Method o2){
				return o1.getName().compareTo(o2.getName());
			}
		}).collect(Collectors.toList());
		
		
		for (Method method : methods) {
			if(!(Modifier.isPublic(method.getModifiers())) 
					&& method.getName().startsWith("get"))
				System.out.println(method.getName() + " have to be public!");
		}
		
		for (Method method : methods) {
			if(!(Modifier.isPrivate(method.getModifiers())) 
					&& method.getName().startsWith("set"))
				System.out.println(method.getName() + " have to be private!");
		}
	}
}
