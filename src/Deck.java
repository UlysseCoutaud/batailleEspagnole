import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

import batailleEspagnole.Color;
import batailleEspagnole.Rank;

/**
 * 	A deck of cards for the Spanish battle.
 *	@author Ulysse
 *	@version 0
 *	@since  V0
 */
public class Deck {

	private static int numberOfCardsByLine = 10 ;
	private static int numberOfCardsMax = 52 ;

	
	/**
	 *	@author Ulysse
	 *	@since  V0
	 */
	public Deck() {
		super();
		this.cards = new LinkedList<Card>();
		
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
 
	private LinkedList<Card> cards;

	
	/**
	 * @return the LinkedList of cards
	 */
	private LinkedList<Card> getCards() {
		return cards;
	}


	/**
	 *	Print the content of the deck on the standard out.
	 *	@author Ulysse
	 *	@since  0
	 */
	public void print() { 
		System.out.println(this.toString());
	}


	/**
	 *	Insert the card c at the bottom of the deck.
	 *	@author Ulysse
	 *	@param c - card to be inserted into the deck
	 *	@since  V0
	 */
	public void insert(Card c) { 
		this.getCards().addLast(c);
		assert this.getCards().size()<numberOfCardsMax : "Exceed maximal number of cards in deck." ;
	}

	/**
	 * 	Mix the cards.
	 *	@author Ulysse
	 *	@param
	 *	@since  V0
	 */
	public void mix() { 
		Random r = new Random();
		for (int i=0; i < this.getCards().size(); i++){
			int alea = r.nextInt(this.getCards().size());
			Card c = this.getCards().get(alea);
			this.getCards().remove(alea);
			this.insert(c);			
		}
	}


	/**
	 * 	Pull a card from the top of the deck.
	 *	@author Ulysse
	 *	@return The card pulled from the deck.
	 *	@since  V0
	 */
	public Card pull() { 
		Card c = this.getCards().pollFirst();
		return c;
	 }


	/**
	 *	String readable representation of the deck's content. 
	 *	@author Ulysse
	 *	@return String representation of the deck.
	 *	@see java.lang.Object#toString()
	 *	@since V0
	 */
	public String toString() { 
		Iterator<Card> iterator = this.getCards().iterator();
		int i = 0;
		String result = "";
		while (iterator.hasNext()){
			i++;
			if ( i == numberOfCardsByLine ) {
				i=0;
				result+="\n";
			}
			result += iterator.next().toString();
		}
		return result;
	 } 

}