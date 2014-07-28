package cards;

/**
 * @author awerner
 *
 */
public class Card {

	private Enums.Suit suit;
	private Enums.Value value;
	
	
	
	public Card(Enums.Suit suit, Enums.Value value){
		this.setSuit(suit);
		this.setValue(value);
		
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

	
	
	
}
