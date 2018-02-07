package observers;

import interfaces.Blob;
import io.ConsoleOutputWriter;

public abstract class Observer {

	private Blob blob;
	private ConsoleOutputWriter writer;

	public Observer(Blob blob, ConsoleOutputWriter writer) {
		this.blob = blob;
		this.writer = writer;
	}

	protected ConsoleOutputWriter getWriter() {
		return this.writer;
	}

	protected Blob getBlob() {
		return this.blob;
	}

	public abstract void update();
}
