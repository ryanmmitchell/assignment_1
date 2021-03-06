package assignment_1;

public class Cards {
	private int value;
	private String suit;
	private String rank;
	
	public Cards(int value, String suit, String rank) {
		this.value = value;
		this.suit = suit;
		this.rank = rank;
	}
	
	public String toString() {
		return "" + rank + " of " + suit + " ";
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
	
	public String getRank() {
		return this.rank;
	}

}
