package assignment_1;

import org.junit.Test;

import junit.framework.TestCase;

public class BlackJackTest extends TestCase  {
	
	@Test
	public void testDeckHasFiftyTwoCards() {
		Deck tester = new Deck(); // Deck class is tested 
		//Test 
		assertEquals(52, tester.countCards());	
	}

	@Test
	public void testShuffle() {
		Deck tester = new Deck(); // Deck class is tested 
		//Test 
		tester.shuffleDeck();
		assertNotNull(tester);	
	}
	
	@Test
	public void testInitialHands(){
		Deck testDeck = new Deck(); //Deck to use 
		Player testPlayer = new Player();
		Dealer testDealer = new Dealer();
		
		// Deal test hands
		testDeck.dealInitialHand(testPlayer, testDealer);
		assertEquals(2, testPlayer.getCardx(0).getValue());
		assertEquals(2, testPlayer.getCardx(1).getValue());
		assertEquals(2, testPlayer.getCardx(0).getValue());
		assertEquals(2, testPlayer.getCardx(1).getValue());
		
	}
}
