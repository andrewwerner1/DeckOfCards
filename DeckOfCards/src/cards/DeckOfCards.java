package cards;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;




public class DeckOfCards {

	public List<Card> cards;
	Random rand = new Random();
	
	/**
	 * Creates an unshuffled deck of cards
	 */
	public DeckOfCards(){		
		List<Card> cards = new  ArrayList <Card> () ;
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
			Card newCard = new Card(suitType, faceValue, i);
			//add new Card to deck of cards
			cards.add(newCard);
		}
		this.cards = cards;
	}
	
	
	/**
	 * 
	 * @return shuffled version of current deck of cards
	 */
	public void shuffleDeckOfCards(){
		List <Card> shuffledCards = new ArrayList <Card>(this.getNumberOfCardsInDeck());

		try{
			while (this.getNumberOfCardsInDeck() > 0){
			    
			    // nextInt is normally exclusive of the top value,
			    // so add 1 to make it inclusive
			    int randomNum = rand.nextInt((this.getNumberOfCardsInDeck()-1 - 0) + 1) + 0;
			    shuffledCards.add(this.getCards().remove(randomNum));
			}
		}
		catch( Exception e){
			System.out.println("Exception is" + e.toString());
		}
		this.setDeckOfCards(shuffledCards);

	}

	/** 
	 * 
	 * @return
	 */
	public List<Card> getCards() {
		return this.cards;
	}

	/**
	 * 
	 * @param cards
	 */
	private void setDeckOfCards(List<Card> cards) {
		this.cards = cards;
	}
	
	/**
	 * 
	 * @return number of cards in the current deck
	 */
	public int getNumberOfCardsInDeck(){
		if(this.getCards() == null )
			return 0;
		else
			return this.getCards().size();
	}
	
	/**
	 * 
	 * @param pos
	 * @param numberOfCards
	 * @return removes numberOfCards from current deck. Removes cards from either top, bottom, or random 
	 * spot in the deck given by pos paramter.
	 */
	public List<Card> getCardsFromDeck( Enums.Position pos, int numberOfCards){
		List <Card> cardsFromDeck = new ArrayList <Card>();
		
		switch(pos){
		case TOP:
			for (int i=0; i<numberOfCards; i++){
				cardsFromDeck.add(this.getCards().remove(i));
			}
			break;
		case BOTTOM:
			for (int i = this.getNumberOfCardsInDeck()-1; i<numberOfCards; i--){
				cardsFromDeck.add(this.getCards().remove(i));
			}
			break;
		case RANDOM:
			for(int i=0; i< numberOfCards; i++){
			int randomNum = rand.nextInt((this.getNumberOfCardsInDeck()-1 - 0) + 1) + 0;
			cardsFromDeck.add(this.getCards().remove(randomNum));
			}
			break;
		}
		return cardsFromDeck;
	}
	
	public boolean addCardsToDeck(Enums.Position pos, List<Card> cards){
		if(cards == null || cards.size()==0)
			return false;
		boolean result = false;
		switch(pos){
		case TOP:
			result = this.getCards().addAll(0, cards);
			break;
		case BOTTOM:
			result = this.getCards().addAll(getNumberOfCardsInDeck()-1, cards);
			break;
		case RANDOM:
			int randomNum = rand.nextInt((this.getNumberOfCardsInDeck()-1 - 0) + 1) + 0;
			result = this.getCards().addAll(randomNum, cards);
			break;
		
		}
		return result;
	}
	

	
}
