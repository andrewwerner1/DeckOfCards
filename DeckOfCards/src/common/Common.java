package common;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cards.*;

public class Common {
	static Random rand = new Random();

	/**
	 * 
	 * @param pos
	 * @param cardsToAdd
	 * @param currList
	 * @return adds list of cards (cardsToAdd) to original list (currList). Position list of cards are added given by (pos).
	 */
	public static boolean addCardsToList(Enums.Position pos, List<Card> cardsToAdd, List <Card> currList){
		if(cardsToAdd == null || cardsToAdd.size()==0)
			return false;
		boolean result = false;
		switch(pos){
		case TOP:
			result = currList.addAll(0, cardsToAdd);
			break;
		case BOTTOM:
			result = currList.addAll(currList.size()-1, cardsToAdd);
			break;
		case RANDOM:
			int randomNum = rand.nextInt((currList.size()-1 - 0) + 1) + 0;
			result = currList.addAll(randomNum, cardsToAdd);
			break;
		}
		return result;
	}
	
	/**
	 * 
	 * @param pos
	 * @param numberOfCards
	 * @param currList
	 * @return removes list of cards from original list (given by currList). user can also specify where in list cards are pulled from.
	 */
	public static List<Card> removeCardsFromList(Enums.Position pos, int numberOfCards, List<Card> currList){
		List <Card> cardsRemoved = new ArrayList <Card>();
		
		switch(pos){
		case TOP:
			for (int i=0; i<numberOfCards; i++){
				cardsRemoved.add(currList.remove(i));
			}
			break;
		case BOTTOM:
			for (int i = currList.size()-1; i<numberOfCards; i--){
				cardsRemoved.add(currList.remove(i));
			}
			break;
		case RANDOM:
			for(int i=0; i< numberOfCards; i++){
			int randomNum = rand.nextInt((currList.size()-1 - 0) + 1) + 0;
			cardsRemoved.add(currList.remove(randomNum));
			}
			break;
		}
		return cardsRemoved;
	}
	
	/**
	 * 
	 * @param cardToAdd
	 * @param currList
	 * @return adds Card to end of list of cards
	 */
	public static void addCardToList(Enums.Position pos, Card cardToAdd, List<Card> currList){
		if(cardToAdd == null)
			return;
		switch(pos){
		case TOP:
			currList.add(0, cardToAdd);
			break;
		case BOTTOM:
			currList.add(currList.size()-1, cardToAdd);
			break;
		case RANDOM:
			int randomNum = rand.nextInt((currList.size()-1 - 0) + 1) + 0;
			currList.add(randomNum, cardToAdd);
		}
		
		return;
	}
	
	/**
	 * 
	 * @param pos
	 * @param currList
	 * @return removes card from list at specified location
	 */
	public static Card removeCardFromList(Enums.Position pos, List <Card> currList){
		Card card = null;
		switch(pos){
		case TOP:
			card = currList.remove(0);
			break;
		case BOTTOM:
			card = currList.remove(currList.size()-1);
			break;
		case RANDOM:
			int randomNum = rand.nextInt((currList.size()-1 - 0) + 1) + 0;
			card = currList.remove(randomNum);
			break;
		}
		return card;
	}
}
