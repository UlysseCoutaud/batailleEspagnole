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
	public GameNbPlay(Player[] player, List<Play> play, Integer nbPlays) {
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
	 *	@author Jules
	 *	@return if the game is over
	 *	@see Game#isOver()
	 *	@since V0
	 */
	public Boolean isOver() { 
		return this.getNbPlays()<=play.size();
	 } 

}