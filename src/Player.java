

/**
 * 	Someone able tout play to the Spanish battle.
 *	@author Jules
 *	@version V0
 */
public abstract class Player {

	/*
	 * CONSTRUCTORS
	 */
	/**
	 *	@author Ulysse
	 *	@param name - the player's name
	 *	@since  V0
	 */
	public Player(String name) {
		super();
		setHand(new Hand());
		this.setPoints(0);
		this.setName(name);
	}

	/*
	 * ATTRIBUTES
	 */
	private Hand hand;

	private Integer points;
	
	private String name;
	
	/*
	 * GETTERS & SETTERS
	 */
	/**
	 * Getter of hand
	 */
	public Hand getHand() {
	 	 return hand; 
	}
	/**
	 * Setter of hand
	 */
	private void setHand(Hand hand) { 
		 this.hand = hand; 
	}
	/**
	 * Getter of points
	 */
	public Integer getPoints() {
	 	 return points; 
	}
	/**
	 * Setter of points
	 */
	private void setPoints(Integer points) { 
		 this.points = points; 
	}
	/**
	 * Getter of name
	 */
	public String getName() {
	 	 return name; 
	}
	/**
	 * Setter of name
	 */
	private void setName(String name) { 
		 this.name = name; 
	}

	
	/*
	 * METHODS
	 */
	/**
	 * 	Add victory points to the player.
	 *	@author Jules
	 *	@param points - number of points to add
	 *	@since  v0
	 */
	public void addPoints(int points) { 
		this.setPoints(this.getPoints()+points);
	 }
	
	/**
	 * 	Take the card into the player's hand.
	 *	@author Ulysse
	 *	@param c - the picked card
	 *	@since  V0
	 */
	public void getCard(Card c){
		this.getHand().takeCard(c);
	}
	

	/**
	 *	@author Jules
	 *	@see java.lang.Object#toString()
	 *	@since V0
	 */
	public String toString() { 
		return "["+this.getName()+"has "+this.getPoints()+" points and his hand is : "+this.getHand().toString()+"]";
	 }

	/**
	 *	@author Jules
	 *	@since  V0
	 */
	public void print() { 
		System.out.println(this.toString());
	 }

	/*
	 * ABSTRACTS METHODS
	 */
	public abstract Card putCard();
	
	/**
	 * 	The player tell if he/she/it to accept the color of the card af the trump for the next play. 
	 * 	The card is suppose to come from the top of the desk and to be putted back at the bottom of it after.
	 *	@author Ulysse
	 *	@param c - the card 
	 *	@return True if the player decides to accept this trump
	 *	@since  V0
	 */
	public abstract boolean acceptTrump(Card c);
}
		