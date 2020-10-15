package version4;

public class GuitarSpec {

	public static final int NO_PREF_NUM_STRINGS = -1;
	
	private Builder builder;
	private String model;
	private Type type;
	private int numStrings;
	private Wood backWood;
	private Wood topWood;

	public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.numStrings = numStrings;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public Builder getBuilder() {
		return builder;
	}


	public String getModel() {
		return model;
	}


	public Type getType() {
		return type;
	}


	public int getNumStrings() {
		return numStrings;
	}


	public Wood getBackWood() {
		return backWood;
	}


	public Wood getTopWood() {
		return topWood;
	}


	public boolean matches(GuitarSpec searchGuitar) {
		Builder builder = searchGuitar.getBuilder();
		if ((builder != null) && (!builder.equals(getBuilder()))) {
			return false;
		}
			

		Type type = searchGuitar.getType();
		if ((type != null) && (!type.equals(getType()))) {
			return false;
		}
			

		Wood topWood = searchGuitar.getTopWood();
		if ((topWood != null) && (!topWood.equals(getTopWood()))) {
			return false;
		}
			

		Wood backWood = searchGuitar.getBackWood();
		if ((backWood != null) && (!backWood.equals(getBackWood()))) {
			return false;
		}
			

		String model = searchGuitar.getModel();
		if ((model != null) && (!model.equals("")) 
				&& (!model.toLowerCase().equals(getModel().toLowerCase()))) {
			return false;
		}
		
		int numStrings = searchGuitar.getNumStrings();
		if ((numStrings != NO_PREF_NUM_STRINGS) && (numStrings != getNumStrings())){
			return false;
		}			
		
		return true;
	}
	
}
