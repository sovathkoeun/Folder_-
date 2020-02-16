package CHALLENGE3;

public class MiniVan extends Vehicle {
	int nbCustomers;

	public MiniVan(String string, float f, int i) {
		super(string, f);
		this.nbCustomers = i;
	}

	public String toString() {
		return " MiniVan " + super.toString();
	}

	@Override
	public int getMaximalSpeed() {
		int defaults = 130;
		if (nbCustomers == 0) {
			defaults = defaults;
		} else {
			defaults = defaults - nbCustomers * 10;
		}
		return defaults;

	}

}
