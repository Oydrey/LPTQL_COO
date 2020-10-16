import dicegame.Dice;
import dicegame.DiceGame;
import dicegame.FakeDiceWith8Faces;
import dicegame.IDiceGame;
import dicegame.IDisplay;
import dicegame.IKeyboardInput;
import display.Display;
import input.KeyboardInput;

public class DiceGameLauncher {

	public static void main(String[] args) {
		
		Dice dice = new FakeDiceWith8Faces();
		IKeyboardInput input = new KeyboardInput();
		IDisplay display = new Display();
		
		IDiceGame game = new DiceGame(dice, input, display); 
		game.start();
	}

}
