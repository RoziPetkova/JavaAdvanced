package l03CoffeeMachine;

public class Coffee {

	private CoffeeSize size;
	private CoffeeType type;
	
	public Coffee(CoffeeSize size, CoffeeType type) {
		this.size = size;
		this.type = type;
	} 
	
	public CoffeeType getType() {
		return type;
	}
	
	public CoffeeSize getSize() {
		return size;
	}
	

    public int getPrice() {
        return this.size.getPrice();
    }
	
	 @Override
	    public String toString() {
	        return this.size + " " + this.type;
	    }
}
