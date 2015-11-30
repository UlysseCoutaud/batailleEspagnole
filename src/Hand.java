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
		return "["+card.get(0).toString()+","+card.get(1).toString()+","+card.get(2).toString()+"]";
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
		card.add(c);
	 }


	/**
	 *	@author Jules
	 *	@since  v0
	 */
	public void putCard(Integer i) { 
		card.get(i);
		card.remove(i);
	 } 

}