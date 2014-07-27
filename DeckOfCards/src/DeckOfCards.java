import java.util.ArrayList;
import java.util.List;


public class DeckOfCards {

	public List<Card> deckOfCards;
	
	
	/*
	 * Creates a new DeckOfCards Object
	 */
	public DeckOfCards(){		
		List<Card> deckOfCards = new  ArrayList <Card> () ;
		// standard playing deck has 52 cards
		for (int i=0; i< 52 ; i++){
			int suitTypeInt = i % 4;
			int cardValueInt = i % 13;
			Enums.Suit suitType;
			Enums.Value faceValue;
			
			// Assign suit to card
			switch (suitTypeInt){
				case 0:
					suitType = Enums.Suit.CLUBS;
				break;
				case 1:
					suitType = Enums.Suit.DIAMONDS;
				break;
				case 2:
					suitType = Enums.Suit.HEARTS;
				break;
				default:
					suitType = Enums.Suit.SPADES;
				break;
			}
			// Assign a value to card
			switch (cardValueInt){
			case 0:
				faceValue = Enums.Value.ACE;
				break;
			case 1:
				faceValue = Enums.Value.TWO;
				break;
			case 2: 
				faceValue = Enums.Value.THREE;
				break;
			case 3:
				faceValue = Enums.Value.FOUR;
				break;
			case 4:
				faceValue = Enums.Value.FIVE;
				break;
			case 5:
				faceValue = Enums.Value.SIX;
				break;
			case 6:
				faceValue = Enums.Value.SEVEN;
				break;
			case 7:
				faceValue = Enums.Value.EIGHT;
				break;
			case 8:
				faceValue = Enums.Value.NINE;
				break;
			case 9:
				faceValue = Enums.Value.TEN;
				break;
			case 10:
				faceValue = Enums.Value.JACK;
				break;
			case 11:
				faceValue = Enums.Value.QUEEN;
				break;
			default:
				faceValue = Enums.Value.KING;
				break;
			}
			Card newCard = new Card(suitType, faceValue);
			//add new Card to deck of cards
			deckOfCards.add(newCard);
		}
		this.deckOfCards = deckOfCards;
	}
}
