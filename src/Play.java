

import java.util.List;

import batailleEspagnole.Color;

/**
 *	@author Jules
 *	@version V0
 */
public class Play {

	
	public Play(List<Trick> trick, Deck deck, Color trump,Player[] players) {
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
	 *	@since  V0
	 */
	public void next() { 
		Trick currentTrick;
		int start=0,i;
		if(this.getTrick().size()!=0){
			Player winner=this.getTrick().get(this.getTrick().size()-1).getWinner(getTrump());
			for(i=0;i<getPlayers().length-1 && winner!=getPlayers()[i];i++);
			start=i;
		}
		currentTrick= new Trick(null, null);
		for(i=0;i<getPlayers().length;i++)
			currentTrick.next(getPlayers()[(start+i)%getPlayers().length]);
		currentTrick.getWinner(getTrump()).addPoints(currentTrick.getValue());
		this.getTrick().add(currentTrick);
	}
	

}