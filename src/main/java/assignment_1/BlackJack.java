package assignment_1;

import java.io.*;
import java.util.*;

public class BlackJack {
	
	public static void main(String[] args) {
		Deck playDeck;
		Player player;
		Dealer dealer;
		
		Scanner reader = new Scanner(System.in);
		// Reading if file required or not
		System.out.println("Would you like console input (c) or file input (f)?");
		String in_or_out = reader.nextLine();
		
		// for console input game 
		if (in_or_out.equals("c")) {
			//Initialize the deck 
			playDeck = new Deck();
			
			playDeck.shuffleDeck();
			
			//Initialize the players
			player = new Player();
			dealer = new Dealer();
			playDeck.dealInitialHand(player, dealer);
			
			String winner = "";
			
			while(true) {
				//Check for initial Black Jack
				if ((player.getHandValue() == 21) &&
				(dealer.getHandValue() < player.getHandValue())){
					winner = "Player";
					break;
				} else if ((dealer.getHandValue() == 21) &&
						(player.getHandValue() < dealer.getHandValue())) {
					winner = "Dealer";
					break;
				} else if ((dealer.getHandValue() == 21) && (player.getHandValue() == 21)) {
					winner = "Tie";
					break;
				}
				//////////////////////////////////////
				// Player Turn
				// Reading if hitting or stay
				System.out.println("Would you like to hit (H) or stay (S)?");
				String hit = reader.nextLine();
				
				//Actual turn 
				if (hit.equals("H")) {
					System.out.println("Dealing Player Card...");
					playDeck.dealCardPlayer(player);
					player.playerHit(true);
				} else if (!(hit.equals("H"))) {
					System.out.println("Staying...");
					player.playerHit(false);
				}
				player.printPlayerHand();
				/////////////////////////////////////
				
				// Dealer Turn
				if (dealer.dealerHit()) {
					System.out.println("Dealer Drawing: ");
					playDeck.dealCardDealer(dealer);
				} else if (!(dealer.dealerHit())) {
					System.out.println("Dealer Staying");
				}
				////////////////////////////////////
				
				
				if((player.getHandValue() > 21) && (dealer.getHandValue() <= 21)) {
					winner = "Dealer"; // Player bust
					break;
				} else if ((dealer.getHandValue() > 21) && (player.getHandValue() <=21)) {
					winner = "Player"; // Dealer bust 
					break;
				} else if (((dealer.getHandValue() == 21) && (player.getHandValue() == 21)) ||
						(dealer.getHandValue() > 21) && (player.getHandValue() >21)) {
					winner = "Tie"; // double black Jack or double bust 
					break;
				} else if ((!(player.getPlayerHit())) & (!(dealer.dealerHit()))) {
					if (player.getHandValue() > dealer.getHandValue()) {
						winner = "Player"; // Player win 
						break;
					} else if (player.getHandValue() < dealer.getHandValue()) {
						winner = "Dealer"; // Dealer win
						break;
					} else if (player.getHandValue() == dealer.getHandValue()) {
						winner = "Tie"; // Tie
						break;
					}
				}
				
				System.out.println("--------------------------------------");
								
			}
			// Final messages: 
			if (winner.equals("Player")){
				System.out.println("PLAYER WINS! With: ");
				player.printPlayerHand();
				dealer.printDealerHandFinal();
			} else if (winner.equals("Dealer")) {
				System.out.println("Dealer wins! With: ");
				dealer.printDealerHandFinal();
				player.printPlayerHand();
			} else if (winner.equals("Tie")) {
				System.out.println("DRAW! With: ");
				player.printPlayerHand();
				dealer.printDealerHandFinal();
			}
			
			
		}else if (in_or_out.equals("f")) { //File input 
			System.out.println("Enter File name: ");
			String file = reader.nextLine();
			File readFile = new File(file);
			
			
			
		}else{
			// Invalid input 
			System.out.println("Invalid input, exiting"); 
		}
		
		reader.close();	
		
		
	}
	// Player's turn 
	public static void playerTurn(Player player, Deck deck) {
		Scanner reader = new Scanner(System.in);
		// Reading if hitting or stay
		System.out.println("Would you like to hit (H) or stay (S)?");
		String hit = reader.nextLine();
		reader.close();	
		
		//Actual turn 
		if (hit.equals("H")) {
			System.out.println("Dealing Player Card...");
			deck.dealCardPlayer(player);
			player.playerHit(true);
		} else if (!(hit.equals("H"))) {
			System.out.println("Staying...");
			player.playerHit(false);
		}
		player.printPlayerHand();			
	}
	
	//Dealer's turn
	public static void dealerTurn(Dealer dealer, Deck deck) {
		if (dealer.dealerHit()) {
			System.out.println("Dealer Drawing: ");
			deck.dealCardDealer(dealer);
		} else if (!(dealer.dealerHit())) {
			System.out.println("Dealer Staying");
		}
	}
	
}
