

/**
 *	@author Jules
 *	@version V0
 */
public abstract class Player {

	
	public Player(Hand hand, Integer points, String name) {
		super();
		this.hand = hand;
		this.points = points;
		this.name = name;
	}

	private Hand hand;

	private Integer points;
	
	private String name;
	/**
	 * Getter of hand
	 */
	public Hand getHand() {
	 	 return hand; 
	}
	/**
	 * Setter of hand
	 */
	public void setHand(Hand hand) { 
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
	public void setPoints(Integer points) { 
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
	public void setName(String name) { 
		 this.name = name; 
	}

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
		return "["+this.name+"has "+this.points+" points and his hand is : "+this.hand.toString()+"]";
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
		