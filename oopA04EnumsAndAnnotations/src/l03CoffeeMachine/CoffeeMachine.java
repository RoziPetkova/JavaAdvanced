package l03CoffeeMachine;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {

	private List<Coffee> coffees; 
	private List<Coin> coins; 
	
	public CoffeeMachine() {
		coffees = new ArrayList<>();
		coins = new ArrayList<>();
	}
	
	public void buyCoffee(String size, String type){
		Coffee tobuy = new Coffee(CoffeeSize.valueOf(size.toUpperCase()),
														CoffeeType.valueOf(type.toUpperCase()));
		if(coins.stream().mapToInt(x -> x.getValue()).sum() >= tobuy.getSize().getPrice())
			coffees.add(tobuy);
			coins.clear();
	}
	
	public void insertCoin(String coin){
		this.coins.add(Coin.valueOf(coin.toUpperCase()));
	}
	
	public Iterable<Coffee>coffeesSold(){
		return coffees;
	}
}
