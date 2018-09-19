package assignment_1;

import java.util.*;

public class BlackJack {
	private static BlackJack game;
	private Deck deck;
	private Player player;
	private Dealer dealer;
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		// Reading if file required or not
		System.out.println("Would you like console input (c) or file input (f)?");
		String in_or_out = reader.nextLine();
		
		// for console input game 
		if (in_or_out.toLowerCase() == "c") {
			
		}else if (in_or_out.toLowerCase() == "f") {
			
		}else {
			// Invalid input 
			System.out.println("Invalid input, exiting"); 
		}
		
		
		
	}
	
	
	
}
