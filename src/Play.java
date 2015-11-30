

import java.util.LinkedList;
import java.util.List;

import batailleEspagnole.Color;

/**
 *	@author Jules
 *	@version V0
 */
public class Play {

	
	public Play(List<Trick> trick, Deck deck, Player[] players) {
		super();
		this.trick = trick;
		this.deck = deck;
		this.trump = trump;
		this.players = players;
	}

	public List<Trick> trick;
	
	public Deck deck;
	
	private Player[] players;
	
	/**
	 * Getter of players
	 */
	public Player[] getPlayers() {
		return players;
	}
	/**
	 * Setter of players
	 */
	public void setPlayers(Player[] players) {
		this.players = players;
	}

	private Color trump;
	/**
	 * Getter of trick
	 */
	public List<Trick> getTrick() {
	 	 return trick; 
	}
	/**
	 * Setter of trick
	 */
	public void setTrick(List<Trick> trick) { 
		 this.trick = trick; 
	}
	/**
	 * Getter of deck
	 */
	public Deck getDeck() {
	 	 return deck; 
	}
	/**
	 * Setter of deck
	 */
	public void setDeck(Deck deck) { 
		 this.deck = deck; 
	}
	/**
	 * Getter of trump
	 */
	public Color getTrump() {
	 	 return trump; 
	}
	/**
	 * Setter of trump
	 */
	public void setTrump(Color trump) { 
		 this.trump = trump; 
	}
	
	/**
	 *	@author Jules
	 *	@since  V0
	 */
	public void print() { 
		System.out.println(this.toString());
	 }

	/**
	 *	@author Jules
	 *	@see java.lang.Object#toString()
	 *	@since V0
	 */
	public String toString() { 
		return "[ #tricks : "+this.getTrick().size()+" , deck : "+getDeck().toString()+", trump : "+getTrump().toString()+" ]";
	 }
	
	/**
	 *  Will launch a full Trick 
	 *	@author Jules
	 *	@since  V1
	 */
	public void next() { 
		Trick currentTrick;
		int start=0,i;
		if(this.getTrick().size()!=0){//this isn't the first trick of this game
			//research the precedent winner
			Player winner=this.getTrick().get(this.getTrick().size()-1).getWinner(getTrump());
			for(i=0;i<this.getPlayers().length-1 && winner!=this.getPlayers()[i];i++);
			start=i;
		}
		//start of the new trick
		currentTrick= new Trick(new LinkedList<Card>(), new LinkedList<Player>());
		for(i=0;i<this.getPlayers().length;i++){
			currentTrick.next(this.getPlayers()[(start+i)%this.getPlayers().length]);
			if(!this.getDeck().isEmpty())
				this.getPlayers()[i].getHand().setCard(this.getDeck().pull());
		}	
		currentTrick.getWinner(getTrump()).addPoints(currentTrick.getValue());
		this.getTrick().add(currentTrick);
	}
	
	/**
	 *  @author Jules
	 *	@since  V0
	 */
	public boolean isOver(){
		return this.getDeck().isEmpty();
	}
}