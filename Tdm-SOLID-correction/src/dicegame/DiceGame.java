package dicegame;

public class DiceGame implements IDiceGame{

	private Dice dice;
	private KeyboardInput input;
	
	public DiceGame(Dice dice) {
		super();
		input = new KeyboardInput();
		this.dice = dice;
	}

	@Override
	public void start() {
		do {
			playOneRound();
		} while (input.readChar() == 'y');
	}

	public void playOneRound() {
		displayEntryText();
		int userChoice = input.readInt();
		int diceRollValue = getRandomDiceValue();
		displayDiceValue(diceRollValue);
		if (userChoice == diceRollValue)
			displaySuccessText();
		displayPlayAgainText();
	}

	private void displayDiceValue(int diceRollValue) {
		System.out.println("Dice roll..");
		System.out.println("The value is " + diceRollValue);
	}

	public int getRandomDiceValue() {
		dice.roll();
		return dice.readValue();
	}

	public void displayEntryText() {
		System.out.println("Guess the dice value on next roll : ");
	}

	public void displayPlayAgainText() {
		System.out.println("play again ?");
	}

	public void displaySuccessText() {
		System.out.println("Well done!");
	}

}
