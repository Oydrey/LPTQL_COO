import dicegame.Dice;
import dicegame.DiceGame;
import dicegame.FakeDiceWith8Faces;
import dicegame.IDiceGame;

public class DiceGameLauncher {

	public static void main(String[] args) {
		
		Dice dice = new FakeDiceWith8Faces();
		
		IDiceGame game = new DiceGame(dice); 
		game.start();
	}

}
