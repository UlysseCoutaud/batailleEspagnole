/**
 *	batailleEspagnole
 *	@author ulysse TODO (classes and interfaces only, required)
 *	@version V0
 *	@since  V0
 */
package batailleEspagnole;

/**
 *	@author ulysse TODO
 *	@version /!\ REQUIRED /!\ TODO
 *	@exception TODO
 *	@see  TODO
 *	@since  TODO
 */
public class TooManyPlayers extends Exception {

	private static final long serialVersionUID = 2665861872511568870L;

	/**
	 * 	Constructor for the Too Many Players Exception.
	 *	@author Ulysse
	 *	@param msg - A message to be printed when the exception is raised.
	 *	@since  V0
	 */
	public TooManyPlayers(String msg){
		super(msg);
	}
}
