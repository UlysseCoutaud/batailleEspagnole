

import java.util.List;

/**
 * 	This class implément a  Game of Spanish battle.
 *	@author Jules
 *	@version V0
 */
public abstract class Game {

	/*
	 * CONSTRUCTORS
	 */
	/**
	 *	@author Jules
	 *	@since  V0
	 */
	public Game(Player[] players, List<Play> plays) {
		super();
		this.setPlayers(players);
		this.setPlays(plays);
	}

	/*
	 * ATTRIBUTES
	 */
	private Player[] players;
	private List<Play> plays;

	/*
	 * GETTERS & SETTERS
	 */
	/**
	 * Getter of players
	 */
	public Player[] getPlayer() {
	 	 return players; 
	}
	/**
	 * Setter of players
	 */
	public void setPlayers(Player[] player) { 
		 this.players = player; 
	}
	/**
	 * Getter of play
	 */
	public List<Play> getPlays() {
	 	 return plays; 
	}
	/**
	 * Setter of play
	 */
	public void setPlays(List<Play> plays) { 
		 this.plays = plays; 
	}

	/*
	 * METHODS
	 */
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
		Play currentPlay = new Play(null,new Deck());
		while(!currentPlay.isOver()){
			currentPlay.next();
		}
	}

	
	public abstract Boolean isOver();

	
	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public void setPlayer(Player player,int index) { 
		 this.getPlayes()[index] = player; 
	}
	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public Player getPlayer(int index) {
	 	 return player[index]; 
	}
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

	/*
	 *  ABSTRACT METHODS
	 */
	
	
	
}