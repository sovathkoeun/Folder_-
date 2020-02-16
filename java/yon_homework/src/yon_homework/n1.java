package yon_homework;

public class n1 {

	public static void main(String[] args) {
		String[] employee = { "Doung", "Chan", "Minea", "Mesa", "Romdoul", "Veha", "Por", "Kanika" };
		int[] salary = { 560, 560, 500, 500, 190, 190, 560, 700 };
		int maxSalary = salary[0];
		int minSalary = salary[0];
		int sum =0;
	
	
		int i;
		int j;
		for (i = 0; i < salary.length; i++) {
			if (maxSalary < salary[i]) {
				maxSalary = salary[i];
			}
			if (minSalary > salary[i]) {
				minSalary = salary[i];
			}
			sum = sum+salary[i];
			if(salary[i] ==salary[i]) {
				System.out.println(salary[i]);
			}
		}
		//1
		for (j = 0; j < salary.length; j++) {
			if (maxSalary == salary[j]) {
				System.out.println("1 .Employee who has highest salary:");
				System.out.println(employee[j] + " has the highest salary of "  +"$"+maxSalary);
			}
		}
		System.out.println("..................................");
		//2
		for (j = 0; j < salary.length; j++) {
			if (minSalary == salary[j]) {
				System.out.println("2 .Employee who has lowest salary:");
				System.out.println(employee[j] + " has the lowest salary of "  +"$"+minSalary);
			}
		}
		System.out.println("..................................");
		//3
		System.out.println("3.Employee who has lower salary than average: "+sum/salary.length);
		for (j = 0; j < salary.length; j++) {
			if(salary[j]<sum/salary.length) {
				System.out.println(employee[j]+": "+salary[j]+"$");
			}
		}
		System.out.println("..................................");
		
		//4
		System.out.println("4.Employee who has higher salary than average: "+sum/salary.length);
		for (j = 0; j < salary.length; j++) {
			if(salary[j]>=sum/salary.length) {
				System.out.println(employee[j]+": "+salary[j]+"$");
			}
		}
		System.out.println("..................................");
		
		//5
//		System.out.println("5.Employee who has higher salary than average: "+sum/salary.length);
//		for (j = 0; j < salary.length; j++) {
//			if(salary[j] == salary[j]) {
//				System.out.println(employee[j]+": "+salary[j]+"$");
//			}
//		}
//		System.out.println("..................................");
		
		
	}

}
