package CHALLENGE3;

public abstract class Vehicle {
	public String plateID = "";
	public float weight;

	public Vehicle(String string, float f) {
		// TODO Auto-generated constructor stub
		this.plateID = string;
		this.weight = f;
	}

	public String toString() {
		return " [ plate id= " + plateID + " weitht =" + weight + "]";
	}

	public abstract int getMaximalSpeed();

}
