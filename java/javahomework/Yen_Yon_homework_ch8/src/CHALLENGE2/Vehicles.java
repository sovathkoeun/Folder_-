package CHALLENGE2;

public abstract class Vehicles {

	public String plateID = "";
	public float weight;

	public Vehicles(String string, float f) {

		this.plateID = string;
		this.weight = f;
	}

	public String toString() {
		return " [ plate id= " + plateID + " weiht =" + weight + "]";
	}

	public abstract int getMaximalSpeed();

}
