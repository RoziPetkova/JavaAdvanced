package e0105CardTasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import e0105CardTasks.enums.Rank;
import e0105CardTasks.enums.Suit;

public class CardDeck implements Iterable<Card> {

	List<Card> deck;

	public CardDeck() {
		deck = new ArrayList<>();
		createDeck();
	}

	private void createDeck() {
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				this.deck.add(new Card(rank, suit));
			}
		}
	}
	
	public List<Card> getDeck() {
		return deck;
	}

	@Override
	public Iterator<Card> iterator() {
		return new Iterator<Card>() {
		int currentCardIndex = 0;
						
			@Override
			public boolean hasNext() {
				return deck.get(currentCardIndex) != null && currentCardIndex< deck.size();
			}
			
			@Override
			public Card next() {
				return deck.get(currentCardIndex++);
			}
		};
	}
}
