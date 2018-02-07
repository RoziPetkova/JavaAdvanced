package observers;

import interfaces.Blob;
import io.ConsoleOutputWriter;

public class TogglesBehaviorObserver extends Observer {

	public TogglesBehaviorObserver(Blob blob, ConsoleOutputWriter writer) {
		super(blob, writer);
	}

	@Override
	public void update() {
		super.getWriter()
				.writeLine(String.format("Blob %s toggled %sBehavior", 
						super.getBlob().getName(), super.getBlob().getBehavior().getClass().getSimpleName()));
	}
}
