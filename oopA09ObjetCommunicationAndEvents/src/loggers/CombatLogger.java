package loggers;

public abstract class CombatLogger extends LoggerImpl {

	@Override
	public void handle(LogType logType, String message) {

		if (logType == LogType.ATTACK || logType == LogType.MAGIC) {
			System.out.println(logType.name() + ": " + message);
		} else {
			super.passToSuccessor(logType, message);
		}
	}

}
