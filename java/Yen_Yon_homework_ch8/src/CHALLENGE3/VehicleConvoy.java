package CHALLENGE3;

import java.util.ArrayList;
import java.util.List;

import CHALLENGE2.Vehicles;

public class VehicleConvoy {

	List<Vehicle> vechicle = new ArrayList<Vehicle>();

	public void addVehicle(Vehicle vehicle) {
		vechicle.add(vehicle);
	};

	public int getMaximalSpeed() {
		int theLowestOfVehicles = vechicle.get(0).getMaximalSpeed();
		for (int i = 0; i < vechicle.size(); i++) {
			if (theLowestOfVehicles > vechicle.get(i).getMaximalSpeed()) {
				theLowestOfVehicles = vechicle.get(i).getMaximalSpeed();
			}
		}
		return theLowestOfVehicles;

	}

}
