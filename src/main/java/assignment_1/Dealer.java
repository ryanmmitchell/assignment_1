package assignment_1;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
	public List<Cards> hand;
	public int handValue;
	
	public Dealer() {
		this.hand = new ArrayList<Cards>();
		this.handValue = 0;
	}
	
	public void setHandValue(int n) {
		int oldValue = this.handValue;
		this.handValue = this.handValue + oldValue;
	} 
	
	public int getHandValue() {
		return this.handValue;
	}
	
	public void printDealerHand() {
		String handstring = "Dealers Hand: "; 
		handstring = handstring + hand.get(0).toString();
		System.out.println(handstring);
		
	}
	
	public Cards getCardx(int x) {
		return hand.get(x);
	}
	
	// Deal Player Card Specific 
	public void dealCardxDealer(Dealer dealer, String card, String suit) {
		Cards newDealCard;
		
		if(card.equals("2")) {
			newDealCard = new Cards(2, suit, card);
			dealer.hand.add(newDealCard);
			dealer.setHandValue(newDealCard.getValue());
		} else if (card.equals("3")){
			newDealCard = new Cards(3, suit, card);
			dealer.hand.add(newDealCard);
			dealer.setHandValue(newDealCard.getValue());
		} else if (card.equals("4")){
			newDealCard = new Cards(4, suit, card);
			dealer.hand.add(newDealCard);
			dealer.setHandValue(newDealCard.getValue());
		} else if (card.equals("5")){
			newDealCard = new Cards(5, suit, card);
			dealer.hand.add(newDealCard);
			dealer.setHandValue(newDealCard.getValue());
		} else if (card.equals("6")){
			newDealCard = new Cards(6, suit, card);
			dealer.hand.add(newDealCard);
			dealer.setHandValue(newDealCard.getValue());
		} else if (card.equals("7")){
			newDealCard = new Cards(7, suit, card);
			dealer.hand.add(newDealCard);
			dealer.setHandValue(newDealCard.getValue());
		} else if (card.equals("8")){ 
			newDealCard = new Cards(8, suit, card);
			dealer.hand.add(newDealCard);
			dealer.setHandValue(newDealCard.getValue());
		} else if (card.equals("9")){
			newDealCard = new Cards(9, suit, card);
			dealer.hand.add(newDealCard);
			dealer.setHandValue(newDealCard.getValue());
		} else if (card.equals("10")){
			newDealCard = new Cards(10, suit, card);
			dealer.hand.add(newDealCard);
			dealer.setHandValue(newDealCard.getValue());
		} else if (card.equals("Jack")){
			newDealCard = new Cards(10, suit, card);
			dealer.hand.add(newDealCard);
			dealer.setHandValue(newDealCard.getValue());
		} else if (card.equals("Queen")){
			newDealCard = new Cards(10, suit, card);
			dealer.hand.add(newDealCard);
			dealer.setHandValue(newDealCard.getValue());
		} else if (card.equals("King")){
			newDealCard = new Cards(10, suit, card);
			dealer.hand.add(newDealCard);
			dealer.setHandValue(newDealCard.getValue());
		} else if (card.equals("Ace")) {
			newDealCard = new Cards(11, suit, card);
			dealer.hand.add(newDealCard);
			dealer.setHandValue(newDealCard.getValue());
		}
	}
	
	
	public boolean dealerHit() {
		if(this.getHandValue() <= 16) {
			return true;
		} else {
			return false;
		}
	}
	
	public void printDealerValue() {
		System.out.println(this.handValue);
	}

}
