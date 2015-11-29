

/**
 *	@author ulysse TODO
 *	@version /!\ REQUIRED /!\ TODO
 *	@exception TODO
 *	@see  TODO
 *	@since  TODO
 */
public abstract class Player {

	
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
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public void addPoints(int points) { 
		// TODO Auto-generated method
	 }

	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see java.lang.Object#toString()
	 *	@since TODO
	 */
	public String toString() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public void print() { 
		// TODO Auto-generated method
	 }

	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public abstract Card putCard(); 

}