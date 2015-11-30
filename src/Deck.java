import java.util.LinkedList;
import java.util.List;

import batailleEspagnole.Color;
import batailleEspagnole.Rank;

/**
 *	@author ulysse TODO
 *	@version 0
 *	@exception TODO
 *	@see  TODO
 *	@since  V0
 */
public class Deck {

	/**
	 *	@author ulysse
	 *	@since  V0
	 */
	public Deck() {
		super();
		this.card = new LinkedList<Card>();
		
		this.insert( new Card(Rank.Deux,		Color.Baton) );
		this.insert( new Card(Rank.Trois,		Color.Baton) );
		this.insert( new Card(Rank.Quatre,	Color.Baton) );
		this.insert( new Card(Rank.Cinq,		Color.Baton) );
		this.insert( new Card(Rank.Six,		Color.Baton) );
		this.insert( new Card(Rank.Sept, 		Color.Baton) );
		this.insert( new Card(Rank.Huit, 		Color.Baton) );
		this.insert( new Card(Rank.Neuf, 		Color.Baton) );
		this.insert( new Card(Rank.Dix, 		Color.Baton) );
		this.insert( new Card(Rank.Cavalier, 	Color.Baton) );
		this.insert( new Card(Rank.Dame, 		Color.Baton) );
		this.insert( new Card(Rank.Roi, 		Color.Baton) );
		this.insert( new Card(Rank.Trois,		Color.Baton) );
		this.insert( new Card(Rank.As, 		Color.Baton) );
		
		this.insert( new Card(Rank.Deux,		Color.Coupe) );
		this.insert( new Card(Rank.Trois,		Color.Coupe) );
		this.insert( new Card(Rank.Quatre,	Color.Coupe) );
		this.insert( new Card(Rank.Cinq,		Color.Coupe) );
		this.insert( new Card(Rank.Six,		Color.Coupe) );
		this.insert( new Card(Rank.Sept, 		Color.Coupe) );
		this.insert( new Card(Rank.Huit, 		Color.Coupe) );
		this.insert( new Card(Rank.Neuf, 		Color.Coupe) );
		this.insert( new Card(Rank.Dix, 		Color.Coupe) );
		this.insert( new Card(Rank.Cavalier, 	Color.Coupe) );
		this.insert( new Card(Rank.Dame, 		Color.Coupe) );
		this.insert( new Card(Rank.Roi, 		Color.Coupe) );
		this.insert( new Card(Rank.Trois,		Color.Coupe) );
		this.insert( new Card(Rank.As, 		Color.Coupe) );
		
		this.insert( new Card(Rank.Deux,		Color.Or) );
		this.insert( new Card(Rank.Trois,		Color.Or) );
		this.insert( new Card(Rank.Quatre,	Color.Or) );
		this.insert( new Card(Rank.Cinq,		Color.Or) );
		this.insert( new Card(Rank.Six,		Color.Or) );
		this.insert( new Card(Rank.Sept, 		Color.Or) );
		this.insert( new Card(Rank.Huit, 		Color.Or) );
		this.insert( new Card(Rank.Neuf, 		Color.Or) );
		this.insert( new Card(Rank.Dix, 		Color.Or) );
		this.insert( new Card(Rank.Cavalier, 	Color.Or) );
		this.insert( new Card(Rank.Dame, 		Color.Or) );
		this.insert( new Card(Rank.Roi, 		Color.Or) );
		this.insert( new Card(Rank.Trois,		Color.Or) );
		this.insert( new Card(Rank.As, 		Color.Or) );
		
		this.insert( new Card(Rank.Deux,		Color.Epée) );
		this.insert( new Card(Rank.Trois,		Color.Epée) );
		this.insert( new Card(Rank.Quatre,	Color.Epée) );
		this.insert( new Card(Rank.Cinq,		Color.Epée) );
		this.insert( new Card(Rank.Six,		Color.Epée) );
		this.insert( new Card(Rank.Sept, 		Color.Epée) );
		this.insert( new Card(Rank.Huit, 		Color.Epée) );
		this.insert( new Card(Rank.Neuf, 		Color.Epée) );
		this.insert( new Card(Rank.Dix, 		Color.Epée) );
		this.insert( new Card(Rank.Cavalier, 	Color.Epée) );
		this.insert( new Card(Rank.Dame, 		Color.Epée) );
		this.insert( new Card(Rank.Roi, 		Color.Epée) );
		this.insert( new Card(Rank.Trois,		Color.Epée) );
		this.insert( new Card(Rank.As, 		Color.Epée) );
		

	}
 
	private LinkedList<Card> card;

	
	/**
	 * @return the card
	 */
	private LinkedList<Card> getCard() {
		return card;
	}


	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public void print() { 
		// TODO Auto-generated method
	 }


	/**
	 *	Insert the card c at the bottom of the deck.
	 *	@author ulysse
	 *	@param c - card to be inserted into the deck
	 *	@since  V0
	 */
	public void insert(Card c) { 
		this.card.add(c);
	}

	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public void mix() { 
		// TODO Auto-generated method
	 }


	/**
	 * 	Pull a card from the deck.
	 *	@author ulysse
	 *	@return The card pulled from the deck.
	 *	@since  V0
	 */
	public Card pull() { 
		// TODO
		return null;
	 }


	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see java.lang.Object#toString()
	 *	@since TODO
	 */
	public String toString() { 
		// TODO Auto-generated method
		return null;
	 } 

}