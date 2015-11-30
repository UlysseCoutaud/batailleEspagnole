package batailleEspagnole;
/**
 *	batailleEspagnole
 *	
 *	@author Ulysse
 *	@version 0
 *	@since  V0
 */

public class UnexistingCardIndex extends Exception {

	/**
	 *	@author ulysse
	 *	@since  V0
	 */
	private static final long serialVersionUID = 6056517275644419902L;
	
	/**
	 *	@author ulysse
	 *	@param msg - Message to be printed when exception raised.
	 *	@since  V0
	 */
	public UnexistingCardIndex(String msg) {
		super(msg);
	}

}
