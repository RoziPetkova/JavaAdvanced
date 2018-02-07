package exercises;

public class Tuple<K, V> {

	private K item1;
	private V item2;
	
	
	
	public Tuple(K item1, V item2) {
		super();
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public K getItem1() {
		return item1;
	}

	public V getItem2() {
		return item2;
	}

}
