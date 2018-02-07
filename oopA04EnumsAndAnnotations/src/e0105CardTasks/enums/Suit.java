package e0105CardTasks.enums;

import e0105CardTasks.CustomAnnotation;

//Ordinal value: 0; Name value: CLUBS
//Ordinal value: 1; Name value: DIAMONDS
//Ordinal value: 2; Name value: HEARTS
//Ordinal value: 3; Name value: SPADES

@CustomAnnotation(category = "Suit", description = "Provides suit constants for a Card class.")
public enum Suit {          
     CLUBS(0),  
     DIAMONDS(13),
     HEARTS(26),   
     SPADES(39);
	
	private int ordinalValue;
	
	private Suit(int value) {
		ordinalValue = value;
	}
	
	public int getOrdinalValue() {
		return ordinalValue;
	}
}