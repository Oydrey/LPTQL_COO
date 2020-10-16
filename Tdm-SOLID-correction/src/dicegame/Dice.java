package dicegame;

public abstract class Dice {
	
	private int nbrFaces;
	private int value;
	
	public Dice(int nbrFaces) {
		super();
		this.nbrFaces = nbrFaces;
		roll();
	}
	
	public void roll() {
		value = (int)(Math.random()*nbrFaces) + 1;
	}
	
	public int readValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
}
