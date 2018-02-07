package exercises;

public class Threeuple <K, V, P> {

	private K item1;
	private V item2;
	private P item3;
	
	public Threeuple(K item1, V item2, P item3) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
	}
	
	public K getItem1() {
		return item1;
	}

	public P getItem3() {
		return item3;
	}

	public V getItem2() {
		return item2;
	}
	
}