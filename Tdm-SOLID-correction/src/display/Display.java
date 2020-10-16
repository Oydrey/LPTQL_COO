package display;

import dicegame.IDisplay;

public class Display implements IDisplay {
	
	public Display() {
		super();
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
	
	public void displayDiceValue(int diceRollValue) {
		System.out.println("Dice roll..");
		System.out.println("The value is " + diceRollValue);
	}

}
