
// -------------------------------------------------------------
// CHALLENGE 1   MAGIC NUMBERS
//  Refactor this code to name explicitely all magic numbers
// -------------------------------------------------------------	
public class TimeLibrary {

	
	public static int getNumberOfMinutes(int nbSeconds) {
		return nbSeconds / 60;
	}

	public static int getNumberOfHours(int nbSeconds) {
		return nbSeconds / 3600;
	}
	
	public static int getNumberOfDays(int nbSeconds) {
		return nbSeconds / (3600 * 24);
	}	
}


// -------------------------------------------------------------
// CHALLENGE 2   MAGIC NUMBERS
//  Refactor this code to name explicitely all magic numbers
// -------------------------------------------------------------	
	  

/**
 * Return true if given day is a day for code review
 * @param day the day in the week - 0 for Monday ...
 * @return true if the given day is a day where WEB-B or WEP-A has code review
 */
public static boolean thisIsDayForCodeReview(int day) {
	return day == 0 || day == 2;
}	  