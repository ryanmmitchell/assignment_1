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
	
	public void setHandValue() {
		int value = this.handValue;
		for (int i = 0; i <this.hand.size(); i++) {
			value = value + this.hand.get(i).getValue();
		}
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
	
	// Deal Specific Dealer Card
	public void dealCardxDealer(Dealer dealer, String card, String suit) {
		Cards newDealCard;
		
		if(card.equals("2")) {
			newDealCard = new Cards(2, card, suit);
			dealer.hand.add(newDealCard);
		} else if (card.equals("3")){
			newDealCard = new Cards(3, card, suit);
			dealer.hand.add(newDealCard);
		} else if (card.equals("4")){
			newDealCard = new Cards(4, card, suit);
			dealer.hand.add(newDealCard);
		} else if (card.equals("5")){
			newDealCard = new Cards(5, card, suit);
			dealer.hand.add(newDealCard);
		} else if (card.equals("6")){
			newDealCard = new Cards(6, card, suit);
			dealer.hand.add(newDealCard);
		} else if (card.equals("7")){
			newDealCard = new Cards(7, card, suit);
			dealer.hand.add(newDealCard);
		} else if (card.equals("8")){ 
			newDealCard = new Cards(8, card, suit);
			dealer.hand.add(newDealCard);
		} else if (card.equals("9")){
			newDealCard = new Cards(9, card, suit);
			dealer.hand.add(newDealCard);
		} else if (card.equals("10")){
			newDealCard = new Cards(10, card, suit);
			dealer.hand.add(newDealCard);
		} else if (card.equals("Jack")){
			newDealCard = new Cards(10, card, suit);
			dealer.hand.add(newDealCard);
		} else if (card.equals("Queen")){
			newDealCard = new Cards(10, card, suit);
			dealer.hand.add(newDealCard);
		} else if (card.equals("King")){
			newDealCard = new Cards(10, card, suit);
			dealer.hand.add(newDealCard);
		} else if (card.equals("Ace")) {
			if (dealer.handValue <= 10) {
				newDealCard = new Cards(11, card, suit);
				dealer.hand.add(newDealCard);
			} else {
				newDealCard = new Cards(1, card, suit);
				dealer.hand.add(newDealCard);
			}
		}
	}

}
