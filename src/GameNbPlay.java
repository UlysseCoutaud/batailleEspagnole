import java.util.ArrayList;
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
	public GameNbPlay(ArrayList<Player> player, List<Play> play, Integer nbPlays) {
		super(player, play);
		this.setNbPlaysMax(nbPlays);
	}


	private Integer nbPlaysMax;

	/**
	 * Getter of nbPlays
	 */
	public Integer getNbPlaysMax() {
	 	 return nbPlaysMax; 
	}

	/**
	 * Setter of nbPlays
	 */
	public void setNbPlaysMax(Integer nbPlays) { 
		 this.nbPlaysMax = nbPlays; 
	}


	/**
	 *	@author Jules
	 *	@return if the game is over
	 *	@see Game#isOver()
	 *	@since V0
	 */
	public Boolean isOver() { 
		return this.getNbPlaysMax()<=this.getPlays().size();
	 } 

}