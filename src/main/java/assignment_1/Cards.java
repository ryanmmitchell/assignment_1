package assignment_1;

public class Cards {
	public int value;
	public String suit;
	public boolean isAce;
	
	public Cards(int value, String suit) {
		this.value = value;
		this.suit = suit;
		this.isAce = false; 
	}
	
	public String toString() {
		return "" + suit + value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int n) {
		this.value = n;
	}
	
	public void setAce(boolean n) {
		this.isAce = n;
	}

}
