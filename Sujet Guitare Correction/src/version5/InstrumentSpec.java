package version5;

public abstract class InstrumentSpec {

	public static final int NO_PREF_NUM_STRINGS = -1;
	
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	
	public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public boolean matches(InstrumentSpec searchInstrument) {
		Builder builder = searchInstrument.getBuilder();
		if ((builder != null) && (!builder.equals(getBuilder()))) {
			return false;
		}
			
		Type type = searchInstrument.getType();
		if ((type != null) && (!type.equals(getType()))) {
			return false;
		}
			
		Wood topWood = searchInstrument.getTopWood();
		if ((topWood != null) && (!topWood.equals(getTopWood()))) {
			return false;
		}
			
		Wood backWood = searchInstrument.getBackWood();
		if ((backWood != null) && (!backWood.equals(getBackWood()))) {
			return false;
		}
			
		String model = searchInstrument.getModel();
		if ((model != null) && (!model.equals("")) 
				&& (!model.toLowerCase().equals(getModel().toLowerCase()))) {
			return false;
		}
		
		return true;
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

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}
	
	
	
}
