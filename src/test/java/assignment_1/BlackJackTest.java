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
	
	
}
