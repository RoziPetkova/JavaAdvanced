package l02WearningLevels;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Logger {
	
	private List<Message> messages; 
	private Importance importance;
	
	public Logger(String importance) {
		messages = new ArrayList<>();
		this.importance = Importance.valueOf(importance.toUpperCase());
	}
	
	public void receiveMessage(String importance, String message){
		if(this.importance.getValue() <= Importance.valueOf(importance.toUpperCase()).getValue())
			messages.add(new Message(message, importance));
	}
	
	public Importance getImportance() {
		return importance;
	}
	
	public Iterable<Message> getMessages() {
		return Collections.unmodifiableCollection(messages);
	}
}
