package input;

import java.util.Scanner;

import dicegame.IKeyboardInput;

public class KeyboardInput implements IKeyboardInput{

	private Scanner reader = new Scanner(System.in);
	
	public char readChar() {
		return reader.next().charAt(0);
	}

	public int readInt() {
		return reader.nextInt();
	}

}
