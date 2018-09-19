package assignment_1;

import java.util.*;


public class Deck {
	// Variables for card values 
	
	List<Cards> deck;
	
	public String[] ranks = {
		"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", 
		"King", "Ace"
	};
	
	public String[] suit = {
			"Clubs", "Diamonds", "Hearts", "Spades"	
		};
		
	
	public Deck() {
		// initializing deck
		deck = new ArrayList<Cards>();
		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < suit.length; j++) {
				deck.add(new Cards(i + 2, suit[j], ranks[i]));
			}
		}
		//fixing deck values 
		for (int i = 0; i < 52; i++) {
			if (deck.get(i).getRank().equals("Jack")) { //Jack 
				deck.get(i).setValue(10);
			} else if (deck.get(i).getRank().equals("Queen")) { // Queen
				deck.get(i).setValue(10);
			}  else if (deck.get(i).getRank().equals("King")) { // King
				deck.get(i).setValue(10);
			}  else if (deck.get(i).getRank().equals("Ace")) { // Ace
				deck.get(i).setValue(1);
			}
		}
	}
	
	public void shuffleDeck() {
		// Shuffles the deck
		Collections.shuffle(deck);
		
	}
	
	// Deal Player Card (Random)
	public void dealCardPlayer(Player player) {
		Cards dealtCard = deck.remove(0);
		
		// Setting Ace value 
		if (dealtCard.getRank().equals("Ace")) {
			if (player.handValue <= 10) {
				dealtCard.setValue(11);
			} else {
				dealtCard.setValue(1);
			}
		}
		
		player.hand.add(dealtCard);
	}
	
	// Deal Random dealer card 
	public void dealCardDealer(Dealer dealer) {
		Cards dealtCard = deck.remove(0);
		
		// Setting Ace value 
		if (dealtCard.getRank().equals("Ace")) {
			if (dealer.handValue <= 10) {
				dealtCard.setValue(11);
			} else {
				dealtCard.setValue(1);
			}
		}
		dealer.hand.add(dealtCard);
	}
	
	
	public void dealInitialHand(Player player, Dealer dealer) {
		// Sets the initial hands of the player and the dealer
		dealCardPlayer(player);
		dealCardPlayer(player);
		dealCardDealer(dealer);
		dealCardDealer(dealer);
		
		player.printPlayerHand();
		dealer.printDealerHand();
		
		player.setHandValue();
		dealer.setHandValue();
		
	}
	
	public int countCards() {
		return deck.size();
	}
	
	public Cards getCard(int n) {
		return deck.get(n); 
	}
	
	public void printDeck() {
		for(int i =0;i<deck.size(); i++) {
			System.out.println(deck.get(i));
		}
	}
	
	
}

