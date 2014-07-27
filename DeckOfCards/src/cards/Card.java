package cards;

/**
 * @author awerner
 *
 */
public class Card {

	private Enums.Suit suit;
	private Enums.Value value;
	private int orderInDeck;
	
	
	
	public Card(Enums.Suit suit, Enums.Value value, int orderInDeck){
		this.setSuit(suit);
		this.setValue(value);
		this.setOrderInDeck(orderInDeck);
		
	}



	public Enums.Suit getSuit() {
		return suit;
	}



	private void setSuit(Enums.Suit suit) {
		this.suit = suit;
	}



	public Enums.Value getValue() {
		return value;
	}



	private void setValue(Enums.Value value) {
		this.value = value;
	}



	public int getOrderInDeck() {
		return orderInDeck;
	}



	private void setOrderInDeck(int orderInDeck) {
		this.orderInDeck = orderInDeck;
	}
	
	
	
}
