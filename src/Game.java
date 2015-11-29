

import java.util.List;

public abstract class Game {

	/**
	 * 
	 */
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
	 * 
	 */
	public void print() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void nextPlay() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @return 
	 */
	public abstract Boolean isOver();
	/**
	 * 
	 * @param player 
	 */
	public void addPlayer(Player player) { 
		// TODO Auto-generated method
	 }
	/**
	 * @Override
	 * @return 
	 */
	public String toString() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @return 
	 */
	public Player getWinner() { 
		// TODO Auto-generated method
		return null;
	 } 

}