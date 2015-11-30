

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
		for(int i=0;i<cards.size();i++)
			sum+=cards.get(i).getValue();
		return sum;
	 }

	/**
	 *	@author Jules
	 *	@param the player who is playing.
	 *	@since  V0
	 */
	public void next(Player player) { 
		players.add(player);
		cards.add(player.putCard());
	 }


	/**
	 *	@author Jules
	 *  @param the current trump in this Play
	 *  @return the winner of this trick.
	 *	@since V0
	 */
	public Player getWinner(Color trump) { 
		int currentwinner=0;
		boolean isTrump; 
		Color color=cards.get(0).getColor();
		isTrump=(color==trump);
		for(int i=1;i<cards.size();i++){
			if(cards.get(i).getColor()==cards.get(currentwinner).getColor() && cards.get(i).getRank().compareTo(cards.get(currentwinner).getRank())>0 || !isTrump && cards.get(i).getColor()==trump ){
				currentwinner=i;
				isTrump=(cards.get(i).getColor()==trump);
			}
		}
		return players.get(currentwinner);
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
		for(int i=0;i<players.size();i++)
			result+=players.get(i).toString() +" : "+ cards.toString()+" ";
		result+="]";
		return result;
	} 	

}