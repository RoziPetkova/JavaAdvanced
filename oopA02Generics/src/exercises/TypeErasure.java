package exercises;


public class TypeErasure<T> {

	public static void main(String[] args) {
		sum(new Double(1), new Double(2));
	//	List<? extends Number> asdf;
	}

	public static <T extends Number> int sum(T num1, T num2) {
		num1.getClass();
		if(num1 instanceof Double) {
			System.out.println("ebasi");
		}

		return 1;
	}
}