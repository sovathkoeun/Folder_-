package codereview;

import java.util.Arrays;
import java.util.List;

public class S4_activities_1 {

	public static void main(String[] args) {

		// count the number of banana
		List<String> fruits = Arrays.asList("banana", "banana", "apple", "banana", "mango", "mango");
		int numberOfBanana = printText(fruits, "banana");

		// count the number of tomato
		List<String> vegetables = Arrays.asList("tomato", "potato", "carrot", "tomato", "potato", "tomato");
		int numberOfTomatoes = printText(vegetables, "tomato");

		// count the number of rith
		List<String> teachers = Arrays.asList("rady", "rith", "rith", "rady", "ronan", "channak");
		int numberOfRith = printText(teachers, "rith");

		System.out.println("NUmber of bananas=" + numberOfBanana);
		System.out.println("NUmber of tomatos=" + numberOfTomatoes);
		System.out.println("NUmber of rith=" + numberOfRith);
	}

	public static int printText(List<String> texts, String name) {
		int numberOfname = 0;
		for (String text : texts) {
			if (text.equals(name)) {
				numberOfname++;
			}
		}
		return numberOfname;
	}

}
