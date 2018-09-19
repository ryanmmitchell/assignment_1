package assignment_1;

import org.junit.Test;

import junit.framework.TestCase;

public class BlackJackTest extends TestCase  {
	
	@Test
	public void testDeckHasFiftyTwoCards() {
		Deck tester = new Deck(); // Deck class is tested 
		//Test 
		tester.countCards();
		assertEquals(52, tester.countCards());	
	}

	@Test
	public void testShuffle() {
		// Deck class is tested
		Deck tester = new Deck();
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
	
	@Test
	public void testKingQueenJack() {
		Deck testDeck = new Deck(); // Deck to use 
		
		//Testing Q, J, K 
		assertEquals(10, testDeck.getCard(39).getValue());
		assertEquals(10, testDeck.getCard(43).getValue());
		assertEquals(10, testDeck.getCard(47).getValue());
	}
	
	@Test 
	public void testAceAsOne() {
		Deck testDeck = new Deck(); // Test Deck for generated Ace
		
		assertEquals(1, testDeck.getCard(51).getValue());
	}
	
	@Test
	public void testAceAsEleven() {
		
	}
}
