import java.util.ArrayList;
import java.util.Scanner;

/**
 *	batailleEspagnole
 *	
 *	@author coutaudu TODO (classes and interfaces only, required)
 *	@version /!\ REQUIRED /!\ TODO (classes and interfaces only, required.)
 *	@see  TODO
 *	@since  TODO
 */

/**
 *	@author coutaudu TODO
 *	@version /!\ REQUIRED /!\ TODO
 *	@exception TODO
 *	@see  TODO
 *	@since  TODO
 */
public class SpanishBattle {

	/**
	 *	@author coutaudu TODO
	 *	@param TODO
	 *	@return TODO
	 *	@exception TODO
	 *	@see  TODO
	 *	@since  TODO
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int nbPlayers = -1;
		while(sc.hasNextInt() && nbPlayers < 2 && nbPlayers > 4){
			nbPlayers = sc.nextInt();
		}
		
		boolean isNbPlay = false;
		String answer = null;
		while(sc.hasNext() && answer == null || (!answer.equals("n") && !answer.equals("p"))){
			answer = sc.next();
		}
		
		isNbPlay = answer.equals("n");
		
		int val = -1;
		while(sc.hasNextInt() && val == -1){
			val = sc.nextInt();
		}
		
		String name = "toto";

		// create game
		ArrayList<Player> players = new ArrayList<>();
		players.add(new HumanPlayer(name));
		
		int i = 1;
		while(i < nbPlayers){
			players.add(new AutomataPlayer("ia "+i));
			i++;
		}
		
		if(isNbPlay){
			GameNbPlay g = new GameNbPlay(players, new ArrayList<Play>(), val);
			g.run();
		}
		else{
			GameMaxPoints g = new GameMaxPoints(players, new ArrayList<Play>(), val);
			g.run();
		}
		
	}

}
