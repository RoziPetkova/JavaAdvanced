package exercises;

public class GenericBox<T extends Comparable<T>>  {

	private T value;

	public GenericBox(T value) {
		super();
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value.getClass().getName() + ": " +  value;
	}
}
