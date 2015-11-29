import java.util.List;

public class GameMaxPoints extends Game {

	
	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public GameMaxPoints(Player player, List<Play> play, Integer nbMaxPoints) {
		super(player, play);
		this.nbMaxPoints = nbMaxPoints;
	}


	private Integer nbMaxPoints;


	/**
	 * @return the nbMaxPoints
	 */
	public Integer getNbMaxPoints() {
		return nbMaxPoints;
	}


	/**
	 * @param nbMaxPoints the nbMaxPoints to set
	 */
	public void setNbMaxPoints(Integer nbMaxPoints) {
		this.nbMaxPoints = nbMaxPoints;
	}


	/**
	 * 
	 * @return 
	 */
	public Boolean isOver() { 
		// TODO Auto-generated method
		return null;
	 } 

}