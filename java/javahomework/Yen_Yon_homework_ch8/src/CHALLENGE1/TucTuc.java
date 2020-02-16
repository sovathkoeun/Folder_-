package CHALLENGE1;

public class TucTuc {
	public String plateID = "";
	public float weight;
	int nbCustomers;

	public TucTuc(String string, float f, int i) {
		// TODO Auto-generated constructor stub
		this.plateID = string;
		this.weight = f;
		this.nbCustomers = i;
	}

	public String toString() {
		return "TucTuc [ plate id= " + plateID + " weitht =" + weight + "]";
	}

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
