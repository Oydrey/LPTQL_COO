package version5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List<Instrument> instruments;

	public Inventory() {
		instruments = new LinkedList<>();
	}

	public void addInstrument(Instrument instrument) {
		instruments.add(instrument);
	}

	public Instrument getGuitar(String serialNumber) {
		for (Iterator<Instrument> i = instruments.iterator(); i.hasNext();) {
			Instrument instrument = i.next();
			if (instrument.getSerialNumber().equals(serialNumber)) {
				return instrument;
			}
		}
		return null;
	}

	public List<Instrument> search(InstrumentSpec searchInstrument) {		
		List<Instrument> listInstrument = new ArrayList<>();

		for (Iterator<Instrument> i = instruments.iterator(); i.hasNext();) {
			Instrument instrument = i.next();

			if (instrument.getSpec().matches(searchInstrument)) {
				listInstrument.add(instrument);
			}			
		}
		return listInstrument;
	}

}
