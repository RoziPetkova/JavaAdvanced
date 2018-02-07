package appenders;

import interfaces.Appender;
import interfaces.Layout;

public abstract class BaseAppender implements Appender {
	    private Layout layout;
	    protected int messagesCount = 0;

	    BaseAppender(Layout layout) {
	        this.layout = layout;
	    }

	    @Override
	    public String toString() {
	        StringBuilder builder = new StringBuilder();
	        builder.append("Appender type: ");
	     //   builder.append(String.format("%s, Layout type: %s, Report level: %s, ", this.getClass().getSimpleName(), this.getLayout().getClass().getSimpleName(), this.getLevel().name()));
	        builder.append(String.format("Messages appended: %d", this.messagesCount));
	        return builder.toString();
	    }

	
	    @Override
	    public Layout getLayout() {
	        return layout;
	    }
}
