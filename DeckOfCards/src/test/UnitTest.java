package test;

import java.util.ArrayList;
import java.util.List;

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
	public void testDeckMakeupSuitAfterCreation(){
		DeckOfCards doc = new DeckOfCards();
		int numbOfHearts=0, numbOfDiamonds=0, numbOfClubs=0, numbOfSpades=0;
		for (int i=0; i< doc.getNumberOfCardsInDeck(); i++){
			Enums.Suit suit = doc.getCards().get(i).getSuit();
			switch(suit){
			case HEARTS:
				numbOfHearts++;
				break;
			case DIAMONDS:
				numbOfDiamonds++;
				break;
			case CLUBS:
				numbOfClubs++;
				break;
			case SPADES:
				numbOfSpades++;
				break;
			}

		}
		assertTrue(numbOfHearts == numbOfDiamonds && numbOfHearts == numbOfClubs && numbOfHearts == numbOfSpades &&
				numbOfHearts	== 13);
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
		boolean checkSuitOrder = card1.getSuit().ordinal()  != card2.getSuit().ordinal();
		boolean checkValueOrder = card1.getValue().ordinal() + 1 != card2.getValue().ordinal();
		assertTrue("Testing to see if cards are trully shuffled", checkSuitOrder && checkValueOrder);
	}
	
	@Test
	public void testAddCardsToDeck(){
		DeckOfCards doc = new DeckOfCards();
		List <Card> cards = new ArrayList <Card>();
		Card card1 = new Card (Enums.Suit.CLUBS, Enums.Value.ACE);
		Card card2 = new Card (Enums.Suit.SPADES, Enums.Value.ACE);
		cards.add(card1);
		cards.add(card2);
		doc.addCardsToDeck(Enums.Position.TOP, cards);
		assertTrue(doc.getCards().get(0).getSuit() == Enums.Suit.CLUBS && 
				doc.getCards().get(0).getValue() == Enums.Value.ACE);
		
	}
	
	@Test
	public void testGetCardsFromDeck(){
		DeckOfCards doc = new DeckOfCards();
		List<Card> cards = new ArrayList <Card> ();
		cards.addAll(doc.getCardsFromDeck(Enums.Position.TOP, 7));
		assertTrue(cards.size() == 7);
	}
	
	@Test
	public void testAddCardToHand(){
		DeckOfCards doc = new DeckOfCards();
		HandOfCards hand = new HandOfCards(7, doc);
		Card card1 = new Card (Enums.Suit.CLUBS, Enums.Value.ACE);
		hand.addCardToHand(Enums.Position.TOP, card1);
		assertTrue(hand.getHand().get(0).getSuit() == Enums.Suit.CLUBS && hand.getHand().get(0).getValue() == Enums.Value.ACE);
	}
	
	

}
