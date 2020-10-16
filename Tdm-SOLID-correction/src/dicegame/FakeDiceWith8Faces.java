package dicegame;

public class FakeDiceWith8Faces extends Dice {

	public FakeDiceWith8Faces() {
		super(8);
	}
	
	@Override
	public void roll() {
		if (this.readValue() == 8)
			super.roll();
		else
			this.setValue(8);
	}
	
}
