package version3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		guitars.add(new Guitar(serialNumber, price, builder, model, type, backWood, topWood));
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	public ArrayList<Guitar> search(GuitarSpec searchGuitar) {		

		ArrayList<Guitar> listGuitar = new ArrayList<>();

		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {

			Guitar guitar = i.next();

			Builder builder = searchGuitar.getBuilder();
			if ((builder != null) && (!builder.equals(guitar.getGuitarSpec().getBuilder())))
				continue;

			Type type = searchGuitar.getType();
			if ((type != null) && (!type.equals(guitar.getGuitarSpec().getType())))
				continue;

			Wood topWood = searchGuitar.getTopWood();
			if ((topWood != null) && (!topWood.equals(guitar.getGuitarSpec().getTopWood())))
				continue;

			Wood backWood = searchGuitar.getBackWood();
			if ((backWood != null) && (!backWood.equals(guitar.getGuitarSpec().getBackWood())))
				continue;

			String model = searchGuitar.getModel();
			if ((model != null) && (!model.equals("")) 
					&& (!model.toLowerCase().equals(guitar.getGuitarSpec().getModel().toLowerCase())))
				continue;

			listGuitar.add(guitar);
		}
		return listGuitar;
	}

}
