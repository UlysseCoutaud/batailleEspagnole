

/**
 *	@author ulysse TODO
 *	@version /!\ REQUIRED /!\ TODO
 *	@exception TODO
 *	@see  TODO
 *	@since  TODO
 */
public class Card {


	/**
	 *	@author ulysse TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	private String rank;

	
	/**
	 *	@author ulysse TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	private Color color;
	

	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public String getRank() {
	 	 return rank; 
	}

	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public void setRank(String rank) { 
		 this.rank = rank; 
	}

	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public Color getColor() {
	 	 return color; 
	}

	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public void setColor(Color color) { 
		 this.color = color; 
	}

	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public Integer getValue() { 
		switch (this.rank) {
		case "3":
			return 10;
			case "1":
		case "2":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "10":
			return 0;
		case "As":
			return 11;
		case "Roi":
			return 4;
		case "Dame":
			return 3;
		case "Cavalier":
			return 2;
		default:
			break;
		}
		return null;
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
		return "["+this.rank+" of "+this.color.toString()+"]";
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
		System.out.println(this.toString());
	 } 

}