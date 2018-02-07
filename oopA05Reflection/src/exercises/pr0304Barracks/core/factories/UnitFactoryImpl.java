package exercises.pr0304Barracks.core.factories;

import java.lang.reflect.InvocationTargetException;

import exercises.pr0304Barracks.contracts.Unit;
import exercises.pr0304Barracks.contracts.UnitFactory;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME = "exercises.pr0304Barracks.models.units.";

	@Override
	public Unit createUnit(String unitType) {

		Class<?> unitClass;
		Unit unit = null;

		try {
			unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
			unit = (Unit) unitClass.getConstructor().newInstance();

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		return unit;
	}
}
