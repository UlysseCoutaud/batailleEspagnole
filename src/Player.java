

public abstract class Player {

	/**
	 * 
	 */
	private Hand hand;
	/**
	 * 
	 */
	private Integer points;
	/**
	 * 
	 */
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
	 * 
	 * @param points 
	 */
	public void addPoints(int points) { 
		// TODO Auto-generated method
	 }
	/**
	 * @Override
	 * @return 
	 */
	public String toString() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 */
	public void print() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @return 
	 */
	public abstract Card putCard(); 

}