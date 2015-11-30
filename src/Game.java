

import java.util.List;

/**
 *	@author Jules
 *	@version V0
 */
public abstract class Game {

	/**
	 *	@author Jules
	 *	@since  V0
	 */
	public Game(Player[] player, List<Play> play) {
		super();
		this.player = player;
		this.play = play;
	}

	public Player[] player;
	public List<Play> play;

	/**
	 * Getter of player
	 */
	public Player[] getPlayer() {
	 	 return player; 
	}
	
	public Player getPlayer(int index) {
	 	 return player[index]; 
	}
	/**
	 * Setter of player
	 */
	public void setPlayer(Player[] player) { 
		 this.player = player; 
	}

	public void setPlayer(Player player,int index) { 
		 this.player[index] = player; 
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
	 *	@author Jules
	 *	@since  V0
	 */
	public void print() { 
		System.out.println(this.toString());
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
		Play currentPlay = new Play(null,new Deck(),player);
		while(!currentPlay.isOver()){
		currentPlay.next();
		}
	}

	
	public abstract Boolean isOver();

	
	/**
	 *	@author Jules
	 *	@since  V0
	 */
	public void addPlayer(Player player) { 
		System.out.println(this.toString());
	 }

	/**
	 *	@author Jules
	 *	@return what is a Game
	 *	@see java.lang.Object#toString()
	 *	@since V0
	 */
	public String toString() { 
		return "[ #players : "+this.getPlayer().length+" , # of play finished : "+this.play.size()+" ]";
	 }

	/**
	 *	@author Jules
	 *	@return The winner of the Game
	 *	@since  V0
	 */
	public Player getWinner() { 
		Player currentwinner=this.getPlayer()[0];
		for(int i=1;i<this.getPlayer().length;i++)
			if (this.getPlayer()[i].getPoints()>currentwinner.getPoints())
				currentwinner=this.getPlayer()[i];
		return currentwinner;
	 } 

}