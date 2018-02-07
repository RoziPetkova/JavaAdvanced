package interfaces;

import loggers.LogType;

public interface Handler {

	void handle(LogType logType, String message);
	void setSuccsessor(Handler handler);
}
