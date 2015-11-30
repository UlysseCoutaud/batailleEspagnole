import java.util.ArrayList;
import java.util.Scanner;

/**
 *	batailleEspagnole
 *	
 *	@author coutaudu
 *	@version 0
 *	@since  V0
 */

public class SpanishBattle {

	/**
	 * 	Execution of a SpanishBattle
	 *	@author coutaudu
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nombre de joueurs?");
		
		int nbPlayers = -1;
		while(sc.hasNextInt() && nbPlayers < 2 && nbPlayers > 4){
			nbPlayers = sc.nextInt();
		}
		
		System.out.println("La partie est en nombre de tour(n) ou en score maximal(p)?");
		
		boolean isNbPlay = false;
		String answer = "";
		while((!answer.equals("n") && !answer.equals("p"))){
			answer = sc.next();
		}
		
		isNbPlay = answer.equals("n");
		
		System.out.println("Valeurs?");
		
		int val = sc.nextInt();
		
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
