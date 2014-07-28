package cards;

import java.util.*;

import common.Common;

public class HandOfCards {

	private List<Card> hand;

	/**
	 * 
	 * @param hand
	 */
	public HandOfCards(List<Card> hand){
		this.hand = hand;
	}
	
	/**
	 * @return the hand
	 */
	public List<Card> getHand() {
		return hand;
	}

	/**
	 * @param hand the hand to set
	 */
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	/**
	 * 
	 * @return number of cards in the hand
	 */
	public int countNumberOfCardsInHand(){
		return this.hand.size();
	}
	
	/**
	 * 
	 * @return String representation of cards in the hand of cards
	 */
	public String ToString(){
		String message = "";
		for(int i=0; i< this.getHand().size(); i++){
			message += "Suit: "+this.getHand().get(i).getSuit()+" Value: "+this.getHand().get(i).getValue();
		}
		return message;
	}
	

	/**
	 * 
	 * @param pos
	 * @param card
	 * adds card to hand of cards at specified position.
	 */
	public void addCardToHand(Enums.Position pos, Card card){
		Common.addCardToList(pos, card, this.getHand());
	}
	
	/**
	 * 
	 * @param pos
	 * @return removes card from hand of cards
	 */
	public Card removeCardFromHand(Enums.Position pos){
		return Common.removeCardFromList(pos, this.getHand());
	}
	
	/**
	 * 
	 * @param pos
	 * @param cardsToAdd
	 * adds cards to hand of cards at specified location
	 * @return true if successful, false otherwise
	 */
	public boolean addCardsToHand(Enums.Position pos, List <Card> cardsToAdd){
		boolean result = Common.addCardsToList(pos, cardsToAdd, this.getHand());
		return result;
	}
	
	/**
	 * 
	 * @param pos
	 * @param numberOfCards
	 * @return list of cards from hand of cards at specified position
	 */
	public List<Card> removeCardsFromHand(Enums.Position pos, int numberOfCards){
		List<Card> removedCards;
		removedCards = Common.removeCardsFromList(pos, numberOfCards, this.getHand());
		return removedCards;
	}
}
