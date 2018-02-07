package factories;

import java.lang.reflect.InvocationTargetException;

import interfaces.Behavior;

public final class BehaviorFactory {

	private final static String BEHAVIOR_PATH_ = "models.behavors.";
	private static Behavior behavior;
	
	public static Behavior generateBehavior(String behavName) throws ClassNotFoundException, IllegalArgumentException, InvocationTargetException, SecurityException, InstantiationException, IllegalAccessException{
		@SuppressWarnings("unchecked")
		Class<? extends Behavior> aclass = (Class<? extends Behavior>) Class.forName(BEHAVIOR_PATH_ + behavName);
		behavior = (Behavior) aclass.getDeclaredConstructors()[0].newInstance();
		return behavior;
	}
}
