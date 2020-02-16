
// -------------------------------------------------------------
// CHALLENGE 1       COMMENTS	
// Add comments instead of the TODO
// -------------------------------------------------------------	
List<Fruit> getExpiredFruits(List<Fruit> fruits) {
	
	// TODO
	List<Fruit> result = new ArrayList<>();
	for(Fruit fruit : fruits) {
		if (fruit.isExpired) {
			result.add(fruit);
		} 
	}
	return result;
}

//-------------------------------------------------------------
// CHALLENGE 2           COMMENTS
// Add comments instead of the TODO
// -------------------------------------------------------------	
int getNumberOfExpiredFruits(List<Fruit> fruits) {
	
	// TODO
	List<Fruit> result = new ArrayList<>();
	for(Fruit fruit : fruits) {
		if (fruit.isExpired) {
			result.add(fruit);
		} 
	}
	
	// TODO
	int nbExpiredFruits = result.size();
	
	return nbExpiredFruits;
}

//-------------------------------------------------------------
// CHALLENGE 3          COMMENTS
//   1.  Meanfull names : replace xx, yy, zz, ...
//   2.   Add comments instead of the TODO
// -------------------------------------------------------------	

/**
 * TODO
 * @param fruits  TODO
 * @return  TODO
 */
boolean validateTheFruitBox(List<Fruit> fruitsBox) {
	
	// TODO
	int xx = 0;
	for(Fruit fruit : fruitsBox) {
		if (fruit.getType() = "BANANA") {
			xx++;
		} 
	}
	
	// TODO
	int yy = 0;
	for(Fruit fruit : fruitsBox) {
		if (fruit.getType() = "APPLE" && fruit.getColor() = "GREEN") {
			yy++;
		} 
	}
	
	
	// TODO
	int zz = 0;
	for(Fruit fruit : fruitsBox) {
		if (fruit.getType() = "ORANGE" || fruit.getType() = "LEMON") {
			zz++;
		} 
	}
		
	// TODO
	boolean isVAlid = xx>2 &&yy> 3 && zz>1;
	
	return nbExpiredFruits;
}

//-------------------------------------------------------------
// CHALLENGE 4         DRY
// Refactor the code with a function to remove duplicated code
//		- The function shoud take the following prameters:
// -------------------------------------------------------------	

public static void main(String[] args) {

		// Employee is  list of 3 values : first name, last name, age
		List<String> sopeakEmployee = Arrays.asList("sopeak", "riss", "30");
		String sopeakFirstName = sopeakEmployee.get(0);
		System.out.println("Sopeak first name :" + sopeakFirstName);

		String sopeakLastName = sopeakEmployee.get(1);
		System.out.println("Sopeak last name :" + sopeakLastName);

		int sopeakAge = Integer.parseInt(sopeakEmployee.get(2));
		System.out.println("Sopeak age :" + sopeakAge);

		// Employee is  list of 3 values : first name, last name, age
		List<String> radyEmployee = Arrays.asList("rady", "yyy", "27");
		String radyFirstName = radyEmployee.get(0);
		System.out.println("rady first name :" + radyFirstName);

		String radyLastName = radyEmployee.get(1);
		System.out.println("rady last name :" + radyLastName);

		int radyAge = Integer.parseInt(radyEmployee.get(2));
		System.out.println("rady age :" + radyAge);
		
		
		
		// Employee is  list of 3 values : first name, last name, age
		List<String> ronanEmployee = Arrays.asList("ronan", "ogor", "30");
		String ronanFirstName = ronanEmployee.get(0);
		System.out.println("ronan first name :" + ronanFirstName);
		
		String ronanLastName = ronanEmployee.get(1);
		System.out.println("ronan last name :" + ronanLastName);
		
		int ronanAge = Integer.parseInt(ronanEmployee.get(2));
		System.out.println("ronan age :" + ronanAge);
}


