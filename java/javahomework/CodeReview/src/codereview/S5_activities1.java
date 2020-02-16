package codereview;


import java.util.Arrays;
import java.util.List;

public class S5_activities1 {

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
