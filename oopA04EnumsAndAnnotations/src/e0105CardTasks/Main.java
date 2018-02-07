package e0105CardTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import e0105CardTasks.enums.Rank;
import e0105CardTasks.enums.Suit;

public class Main {
	
//	private final static String PATH_PACKAGE = "e0105CardTasks.enums";
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
//		Tack 06 printing the annotation description and type for specific class.  
//
//		String classStr = reader.readLine();
//		Class<?> enumClass = Class.forName(PATH_PACKAGE + classStr);
//		CustomAnnotation annotation = enumClass.getAnnotation(CustomAnnotation.class);
//		System.out.println(String.format("Type = %s, Description = %s", annotation.type(), annotation.description()));
		
		
		Map<String, List<Card>> playersHands = new HashMap<>();
		CardDeck deck = new CardDeck();
		String player1 = reader.readLine();
		String player2 = reader.readLine();
		playersHands.put(player1, new ArrayList<Card>());
		playersHands.put(player2, new ArrayList<Card>());
		Card current = null;
		String line;
		
		for (int i = 0; i < 5; i++) {
			line = reader.readLine();
			addCard(player1, current, line, playersHands, deck);
		}
		for (int i = 0; i < 5; i++) {
			line = reader.readLine();
			addCard(player2, current, line, playersHands, deck);
		}
		
		String winnerName = biggestCard(playersHands.get(player1)).getCardPower() 
								> biggestCard(playersHands.get(player2)).getCardPower() ? player1 : player2;
		
		System.out.println(winnerName + " wins with " + biggestCard(playersHands.get(winnerName)).getCardName() + "." );
	
	}
	
	public static void addCard(String player, Card current, String line, Map<String, List<Card>> playersHands, CardDeck deck) {
		try {
			current = new Card(Rank.valueOf(line.split("\\s+")[0]), Suit.valueOf(line.split("\\s+")[2]));

			if (deck.getDeck().contains(current)) {
				deck.getDeck().remove(current);
				playersHands.get(player).add(current);
			} else {
				
				System.out.println("Card is not in the deck.");
			}
		} catch (Exception e) {
			System.out.println("No such card exists.");
		}
	}
	
	public static Card biggestCard(List<Card> persinaDeck) {
		return persinaDeck.stream().reduce((x, y) -> x.getCardPower() > y.getCardPower() ? x : y).get();
	}
}
