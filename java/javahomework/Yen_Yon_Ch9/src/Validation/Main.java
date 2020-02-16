package Validation;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Thing> allThings = new ArrayList<>();
		
		//create object Bike
		allThings.add(new Bike("Bike1", 1, false, true));
		allThings.add(new Bike("Bike2", 3, true, false));
		
		
		//create object It_teacher
		allThings.add(new It_teacher("Ronan", 4));
		allThings.add(new It_teacher("Rady", 1));
		
		//create object It_teacher
		allThings.add(new RiceCooker("RiceCooker1", 1,4));
		allThings.add(new RiceCooker("RiceCooker2", 3,600));
		
		
		for (int i = 0; i < allThings.size(); i++) {
			System.out.println(allThings.get(i));
		}
		
		
		

	}

}
