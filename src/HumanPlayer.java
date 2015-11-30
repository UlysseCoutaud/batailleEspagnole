import java.util.Scanner;

import batailleEspagnole.UnexistingCardIndex;

/**
 *	@author ulysse TODO
 *	@version /!\ REQUIRED /!\ TODO
 *	@exception TODO
 *	@see  TODO
 *	@since  TODO
 */
public class HumanPlayer extends Player {

	/**
	 * 	Create a human player.
	 *	@author Ulysse
	 *	@param name - the name of the human player
	 *	@see  ${@link Player#Player(String)}
	 *	@since  V0
	 */
	public HumanPlayer(String name) {
		super(name);
	}

	/**
	 * 	Get a card from the human player hand.
	 *	@author ulysse 
	 *	@return The card choose by the player.
	 *	@see Player#putCard()
	 *	@since V0
	 */
	public Card putCard() { 
		Scanner sc = new Scanner(System.in);
		this.getHand().print();
		System.out.println("Choose a card to put:");
		Card playedCard = null;
		try {
			playedCard = this.getHand().getCard(sc.nextInt());
		} catch (UnexistingCardIndex e) {
			System.out.println("Ce n'est pas une carte de votre main !");
			this.putCard();
		}
		sc.close();
		return playedCard;
	}

	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see Player#acceptTrump(Card)
	 *	@since TODO
	 */
	@Override
	public boolean acceptTrump(Card c) {
		// TODO Auto-generated method stub
		return false;
	} 

}