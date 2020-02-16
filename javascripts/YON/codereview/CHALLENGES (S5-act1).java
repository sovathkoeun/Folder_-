
// -------------------------------------------------------------
// CHALLENGE 1       COMMENTS	
// Add comments instead of the TODO
// generate list of expire of fruits-------------------------------------------------------------	
List<Fruit> getExpiredFruits(List<Fruit> fruits) {
	
	//generate list of expire fruits from list of fruits
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
// generate list of expire of fruits-------------------------------------------------------------	
int getNumberOfExpiredFruits(List<Fruit> fruits) {
	
	//generate list of expire fruits from list of fruits
	List<Fruit> result = new ArrayList<>();
	for(Fruit fruit : fruits) {
		if (fruit.isExpired) {
			result.add(fruit);
		} 
	}
	
	// count the quantity of expire fruits
	int nbExpiredFruits = result.size();
	
	return nbExpiredFruits;
}

//-------------------------------------------------------------
// CHALLENGE 3          COMMENTS
//   1.  Meanfull names : replace xx, yy, zz, ...
//   2.   Add comments instead of the TODO
// -------------------------------------------------------------	

/**
 * get fruits of banana,green apple,orange and lemon  from a list
 * @param fruitsBox List of fruits
 * @return  return banana,green apple,orange and lemon. 
 */
boolean validateTheFruitBox(List<Fruit> fruitsBox) {
	
	// count the banana in list
	int countOfBanana = 0;
	for(Fruit fruit : fruitsBox) {
		if (fruit.getType() = "BANANA") {
			countOfBanana++;
		} 
	}
	
	// count the green apple in list
	int countGreenApple = 0;
	for(Fruit fruit : fruitsBox) {
		if (fruit.getType() = "APPLE" && fruit.getColor() = "GREEN") {
			countGreenApple++;
		} 
	}
	
	
	// TODO count the orange and lemon apple in list
	int countOrangeAndLemon = 0;
	for(Fruit fruit : fruitsBox) {
		if (fruit.getType() = "ORANGE" || fruit.getType() = "LEMON") {
			countOrangeAndLemon++;
		} 
	}
		
	// check count the banana greater than 2 , check count green apple greater than 3 ,check the orange and lemon greater than one or not.
	boolean isVAlid = countOfBanana>2 &&countGreenApple> 3 && countOrangeAndLemon>1;
	
	return nbExpiredFruits;
}

//-------------------------------------------------------------
// CHALLENGE 4         DRY
// Refactor the code with a function to remove duplicated code
//		- The function shoud take the following prameters:
// -------------------------------------------------------------	

public static void main(String[] args) {

		List<String> sopeakEmployee = Arrays.asList("sopeak", "riss", "30");
		List<String> radyEmployee = Arrays.asList("rady", "yyy", "27");
		List<String> ronanEmployee = Arrays.asList("ronan", "ogor", "30");
		printEmployeeData(sopeakEmployee);
		printEmployeeData(radyEmployee);
		printEmployeeData(ronanEmployee);

	}

	public static void printEmployeeData(List<String> employee) {

		String firstName = employee.get(0);
		System.out.println(firstName + " last name :" + firstName);

		String lastName = employee.get(1);
		System.out.println(firstName + " last name :" + lastName);

		int age = Integer.parseInt(employee.get(2));
		System.out.println(firstName + " age :" + age);

	}

}


