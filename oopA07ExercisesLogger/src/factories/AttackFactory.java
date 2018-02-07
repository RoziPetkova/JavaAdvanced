package factories;

import java.lang.reflect.InvocationTargetException;

import interfaces.Attack;

public final class AttackFactory {

	private final static String COMMAND_PATH_ = "models.attacks.";
	private static Attack attack;
	
	public static Attack generateAttac(String attackName) throws ClassNotFoundException, IllegalArgumentException, InvocationTargetException, SecurityException, InstantiationException, IllegalAccessException{
		@SuppressWarnings("unchecked")
		Class<? extends Attack> aclass = (Class<? extends Attack>) Class.forName(COMMAND_PATH_ + attackName);
		attack = (Attack) aclass.getDeclaredConstructors()[0].newInstance();
		return attack;
	}
}
