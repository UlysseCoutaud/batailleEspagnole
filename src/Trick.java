

import java.util.List;

import batailleEspagnole.Color;

/**
 *	@author Jules
 *	@version V0
 */
public class Trick {

	public Trick(List<Card> cards, List<Player> players) {
		super();
		this.cards = cards;
		this.players = players;
	}


	public List<Card> cards;
	
	public List<Player> players;
	
	/**
	 * Getter of cards
	 */
	public List<Card> getCards() {
	 	 return cards; 
	}
	
	/**
	 * Setter of cards
	 */
	public void setCards(List<Card> cards) { 
		 this.cards = cards; 
	}
	
	/**
	 * Getter of players
	 */
	public List<Player> getPlayers() {
	 	 return players; 
	}
	
	/**
	 * Setter of players
	 */
	public void setPlayers(List<Player> players) { 
		 this.players = players; 
	}

	/**
	 *	@author Jules
	 *	@return the value of the trick
	 *	@since  V0
	 */
	public Integer getValue() { 
		int sum=0;
		for(int i=0;i<this.getCards().size();i++)
			sum+=this.getCards().get(i).getValue();
		return sum;
	 }

	/**
	 *	@author Jules
	 *	@param the player who is playing.
	 *	@since  V0
	 */
	public void next(Player player) { 
		this.getPlayers().add(player);
		this.getCards().add(player.putCard());
	 }


	/**
	 *  Will compare each cards of the trick and find the best one.
	 *	@author Jules
	 *  @param the current trump in this Play
	 *  @return the winner of this trick.
	 *	@since V0
	 */
	public Player getWinner(Color trump) { 
		int currentwinner=0;
		boolean isTrump; 
		Color color=this.getCards().get(0).getColor();
		isTrump=(color==trump);
		for(int i=1;i<this.getCards().size();i++){
			if(this.getCards().get(i).getColor()==this.getCards().get(currentwinner).getColor() && this.getCards().get(i).getRank().compareTo(this.getCards().get(currentwinner).getRank())>0 || !isTrump && this.getCards().get(i).getColor()==trump ){
				currentwinner=i;
				isTrump=(this.getCards().get(i).getColor()==trump);
			}
		}
		return this.getPlayers().get(currentwinner);
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
		String result="[";
		for(int i=0;i<this.getPlayers().size();i++)
			result+=this.getPlayers().get(i).toString() +" : "+ this.getCards().toString()+" ";
		result+="]";
		return result;
	} 	

}