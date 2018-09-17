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
		// Shuffles the deck
		Collections.shuffle(deck);
		
	}
	public void dealInitialHand(Player player, Dealer dealer) {
		// Sets the initial hands of the player and the dealer
		Cards dealtCard = deck.remove(0);
		player.hand.add(dealtCard);
		dealtCard = deck.remove(0);
		player.hand.add(dealtCard);
		dealtCard = deck.remove(0);
		dealer.hand.add(dealtCard);
		dealtCard = deck.remove(0);
		dealer.hand.add(dealtCard);
		
	}
	
	
	
	
}

