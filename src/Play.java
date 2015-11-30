

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import batailleEspagnole.Color;

/**
 * 	A play gather the choose of a trump color and the succession of tricks.
 *	@author Jules
 *	@version V0
 */
public class Play {

	/*
	 * CONSTRUCTORS
	 */
	/**
	 * 	Create a new Plays with an empty tricks' list, an empty playersas an empty list and a full deck.
	 *	@author Ulysse
	 *	@param players - the set of players  in the partie
	 *	@since  V2
	 */
	public Play(ArrayList<Player> players) {
		super();
		this.setTrick(new ArrayList<Trick>());
		this.setDeck(new Deck());
		this.setPlayers( players);
		this.initialise();
	}

	/*
	 * ATTRIBUTES
	 */
	private List<Trick> tricks;
	
	private Deck deck;
	
	private ArrayList<Player> players;
	
	private Color trump;

	/*
	 * GETTERS & SETTERS
	 */
	/**
	 * Getter of players
	 */
	public ArrayList<Player> getPlayers() {
		return this.players;
	}
	/**
	 * Setter of players
	 */
	private void setPlayers(ArrayList<Player> players2) {
		this.players = players2;
	}

	/**
	 * Getter of tricks
	 */
	public List<Trick> getTricks() {
	 	 return this.tricks; 
	}
	/**
	 * Setter of trick
	 */
	private void setTrick(List<Trick> trick) { 
		 this.tricks = trick; 
	}
	/**
	 * Getter of deck
	 */
	private Deck getDeck() {
	 	 return deck; 
	}
	/**
	 * Setter of deck
	 */
	private void setDeck(Deck deck) { 
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
	
	
	public initialise(){
		for(Player p:players)
			p.getHand().setCard(this.getDeck().pull());
	//	this.setTrump(this.chooseTrump());
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
	/**
	 *  @author Jules
	 *	@since  V0
	 */
	public void finish(){
		for(Player i:players){
			i.setHand(new Hand());
		}
	}
	
	
}