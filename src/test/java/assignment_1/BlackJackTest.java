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
		Player testPlayer = new Player();
		
		testPlayer.dealCardxPlayer(testPlayer, "2", "Hearts");
		testPlayer.dealCardxPlayer(testPlayer, "Ace", "Hearts");
		
		testPlayer.printPlayerHand();
		
		assertEquals(11, testPlayer.hand.get(1).getValue());
	}
	
	@Test
	public void testTwoAcesAsOnes() {
		Player testPlayer = new Player();
		
		testPlayer.dealCardxPlayer(testPlayer, "Ace", "Spades");
		testPlayer.dealCardxPlayer(testPlayer, "Ace", "Diamonds");
		testPlayer.dealCardxPlayer(testPlayer, "Ace", "Hearts");
		
		testPlayer.printPlayerHand();
		
		assertEquals(1, testPlayer.hand.get(1).getValue());
		assertEquals(1, testPlayer.hand.get(2).getValue());
		
	}
	
	@Test
	public void testTwoAces() {
		Player testPlayer = new Player();
		
		testPlayer.dealCardxPlayer(testPlayer, "Ace", "Spades");
		testPlayer.dealCardxPlayer(testPlayer, "Ace", "Diamonds");
		
		testPlayer.printPlayerHand();
		
		assertEquals(11, testPlayer.hand.get(0).getValue());
		assertEquals(1, testPlayer.hand.get(1).getValue());
	}
	
	@Test
	public void testMultiAces() {

	}
	
	@Test
	public void testPlayerHit() {
		Player player = new Player();		
		player.playerHit(true);
		assertEquals(true, player.getPlayerHit());
		player.playerHit(false);
		assertEquals(false, player.getPlayerHit());
		
	}
	
	@Test
	public void testPlayerStay() {
		Player player = new Player();	
		
		player.playerHit(false);
		assertEquals(false, player.getPlayerHit());
	}
	
	@Test
	public void testDealerHit() {
		Dealer testDealer = new Dealer();
		Deck testDeck = new Deck();
		
		testDealer.hand.add(testDeck.getCard(0));
		testDealer.hand.add(testDeck.getCard(2));
		
		testDealer.printDealerValue();
		
		assertEquals(true, testDealer.dealerHit());
		
	}
	
	
	@Test
	public void testDealerStay() {
		Dealer testDealer = new Dealer();
		Deck testDeck = new Deck();
		
		testDealer.hand.add(testDeck.getCard(42));
		testDealer.hand.add(testDeck.getCard(41));
		testDealer.updateHandValue();
		testDealer.printDealerValue();
		
		assertEquals(false, testDealer.dealerHit());
	}
	
	@Test
	public void testPlayerBlackJack() {
		Player testPlayer = new Player();
		
		testPlayer.dealCardxPlayer(testPlayer, "Ace", "Spades");
		testPlayer.dealCardxPlayer(testPlayer, "10", "Spades");
		testPlayer.updateHandValue();
		
		assertEquals(21, testPlayer.getHandValue());
	}
	
	@Test
	public void testDealerBlackJack() {
		Dealer testPlayer = new Dealer();
		
		testPlayer.dealCardxDealer(testPlayer, "Ace", "Spades");
		testPlayer.dealCardxDealer(testPlayer, "10", "Spades");
		testPlayer.updateHandValue();
		
		assertEquals(21, testPlayer.getHandValue());
	}
	
	@Test
	public void testPlayerScore() {
		Player testPlayer = new Player();
		
		testPlayer.dealCardxPlayer(testPlayer, "Ace", "Spades");
		testPlayer.dealCardxPlayer(testPlayer, "10", "Spades");
		testPlayer.updateHandValue();
		
		assertEquals(21, testPlayer.getHandValue());
	}
	
	@Test 
	public void testDealerScore() {
		Dealer testPlayer = new Dealer();
		
		testPlayer.dealCardxDealer(testPlayer, "Ace", "Spades");
		testPlayer.dealCardxDealer(testPlayer, "10", "Spades");
		testPlayer.updateHandValue();
		
		assertEquals(21, testPlayer.getHandValue());	
	}
	
	
	@Test
	public void testPlayerBust() {
		Player testPlayer = new Player();
		
		testPlayer.dealCardxPlayer(testPlayer, "Ace", "Spades");
		testPlayer.dealCardxPlayer(testPlayer, "10", "Spades");
		testPlayer.dealCardxPlayer(testPlayer, "10", "Hearts");
		testPlayer.updateHandValue();
		
		assertEquals(31, testPlayer.getHandValue());
	}
	
	@Test
	public void testDealerBust() {
		Dealer testPlayer = new Dealer();
		
		testPlayer.dealCardxDealer(testPlayer, "Ace", "Spades");
		testPlayer.dealCardxDealer(testPlayer, "10", "Spades");
		testPlayer.dealCardxDealer(testPlayer, "10", "Hearts");
		testPlayer.updateHandValue();
		
		assertEquals(31, testPlayer.getHandValue());
		
	}
}

