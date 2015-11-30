import java.util.LinkedList;
import java.util.List;

import batailleEspagnole.UnexistingCardIndex;

/**
 *	@author Jules
 *	@version V0
 */
public class Hand {

	/*
	 * CONSTRUCTORS
	 */

	/**
	 *	@author Ulysse
	 *	@since  V0
	 */
	public Hand() {
		super();
		this.setCards(new LinkedList<Card>());;
	}

	/*
	 * ATTRIBUTES
	 */
	private List<Card> cards;

	/*
	 * GETTERS & SETTERS
	 */
	/**
	 * @return the cards
	 */
	private List<Card> getCards() {
		return cards;
	}

	/**
	 * @param cards the cards to set
	 */
	private void setCards(List<Card> cards) {
		this.cards = cards;
	}

	/**
	 * Getter of cards
	 * @throws UnexistingCardIndex 
	 */
	public Card getCard(int index) throws UnexistingCardIndex {
		if(index >cards.size())
			throw new UnexistingCardIndex("This card doesn't exist.");
		return this.getCards().get(index); 
	}

	/**
	 * Setter of cards
	 */
	public void setCard(Card cards) { 
		this.getCards().add(cards); 
	}

	/*
	 * METHODS
	 */

	/**
	 * 	Add the card c in the hand.
	 *	@author Jules
	 *	@param c - the card to take in the hand
	 *	@since  v0
	 */
	public void takeCard(Card c) { 
		this.cards.add(c);
	}


	/**
	 * 	Will take the cards number i and remove it from the hand.
	 *	@author Ulysse
	 *	@param i - index of the put card
	 *	@return the put card
	 *	@throws UnexistingCardIndex 
	 *	@since  v0
	 */
	public Card putCard(Integer i) throws UnexistingCardIndex { 
		Card c = this.getCard(i);
		this.cards.remove(i);
		return c;
	} 

	/**
	 *	@author Jules
	 *	@return tab of 3 cards.
	 *	@since V0
	 */
	public String toString() { 
		try {
			return "[ 1 : "+this.getCard(0).toString()+", 2 : "+this.getCard(1).toString()+", 3 :"+this.getCard(2).toString()+"]";
		} catch (UnexistingCardIndex e) {
			e.printStackTrace();
		}
		return null;
	}


	/**
	 *	@author Jules
	 *	@since  V0
	 */
	public void print() { 
		System.out.println(this.toString());
	}



}