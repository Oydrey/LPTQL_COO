package version5;

public class MandolineSpec extends InstrumentSpec {

	private Style style;
	
	public MandolineSpec(Builder builder, String model, Style style, Type type, Wood backWood, Wood topWood) {
		super(builder, model, type, backWood, topWood);
		this.style = style;
	}
	
	@Override
	public boolean matches(InstrumentSpec searchInstrument) {
		if ((!(searchInstrument instanceof MandolineSpec)) || (!super.matches(searchInstrument))) {
			return false;
		}
		Style searchedStyle = ((MandolineSpec) searchInstrument).getStyle();
		if ((searchedStyle != null) && (!searchedStyle.equals(getStyle()))) {
			return false;
		}
		return true;
	}
	
	public Style getStyle() {
		return style;
	}

}
