import java.util.Random;

import batailleEspagnole.UnexistingCardIndex;

/**
 *	@author ulysse
 *	@version 0
 *	@since  V0
 */
public class AutomataPlayer extends Player {


	/**
	 * 	Create an automatic player.
	 *	@author Ulysse
	 *	@param name - the name of the player
	 *	@since  0
	 */
	public AutomataPlayer(String name) {
		super(name);
	}

	/**
	 * 	The automatic player put a card on the table.
	 *	@author Ulysse
	 *	@return the chosen card
	 *	@see Player#putCard()
	 *	@since V0
	 */
	public Card putCard() { 
		System.out.println("I am " + this.getName() +" I play the card:");
		try {
			Card c = this.getHand().putCard(0);
			System.out.println("\t"+c);
		} catch (UnexistingCardIndex e) {
			e.printStackTrace();
		}
		return null;
	 }

	/**
	 * 	The automata choose randomly is it decides to accept the trump.
	 *	@author Ulysse
	 *	@param c - The card on top of the deck (will be put at te bottom of the deck).
	 *	@return True if the automata accept the card's color as the trump
	 *	@see Player#acceptTrump(Card)
	 *	@since V0
	 */
	@Override
	public boolean acceptTrump(Card c) {
		return (new Random().nextInt(3) == 0);
	} 

}