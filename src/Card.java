

/**
 *	@author ulysse TODO
 *	@version /!\ REQUIRED /!\ TODO
 *	@exception TODO
 *	@see  TODO
 *	@since  TODO
 */
public class Card {


	private String rank;
	private Color color;
	

	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public Card(String rank, Color color) {
		super();
		this.rank = rank;
		this.color = color;
	}


	/**
	 * Getter of rank
	 */
	public String getRank() {
	 	 return rank; 
	}

	/**
	 * Setter of rank
	 */
	public void setRank(String rank) { 
		 this.rank = rank; 
	}

	/**
	 *	Getter of color
	 *
	 */
	public Color getColor() {
	 	 return color; 
	}

	/**
	 * Setter of color
	 * 
	 */
	public void setColor(Color color) { 
		 this.color = color; 
	}

	/**
	 *	@author Jules
	 *	@return value of a card.
	 *	@since  V0
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
	 *	@author Jules
	 *	@return Signature of a card.
	 *	@see java.lang.Object#toString()
	 *	@since V0
	 */
	public String toString() { 
		return "["+this.rank+" of "+this.color.toString()+"]";
	 }

	/**
	 *	@author Jules
	 *	@since  V0
	 */
	public void print() { 
		System.out.println(this.toString());
	 } 

}
