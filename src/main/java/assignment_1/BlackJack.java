package assignment_1;

import java.util.*;

public class BlackJack {
	private Deck deck;
	private Player player;
	private Dealer dealer;
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		// Reading if file required or not
		System.out.println("Would you like console input (c) or file input (f)?");
		String in_or_out = reader.nextLine();
		reader.close();	
		
		// for console input game 
		if (in_or_out.equals("c")) {
			//Initialize the deck 
			Deck playDeck = new Deck();
			playDeck.shuffleDeck();
			
			//Initialize the players
			Player player = new Player();
			Dealer dealer = new Dealer();
			playDeck.dealInitialHand(player, dealer);
			
		}else if (in_or_out.equals("f")) {
			
		}else{
			// Invalid input 
			System.out.println("Invalid input, exiting"); 
		}
		
		
	}
	
	
	
}
