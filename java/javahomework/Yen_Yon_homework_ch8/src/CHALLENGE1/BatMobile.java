package CHALLENGE1;

public class BatMobile {
	public String plateID = "";
	public float weight;
	public boolean isBatmanHere;

	public BatMobile(String string, float f, boolean b) {
		// TODO Auto-generated constructor stub
		this.plateID = string;
		this.weight = f;
		this.isBatmanHere = b;
	}

	public String toString() {
		return "BatMobile [ plate id= " + plateID + " weitht =" + weight + "]";
	}

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
