import java.util.Scanner;

/**
 *	@author ulysse TODO
 *	@version /!\ REQUIRED /!\ TODO
 *	@exception TODO
 *	@see  TODO
 *	@since  TODO
 */
public class humanPlayer extends Player {

	/**
	 * 	Create a human player.
	 *	@author Ulysse
	 *	@param name - the name of the human player
	 *	@see  ${@link Player#Player(String)}
	 *	@since  V0
	 */
	public humanPlayer(String name) {
		super(name);
	}

	/**
	 * 	Get a card from the human player hand.
	 *	@author ulysse TODO
	 *	@return The card choose by the player.
	 *	@exception TODO
	 *	@see Player#putCard()
	 *	@since V0
	 */
	public Card putCard() { 
		Scanner sc = new Scanner(System.in);
		this.getHand().print();
		System.out.println("Choose a card to put:");
			 Card playedCard = this.getHand().getCard(sc.nextInt());
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