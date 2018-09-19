package assignment_1;

public class Cards {
	public int value;
	public String suit;
	public String rank;
	
	public Cards(int value, String suit, String rank) {
		this.value = value;
		this.suit = suit;
		this.rank = rank;
	}
	
	public String toString() {
		return "" + rank + " of " + suit;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int n) {
		this.value = n;
	}
	

	public void setRank(String s) {
		this.rank = s;
	}
	
	public String getString() {
		return this.rank;
	}

}
