

/**
 *	@author ulysse TODO
 *	@version /!\ REQUIRED /!\ TODO
 *	@exception TODO
 *	@see  TODO
 *	@since  TODO
 */
public class Card {


	private Rank rank;
	private Color color;


	/**
	 *	@author ulysse TODO
	 *	@param TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public Card(Rank rank, Color color) {
		super();
		this.setRank(rank);
		this.setColor(color);
	}


	/**
	 * Getter of rank
	 */
	public Rank getRank() {
	 	 return rank; 
	}

	/**
	 * Setter of rank
	 */
	private void setRank(Rank rank) { 
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
	private void setColor(Color color) { 
		 this.color = color; 
	}

	/**
	 *	@author Jules
	 *	@return value of a card.
	 *	@since  V0
	 */
	public Integer getValue() { 
		switch (this.rank) {
		case Trois:
			return 10;
		case Un:
		case Deux:
		case Quatre:
		case Cinq:
		case Six:
		case Sept:
		case Huit:
		case Neuf:
		case Dix:
			return 0;
		case As:
			return 11;
		case Roi:
			return 4;
		case Dame:
			return 3;
		case Cavalier:
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
