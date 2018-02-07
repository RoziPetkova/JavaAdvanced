package loggers;

import interfaces.Handler;

public abstract class LoggerImpl implements Handler {

    private Handler successor;

    protected void passToSuccessor(LogType type, String message) {
        if (successor != null) {
            successor.handle(type, message);
        }
    }

    @Override
    public abstract void handle(LogType logType, String message);

    @Override
    public void setSuccsessor(Handler handler) {
        this.successor = handler;
    }
}
