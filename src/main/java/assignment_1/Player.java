package assignment_1;

import java.util.*;

public class Player {
	public List<Cards> hand;
	public int handValue;
	public boolean hit;
	
	public Player() {
		this.hand = new ArrayList<Cards>();
		this.handValue = 0;
	}
	
	public void setHandValue(int i) {
		this.handValue = i;
	} 
	
	
	public Cards getCardx(int x) {
		return hand.get(x);
	}
	
	public int getHandValue() {
		for (int i = 0; i < this.hand.size(); i++) {
			handValue = handValue + this.getCardx(i).getValue();
		}
		return handValue;
	}
	
	public void printPlayerHand() {
		String handstring = "Player Hand: "; 
		
		for (int i = 0; i < hand.size(); i++) {
			handstring = handstring + " " + hand.get(i).toString();
		}
		System.out.println(handstring);
		System.out.print("Hand Value: ");
		System.out.println(this.handValue);
	}
	
	// Deal Player Card Specific 
	public void dealCardxPlayer(Player player, String card, String suit) {
		Cards newDealCard;
		
		if(card.equals("2")) {
			newDealCard = new Cards(2, suit, card);
			player.hand.add(newDealCard);
		} else if (card.equals("3")){
			newDealCard = new Cards(3, suit, card);
			player.hand.add(newDealCard);
		} else if (card.equals("4")){
			newDealCard = new Cards(4, suit, card);
			player.hand.add(newDealCard);
		} else if (card.equals("5")){
			newDealCard = new Cards(5, suit, card);
			player.hand.add(newDealCard);
		} else if (card.equals("6")){
			newDealCard = new Cards(6, suit, card);
			player.hand.add(newDealCard);
		} else if (card.equals("7")){
			newDealCard = new Cards(7, suit, card);
			player.hand.add(newDealCard);
		} else if (card.equals("8")){ 
			newDealCard = new Cards(8, suit, card);
			player.hand.add(newDealCard);
		} else if (card.equals("9")){
			newDealCard = new Cards(9, suit, card);
			player.hand.add(newDealCard);
		} else if (card.equals("10")){
			newDealCard = new Cards(10, suit, card);
			player.hand.add(newDealCard);
		} else if (card.equals("Jack")){
			newDealCard = new Cards(10, suit, card);
			player.hand.add(newDealCard);
		} else if (card.equals("Queen")){
			newDealCard = new Cards(10, suit, card);
			player.hand.add(newDealCard);
		} else if (card.equals("King")){
			newDealCard = new Cards(10, suit, card);
			player.hand.add(newDealCard);
		} else if (card.equals("Ace")) {
			newDealCard = new Cards(11, suit, card);
			player.hand.add(newDealCard);
		}
		
	}
	
	public void playerHit(boolean h) {
		this.hit = h;
	}
	
	public boolean getPlayerHit() {
		return this.hit;
	}
	

}
