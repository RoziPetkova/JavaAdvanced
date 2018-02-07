package exercises.pr0304Barracks.core.commands;

import exercises.pr0304Barracks.contracts.Executable;
import exercises.pr0304Barracks.contracts.Inject;
import exercises.pr0304Barracks.contracts.Repository;
import exercises.pr0304Barracks.contracts.UnitFactory;

public abstract class Command implements Executable {

	@Inject
	String[] data;
	@Inject
	private Repository repository;
	@Inject
	private UnitFactory unitFactory;

	protected Command() {
	}

	protected Repository getRepository() {
		return repository;
	}

	protected String[] getData() {
		return data;
	}

	protected UnitFactory getUnitFactory() {
		return unitFactory;
	}

}
