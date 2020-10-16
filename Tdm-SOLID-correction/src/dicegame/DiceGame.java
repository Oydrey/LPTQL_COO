package dicegame;

public class DiceGame implements IDiceGame{

	private FakeDiceWith8Faces dice;
	private KeyboardInput input;
	
	public DiceGame() {
		super();
		input = new KeyboardInput();
		dice = new  FakeDiceWith8Faces();
	}

	@Override
	public void start() {
		do {
			playOneRound();
		} while (input.readChar() == 'y');
	}

	@Override
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

	@Override
	public int getRandomDiceValue() {
		dice.roll();
		return dice.readValue();
	}

	@Override
	public void displayEntryText() {
		System.out.println("Guess the dice value on next roll : ");
	}

	@Override
	public void displayPlayAgainText() {
		System.out.println("play again ?");
	}

	@Override
	public void displaySuccessText() {
		System.out.println("Well done!");
	}

}
