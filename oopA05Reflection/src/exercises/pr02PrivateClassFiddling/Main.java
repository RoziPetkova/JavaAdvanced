package exercises.pr02PrivateClassFiddling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import exercises.pr02PrivateClassFiddling.com.peshoslav.BlackBoxInt;

public class Main {

	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;

		final String TERMINATIND_COMMAND = "END";

		Class<BlackBoxInt> theClass = BlackBoxInt.class;
		Constructor<BlackBoxInt> constructor = theClass.getDeclaredConstructor(int.class);
		constructor.setAccessible(true);
		BlackBoxInt integer = constructor.newInstance(0);

		while ((line = reader.readLine()) != null && !(line.equals(TERMINATIND_COMMAND))) {
			String[] params = line.split("_");
			executeCommand(params[0], params[1], integer);

			Field intField = integer.getClass().getDeclaredField("innerValue");
			intField.setAccessible(true);

			System.out.println(intField.getInt(integer));

		}

	}

	public static void executeCommand(String command, String numStr, BlackBoxInt integer)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		int number = Integer.parseInt(numStr);
		Method theMethod;
		switch (command) {
		case "add":
			theMethod = BlackBoxInt.class.getDeclaredMethod("add", int.class);
			theMethod.setAccessible(true);
			theMethod.invoke(integer, number);
			break;
		case "subtract":
			theMethod = BlackBoxInt.class.getDeclaredMethod("subtract", int.class);
			theMethod.setAccessible(true);
			theMethod.invoke(integer, number);
			break;
		case "multiply":
			theMethod = BlackBoxInt.class.getDeclaredMethod("multiply", int.class);
			theMethod.setAccessible(true);
			theMethod.invoke(integer, number);
			break;
		case "divide":
			theMethod = BlackBoxInt.class.getDeclaredMethod("divide", int.class);
			theMethod.setAccessible(true);
			theMethod.invoke(integer, number);
			break;
		case "leftShift":
			theMethod = BlackBoxInt.class.getDeclaredMethod("leftShift", int.class);
			theMethod.setAccessible(true);
			theMethod.invoke(integer, number);
			break;
		case "rightShift":
			theMethod = BlackBoxInt.class.getDeclaredMethod("rightShift", int.class);
			theMethod.setAccessible(true);
			theMethod.invoke(integer, number);
			break;
		default:
			break;
		}
	}
}
