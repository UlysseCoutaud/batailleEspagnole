

import java.util.ArrayList;
import java.util.List;

import batailleEspagnole.TooManyPlayers;
import batailleEspagnole.UnexistingPlayerIndex;

/**
 * 	This class implements a  Game of Spanish battle.
 *	@author Jules
 *	@version V0
 */
public abstract class Game {

	private static final int numberMaxPlayers = 4;
	
	/*
	 * CONSTRUCTORS
	 */
	/**
	 *	@author Jules
	 *	@since  V0
	 */
	public Game(ArrayList<Player> players, List<Play> plays) {
		super();
		this.setPlayers(players);
		this.setPlays(plays);
	}

	/*
	 * ATTRIBUTES
	 */
	private ArrayList<Player> players;
	private List<Play> plays;

	/*
	 * GETTERS & SETTERS
	 */
	/**
	 * Getter of players
	 */
	public ArrayList<Player> getPlayers() {
	 	 return players; 
	}
	/**
	 * Setter of players
	 */
	public void setPlayers(ArrayList<Player> player) { 
		 this.players = player; 
	}
	/**
	 * Getter of plays
	 */
	public List<Play> getPlays() {
	 	 return plays; 
	}
	/**
	 * Setter of plays
	 */
	public void setPlays(List<Play> plays) { 
		 this.plays = plays; 
	}

	/*
	 * METHODS
	 */

	/**
	 * 	Execute a whole Play (choose the trump and then plays the cards).
	 *	@author Ulysse
	 *	@since  V0
	 */
	public void nextPlay() { 
		Play currentPlay = new Play(this.getPlayers());
		while(!currentPlay.isOver()){
			currentPlay.next();
		}
	}



	
	/**
	 * 	Add a player in the Game. The number of players cannot be greater than 4.
	 *	@author Ulysse
	 *	@param player - the player to include in the game
	 * 	@throws TooManyPlayers - If we try to add a player when the number of players is already >= 4
	 *	@since  V0
	 */
	public void addPlayer(Player player) throws TooManyPlayers { 
		if (this.getPlayers().size()>= numberMaxPlayers) {
			throw new TooManyPlayers("The number of players in this game is already maximal.");
		}else{
			this.getPlayers().add(player);
		}
	}
	/**
	 * 	Get a player of the Game.
	 *	@author Ulysse
	 *	@param index - the number of the player.
	 *	@return a player of the game.
	 *	@throws UnexistingPlayerIndex - If trying to access to a non existing player.
	 *	@since  V0
	 */
	public Player getPlayer(int index) throws UnexistingPlayerIndex {
		if ( this.getPlayers().size() + 1 < index ){
			throw new UnexistingPlayerIndex("You're asking for player "+index+" but the last index of available player is "+ (this.getPlayers().size()+1));
		}
	 	 return this.getPlayers().get(index); 
	}

	/**
	 * 	Get the winner of the game
	 *	@author Ulysse
	 *	@return The winner of the Game
	 *	@since  V0
	 *	@remark: equality is not supported, only one of the winners is returned. To handle in next version. 
	 */
	public Player getWinner() { 
		Player currentwinner = null;
		try {
			currentwinner = this.getPlayer(0);

			for(int i=1;i<this.getPlayers().size();i++){
				if (this.getPlayer(i).getPoints()>currentwinner.getPoints()){
					currentwinner=this.getPlayer(i);
				}
			}
		} catch (UnexistingPlayerIndex e) {
			e.printStackTrace();
		}
		return currentwinner;
	} 
	
	/**
	 *	@author Jules
	 *	@return what is a Game
	 *	@see java.lang.Object#toString()
	 *	@since V0
	 */
	public String toString() { 
		return "[ #(players) : "+this.getPlayers().size()+" , # of play finished : "+this.getPlays().size()+" ]";
	 }
	
	/**
	 * 	Write the game in a human readable string over the standard output.
	 *	@author Jules
	 *	@since  V0
	 */
	public void print() { 
		System.out.println(this.toString());
	 }

	/*
	 *  ABSTRACT METHODS
	 */
	
	
	/**
	 * 	Tell is the game is finished.
	 *	@author Ulysse
	 *	@return True if the game is terminated, False if it's not finished yet.
	 *	@since  V0
	 */
	public abstract Boolean isOver();
	
}