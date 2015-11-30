import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

public class GameMaxPoints extends Game {

	
	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public GameMaxPoints(Player[] player, List<Play> play, Integer nbMaxPoints) {
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
	 * @return the possible end of the game. 
	 */
	public Boolean isOver() { 
		int i;
		for(i=0;i<player.length && player[i].getPoints()<this.getNbMaxPoints();i++);
			return i!=player.length ;
	 } 

}