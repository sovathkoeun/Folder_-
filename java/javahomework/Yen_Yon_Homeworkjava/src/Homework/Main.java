package Homework;

import java.util.Arrays;
import java.util.List;

public class Main {

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

}
