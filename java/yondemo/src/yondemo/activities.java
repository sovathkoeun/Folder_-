package yondemo;

public class activities {

	public static void main(String[] args) {

		// 1. We store student ID as follows : lastName.firstName
		String sreyrotId = "OUN-Sreyrot";
		String pisethId = "POEURN-Piseth";

		// 2. Let extract the last name and first name of each students

		String[] sreyrotTokens = sreyrotId.split("-");
		String sreyrotLastName = sreyrotTokens[1];
		System.out.println("Hello, my last name is " + sreyrotLastName);

		String[] pisethTokens = pisethId.split("-");
		String pisethLastName = pisethTokens[1];
		System.out.println("Hello, my last name is " + pisethLastName);
		
	}
	

}
