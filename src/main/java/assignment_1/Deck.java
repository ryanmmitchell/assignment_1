package assignment_1;

import java.util.*;

public class Deck {
	// Variables for card values 
	
	public String[] suit = {
		"C", "D", "H", "S"	
	};
	
	public String[] rank = {
			"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"
	};
	
	public String[] initializeDeck(){
		// Builds deck
		int deckSize = 52; 
		String[] deck = new String[deckSize];{	
			for (int i = 0; i < rank.length; i++) {
				for (int j = 0; j < suit.length; j++) {
					deck[suit.length*i + j] = rank[i] + suit[j];
				}
			}	
		}
		
		//Shuffles deck
		for (int i = 0; i < deckSize; i++) {
			int rand = i + (int)(Math.random() * (deckSize - i));
			String temp = deck[rand];
			deck[rand] = deck[i];
			deck[i] = temp;
		}
		
		return deck;
	}
	
	
	
	

	
	
	
}

