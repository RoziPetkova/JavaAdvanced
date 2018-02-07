package observers;

import interfaces.Blob;
import io.ConsoleOutputWriter;

public class DeadBlobObserver extends Observer {

	public DeadBlobObserver(Blob blob, ConsoleOutputWriter writer) {
		super(blob, writer);
	}

	@Override
	public void update() {
		super.getWriter().writeLine(String.format("Blob %s was killed", super.getBlob().getName()));
	}
}
