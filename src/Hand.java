import java.util.List;

/**
 *	@author Jules
 *	@version V0
 */
public class Hand {


	/**
	 *	@author Jules
	 *	@since  V0
	 */
	public Hand(List<Card> card) {
		super();
		this.card = card;
	}


	private List<Card> card;

	/**
	 * Getter of card
	 */
	public Card getCard(int index) {
	 	 return card.get(index); 
	}

	/**
	 * Setter of card
	 */
	public void setCard(Card card) { 
		 this.card.add(card); 
	}


	/**
	 *	@author Jules
	 *	@return tab of 3 cards.
	 *	@since V0
	 */
	public String toString() { 
		return "["+this.getCard().get(0).toString()+","+this.getCard().get(1).toString()+","+this.getCard().get(2).toString()+"]";
	 }

	
	/**
	 *	@author Jules
	 *	@since  V0
	 */
	public void print() { 
		System.out.println(this.toString());
	 }


	/**
	 *	@author Jules
	 *	@since  v0
	 */
	public void takeCard(Card c) { 
		this.getCard().add(c);
	 }


	/**
	 * Will take the card number i and remove it from the hand.
	 *	@author Jules
	 *	@since  v0
	 */
	public void putCard(Integer i) { 
		this.getCard().get(i);
		this.getCard().remove(i);
	 } 

}