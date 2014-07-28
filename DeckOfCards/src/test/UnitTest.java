package test;

import cards.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTest {

	DeckOfCards doc = new DeckOfCards();
	@Test
	public void testDeckOfCardCreationSize() {
		DeckOfCards doc = new DeckOfCards();
		assertTrue("Here is test for ",doc.getCards().size() == 52);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testSameSizeAfterShuffle(){
		DeckOfCards doc = new DeckOfCards();
		doc.shuffleDeckOfCards();
		assertTrue(doc.getCards().size() == 52);
	}
	
	@Test
	public void testGetNumberOfCardsAfterShuffleMethod(){
		DeckOfCards doc = new DeckOfCards();
		assertTrue (doc.getCards().size() == doc.getNumberOfCardsInDeck());
	}
	
	@Test
	public void testDeckAfterShuffle(){
		DeckOfCards doc = new DeckOfCards();
		doc.shuffleDeckOfCards();
		Card card1 = doc.getCards().get(0);
		Card card2 = doc.getCards().get(1);
		//Card card3 = doc.getCards().get(3);
		boolean checkSuitOrder = card1.getSuit().ordinal() + 1 != card2.getSuit().ordinal();
		boolean checkValueOrder = card1.getValue().ordinal() + 1 != card2.getValue().ordinal();
		assertTrue("Testing to see if cards are trully shuffled", checkSuitOrder && checkValueOrder);
	}
	
	@Test
	public void testAddCardsToDeck(){
		
	}
	
	@Test
	public void testGetCardsFromDeck(){
		
	}
	
	

}
