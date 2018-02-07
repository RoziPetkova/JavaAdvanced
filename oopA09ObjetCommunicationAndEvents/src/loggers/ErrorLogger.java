package loggers;

import loggers.LoggerImpl;

public class ErrorLogger extends LoggerImpl {

	@Override
	public void handle(LogType type, String message) {

		if (type == LogType.ERROR) {
			System.out.println(type.name() + ": " + message);
		} else {
			super.passToSuccessor(type, message);
		}
	}
}
