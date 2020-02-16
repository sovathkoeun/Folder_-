package CHALLENGE3;

public class BatMobile extends Vehicle {
	public boolean isBatmanHere;

	public BatMobile(String string, float f, boolean b) {
		super(string, f);
		this.isBatmanHere = b;
	}

	public String toString() {
		return " BatMobile " + super.toString();
	}

	@Override
	public int getMaximalSpeed() {
		int defaults = 500;
		if (isBatmanHere == true) {
			defaults = defaults;
		} else {
			defaults = 110;
		}
		return defaults;
	}

}