import java.util.List;

/**
 *	@author ulysse TODO
 *	@version /!\ REQUIRED /!\ TODO
 *	@exception TODO
 *	@see  TODO
 *	@since  TODO
 */
public class GameNbPlay extends Game {

	
	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public GameNbPlay(Player player, List<Play> play, Integer nbPlays) {
		super(player, play);
		this.nbPlays = nbPlays;
	}


	private Integer nbPlays;

	/**
	 * Getter of nbPlays
	 */
	public Integer getNbPlays() {
	 	 return nbPlays; 
	}

	/**
	 * Setter of nbPlays
	 */
	public void setNbPlays(Integer nbPlays) { 
		 this.nbPlays = nbPlays; 
	}


	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see Game#isOver()
	 *	@since TODO
	 */
	public Boolean isOver() { 
		// TODO Auto-generated method
		return null;
	 } 

}