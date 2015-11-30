

/**
 *	@author Jules
 *	@version V0
 */
public abstract class Player {

	/*
	 * CONSTRUCTORS
	 */
	/**
	 *	@author ulysse
	 *	@param hand - the hand
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
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
	 *	@author Jules
	 *	@since  v0
	 */
	public void addPoints(int points) { 
		this.setPoints(this.getPoints()+points);
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

	public abstract Card putCard();
}
		