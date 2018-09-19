package assignment_1;

import java.util.*;

public class Player {
	public List<Cards> hand;
	public int handValue;
	
	public Player() {
		this.hand = new ArrayList<Cards>();
		this.handValue = 0;
	}
	
	public void setHandValue() {
		int value = this.handValue;
		for (int i = 0; i <this.hand.size(); i++) {
			value = value + this.hand.get(i).getValue();
		}
	}
	
	public Cards getCardx(int x) {
		return hand.get(x);
	}
	
	public int getHandValue() {
		return this.handValue;
	}
	
	public void printPlayerHand() {
		String handstring = "Player Hand: "; 
		
		for (int i = 0; i < hand.size(); i++) {
			handstring = handstring + " " + hand.get(i).toString();
		}
		System.out.println(handstring);
	}
	

}
