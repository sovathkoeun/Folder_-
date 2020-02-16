package yondemo;

import java.util.Scanner; // import the Scanner class 

public class Number3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
		String userName;
		System.out.print("enter..:");
		userName = myObj.nextLine();
		int record = 0;
		switch (userName) {
		case "a":
		case "A":
			record = 10;
			break;
		case "b":
		case "B":
			record = 20;
			break;
		default:
			record = 5;
		}
		int i;
		if (150 % record == 0) {
			for (i = 1; i <= 150 / record; i++) {
				System.out.print("|page" + i + ":" + record);
			}
			System.out.println("|");
		} else {
			for (i = 1; i <= 150 / record; i++) {
				System.out.print("|page" + i + ":" + record);
			}
			System.out.print("|page" + i + ":" + 150 % record);
		}
		System.out.println("|");
	}

}
