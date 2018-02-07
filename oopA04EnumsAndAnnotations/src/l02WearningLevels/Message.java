package l02WearningLevels;

public class Message {

	private String message;
	private String importanceStr;
	
	public Message(String message, String importanceStr) {
		this.message = message;
		this.importanceStr = importanceStr;
	}

	public String getMessage() {
		return message;
	}
	
	public String getImportanceStr() {
		return importanceStr;
	}
	
	@Override
	public String toString() {
		return importanceStr + ": " + message;
	}
}
