package assignment_1;

import java.util.*;

public class BlackJack {
	private static BlackJack game;
	private Deck deck;
	private Player player;
	private Dealer dealer;
	
	public static void main(String[] args) {
		game = new BlackJack();
	
	}
	
	public void startGame() {
		deck = new Deck();
		player = new Player();
		dealer = new Dealer();
		
		System.out.println("Blackjack Game is starting...");
	}
	
	
	
}
