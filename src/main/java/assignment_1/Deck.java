package assignment_1;

import java.util.*;


public class Deck {
	// Variables for card values 
	
	List<Cards> deck;
	
	public String[] suit = {
			"C", "D", "H", "S"	
		};
		
	
	public Deck() {
		// initializing deck
		deck = new ArrayList<Cards>();
		for (int i = 0; i < 52; i++) {
			for (int j = 0; j < suit.length; j++) {
				deck.add(new Cards(i, suit[j]));
			}
		}
		//fixing deck values 
		for (int i = 0; i < 52; i++) {
			if ((deck.get(i).getValue() >= 11) & (deck.get(i).getValue() < 13)) {
				deck.get(i).setValue(10);
			} else if (deck.get(i).getValue() == 13) {
				deck.get(i).setValue(1);
				deck.get(i).setAce(true);
			}
		}
		
		
	}
	
	public void shuffleDeck() {
		// Builds deck
		int deckSize = 52; 
		
		//Shuffles deck
		for (int i = 0; i < deckSize; i++) {
			int rand = i + (int)(Math.random() * (deckSize - i));
			String temp = deck[rand];
			deck[rand] = deck[i];
			deck[i] = temp;
		}
		
	}
	
	
}

