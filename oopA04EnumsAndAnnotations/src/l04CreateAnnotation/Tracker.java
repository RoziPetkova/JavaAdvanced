package l04CreateAnnotation;

public class Tracker {

	@Author(name = "Pesho")
	public static void printMethodsByAuthor(Class<?> cl){
		
	}
	
	@Author(name = "Pesho")
	public static void main(String[] args) {
		Tracker.printMethodsByAuthor(Tracker.class);
	}
}
