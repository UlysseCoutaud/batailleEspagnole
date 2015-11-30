import java.util.Scanner;

import batailleEspagnole.UnexistingCardIndex;

/**
 *	@author ulysse 
 *	@version 0
 *	@since  V0
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
	 * 	Interaction with the human player to accept or not the trump
	 *	@author ulysse
	 *	@param c - The card taken from the top of the deck.
	 *	@return True if the player accepted the color as trump
	 *	@see Player#acceptTrump(Card)
	 *	@since V0
	 */
	@Override
	public boolean acceptTrump(Card c) {
		Scanner sc = new Scanner(System.in);
		System.out.println("La carte retourné est:" + c +"\nAccepter cet atout ? [yes/no]");
		String res = sc.nextLine();
		sc.close();
		if (res.equals("y") || res.equals("Y") || res.equals("yes") || res.equals("Yes") || res.equals("YES")){
			return true;
		} else {
			return false;
		}
	} 

}