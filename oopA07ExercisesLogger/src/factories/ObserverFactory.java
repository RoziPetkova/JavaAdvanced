package factories;

import interfaces.Blob;
import io.ConsoleOutputWriter;
import observers.DeadBlobObserver;
import observers.Observer;
import observers.TogglesBehaviorObserver;

public final class ObserverFactory {

	private ObserverFactory() {
	}

	public static Observer createDeadBlobObserver(Blob blob, ConsoleOutputWriter writer) {
		return new DeadBlobObserver(blob, writer);
	}

	public static Observer createTogglesBehaviorObserver(Blob blob, ConsoleOutputWriter writer) {
        return new TogglesBehaviorObserver(blob, writer);
    }
	}