import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import batailleEspagnole.UnexistingPlayerIndex;

public class GameMaxPoints extends Game {

	
	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public GameMaxPoints(ArrayList<Player> player, List<Play> play, Integer nbMaxPoints) {
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
	 * Tell if the game is finished.
	 * @return True if a player has reached the required number of points to win. 
	 */
	public Boolean isOver() { 
		int i = 0;
		try {
			for(i=0;i<this.getPlayers().size() && this.getPlayer(i).getPoints()<this.getNbMaxPoints();i++);
		} catch (UnexistingPlayerIndex e) {
			e.printStackTrace();
		}
		return i != this.getPlayers().size();
	} 

}