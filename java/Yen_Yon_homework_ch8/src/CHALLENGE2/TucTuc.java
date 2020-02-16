package CHALLENGE2;

import CHALLENGE3.Vehicle;

public class TucTuc extends Vehicles {
	int nbCustomers;

	public TucTuc(String string, float f, int i) {
		super(string, f);
		this.nbCustomers = i;
	}

	public String toString() {
		return " TucTuc " + super.toString();
	}

	@Override
	public int getMaximalSpeed() {
		int defaults = 130;
		if (nbCustomers == 0) {
			defaults = defaults;
		} else {
			defaults = defaults - nbCustomers * 5;
		}
		return defaults;
	}

}
