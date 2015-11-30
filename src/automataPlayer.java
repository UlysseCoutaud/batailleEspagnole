import java.util.Random;

/**
 *	@author ulysse TODO
 *	@version /!\ REQUIRED /!\ TODO
 *	@exception TODO
 *	@see  TODO
 *	@since  TODO
 */
public class automataPlayer extends Player {


	/**
	 * 	Create an automatic player.
	 *	@author Ulysse
	 *	@param name - the name of the player
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public automataPlayer(String name) {
		super(name);
	}

	/**
	 * 	The automatic player put a card on the table.
	 *	@author Ulysse TODO
	 *	@return the chosen card
	 *	@see Player#putCard()
	 *	@since V0
	 */
	public Card putCard() { 
		super.getHand().putCard(0);
		return null;
	 } 

}