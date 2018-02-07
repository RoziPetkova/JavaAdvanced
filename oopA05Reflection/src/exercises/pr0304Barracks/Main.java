package exercises.pr0304Barracks;

import exercises.pr0304Barracks.contracts.CommandInterpreter;
import exercises.pr0304Barracks.contracts.Repository;
import exercises.pr0304Barracks.contracts.UnitFactory;
import exercises.pr0304Barracks.core.Engine;
import exercises.pr0304Barracks.core.commands.Invoker;
import exercises.pr0304Barracks.core.factories.UnitFactoryImpl;
import exercises.pr0304Barracks.data.UnitRepository;

public class Main {

	public static void main(String[] args) {
		Repository repository = new UnitRepository();
		UnitFactory unitFactory = new UnitFactoryImpl();
		Invoker invoker  = new Invoker();
		CommandInterpreter interpret = new exercises.pr0304Barracks.core.commands.CommandInterpreter();
		Runnable engine = new Engine(repository, unitFactory, invoker, interpret);
		engine.run();
	}
}
