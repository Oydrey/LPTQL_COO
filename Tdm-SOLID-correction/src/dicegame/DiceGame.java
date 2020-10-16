package dicegame;

public class DiceGame implements IDiceGame{

	private Dice dice;
	private KeyboardInput input;
	private Display display;
	
	public DiceGame(Dice dice) {
		super();
		input = new KeyboardInput();
		display = new Display();
		this.dice = dice;
	}

	@Override
	public void start() {
		do {
			playOneRound();
		} while (input.readChar() == 'y');
	}

	public void playOneRound() {
		display.displayEntryText();
		int userChoice = input.readInt();
		int diceRollValue = getRandomDiceValue();
		display.displayDiceValue(diceRollValue);
		if (userChoice == diceRollValue) {
			display.displaySuccessText();
		}
		display.displayPlayAgainText();
	}

	public int getRandomDiceValue() {
		dice.roll();
		return dice.readValue();
	}

	

}
