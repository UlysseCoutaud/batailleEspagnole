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
	public Hand(List<Card> cards) {
		super();
		this.cards = cards;
	}


	private List<Card> cards;

	/**
	 * Getter of cards
	 */
	public Card getCard(int index) {
	 	 return cards.get(index); 
	}

	/**
	 * Setter of cards
	 */
	public void setCard(Card cards) { 
		 this.cards.add(cards); 
	}


	/**
	 *	@author Jules
	 *	@return tab of 3 cards.
	 *	@since V0
	 */
	public String toString() { 
		return "["+this.getCard(0).toString()+","+this.getCard(1).toString()+","+this.getCard(2).toString()+"]";
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
		this.cards.add(c);
	 }


	/**
	 * Will take the cards number i and remove it from the hand.
	 *	@author Jules
	 *	@since  v0
	 */
	public void putCard(Integer i) { 
		this.getCard(i);
		this.cards.remove(i);
	 } 

}