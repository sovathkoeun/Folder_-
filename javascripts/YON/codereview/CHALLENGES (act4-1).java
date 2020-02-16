

	// -------------------------------------------------------------
	// CHALLENGE 1   COMMENTS
	// Add comments instead of the TODO :
	//			- comments in the method header
	//			- comments in the method body
	// -------------------------------------------------------------	

	/**
	 * get number of positive numbers from a list.
	 * @param numbers   List of numbers
	 * @return   TODO Will display all positive numbers.//return number of positive number
	 */
	int getNumberOfPositiveNumbers(List<Integer> numbers) {
		
		// generate list of positive numbers from list of numbers.
		List<Integer> positiveNumbers = new ArrayList<Integer>();
		for(int number : numbers) {
			if (number >= 0 ) {
				positiveNumbers.add(number);
			}
		}
		
		// count the quantity of positive numbers
		int numberOfPositiveNumbers = positiveNumbers.size();
		
		// return this quantity
		return numberOfPositiveNumbers;
	}
	
	
	
	// -------------------------------------------------------------
	// CHALLENGE 2  COMMENTS
	// Add comments instead of the TODO :
	//			- comments in the method header
	//			- comments in the method body
	// -------------------------------------------------------------

	const NAMES = ["ronan", "rady" /* 100 names here */  ];

	//  TODO html of 5 random names
	//  @return  html code   
	var getFiveNamesRandomlyCode = () => {

		//  create random index list of five names.
		const NUMBER_OF_NAMES = 5;
		var randomIndexes = [];
		for (let i = 0; i < NUMBER_OF_NAMES; i++) {
		  var randomValue = Math.floor(Math.random() * 100);
		  randomIndexes.push(randomValue);
		}
	  
		//  generate html code of 5 random names.
		var htmlCode = "";
		for (let i = 0; i < randomIndexes.length; i++) {
		  let name = NAMES[randomIndexes[i]];
		  htmlCode += `<p>${name}</p> `;
		}
		return htmlCode;
	  };
	  
	  
	  
		
	// -------------------------------------------------------------
	// CHALLENGE 3    : DRY
	// Refactor the code with a function to remove duplicated code
	//		- The function shoud take the following prameters:
	//					- List<String> a list of string
	//					- String a name
	//		and return the nunber of times the given name is contained in the given list
	// -------------------------------------------------------------	

	public static void main(String[] args) {

		// count the number of banana
		List<String> allItem = Arrays.asList("banana", "banana", "apple", "banana", "mango", "mango", "tomato",
				"potato", "carrot", "tomato", "potato", "tomato", "rady", "rith", "rith", "rady", "ronan", "channak");
		int numberOfBanana = 0;
		int numberOfTomatoes = 0;
		int numberOfRith = 0;
		for (String eachItem : allItem) {
			if (eachItem.equals("banana")) {
				numberOfBanana++;
			} else if (eachItem.equals("tomato")) {
				numberOfTomatoes++;
			} else if (eachItem.equals("rith")) {
				numberOfRith++;
			}
		}
		String results = "NUmber of bananas = " + numberOfBanana + "\n" + "NUmber of tomatos=" + numberOfTomatoes + "\n"
				+ "NUmber of rith=" + numberOfRith;
		System.out.println(results);

	}
	  
	  
	  
	// -------------------------------------------------------------
	// CHALLENGE 4		MEANING FULL NAMES
	// Rename function /variables  with meaning full names
	// -------------------------------------------------------------	
	boolean isContaint2pperCases(String Texts) {
		int nbOfUppercaseCharacter = 0;
		for(int i=0; i<Texts.length(); i++) {
			char charOftext = Texts.charAt(i);
			
			// Note : Character.isUpperCase(c) return true if c is an uppercase
			if (Character.isUpperCase(charOftext)){
				nbOfUppercaseCharacter++;
			}
		}
		return nbOfUppercaseCharacter>= 2;
	}
	  