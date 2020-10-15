package version5;

public class GuitarSpec extends InstrumentSpec {

	private int numStrings;
	
	public GuitarSpec(Builder builder, String model, int numStrings, Type type, Wood backWood, Wood topWood) {
		super(builder, model, type, backWood, topWood);
		this.numStrings = numStrings;
	}

	@Override
	public boolean matches(InstrumentSpec searchInstrument) {	
		if ((!(searchInstrument instanceof GuitarSpec)) || (!super.matches(searchInstrument))) {
			return false;
		}
		int searchedNumStrings = ((GuitarSpec) searchInstrument).getNumStrings();
		if ((searchedNumStrings != NO_PREF_NUM_STRINGS) && (searchedNumStrings != getNumStrings())){
			return false;
		}
		return true;
	}
	
	public int getNumStrings() {
		return numStrings;
	}
	
}
