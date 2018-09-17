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
	
	public String printDealerHand() {
		String handstring = "Dealers Hand: "; 
		
		handstring = handstring + hand.get(0).toString();
		return handstring; 
	}
	

}
