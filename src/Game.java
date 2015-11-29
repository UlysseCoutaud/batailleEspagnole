

import java.util.List;

/**
 *	@author ulysse TODO
 *	@version /!\ REQUIRED /!\ TODO
 *	@exception TODO
 *	@see  TODO
 *	@since  TODO
 */
public abstract class Game {

	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public Game(Player player, List<Play> play) {
		super();
		this.player = player;
		this.play = play;
	}

	public Player player;
	public List<Play> play;

	/**
	 * Getter of player
	 */
	public Player getPlayer() {
	 	 return player; 
	}
	/**
	 * Setter of player
	 */
	public void setPlayer(Player player) { 
		 this.player = player; 
	}
	/**
	 * Getter of play
	 */
	public List<Play> getPlay() {
	 	 return play; 
	}
	/**
	 * Setter of play
	 */
	public void setPlay(List<Play> play) { 
		 this.play = play; 
	}
	
	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public void print() { 
		// TODO Auto-generated method
	 }
	
	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public void nextPlay() { 
		// TODO Auto-generated method
	 }

	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public abstract Boolean isOver();

	
	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public void addPlayer(Player player) { 
		// TODO Auto-generated method
	 }

	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see java.lang.Object#toString()
	 *	@since TODO
	 */
	public String toString() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public Player getWinner() { 
		// TODO Auto-generated method
		return null;
	 } 

}