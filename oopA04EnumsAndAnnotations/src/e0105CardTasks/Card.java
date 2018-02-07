package e0105CardTasks;

import e0105CardTasks.enums.Rank;
import e0105CardTasks.enums.Suit;

public class Card implements Cards, Comparable<Card> {

	private Rank rank;
	private Suit suit;
	private String cardName;
	
	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
		cardName = rank.name() + " of " + suit.name();
	}
	
	@Override
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
	@Override
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
	@Override
	public Rank getRank() {
		return rank;
	}
	
	@Override
	public String getCardName() {
		return cardName;
	}
	
	@Override
	public int getCardPower(){
		return rank.getCardPower() + suit.getOrdinalValue();
	}
	
	@Override
	public String toString() {
		return String.format("Card name: %s; Card power: %s\n", getCardName(), getCardPower());
	}

	@Override
	public int compareTo(Card o) {
		return getCardPower() < o.getCardPower() ? -1 :
				getCardPower() > o.getCardPower() ? 1 : 0;	
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!obj.getClass().equals(this.getClass()))
			return false;
		Card objCard = (Card) obj;
		return this.cardName.equals(objCard.cardName);
	}
}
