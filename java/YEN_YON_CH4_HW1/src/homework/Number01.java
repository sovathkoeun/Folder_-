package homework;

public class Number01 {

	public static void main(String[] args) {
		String[] employee = { "Doung", "Chan", "Minea", "Mesa", "Romdoul", "Veha", "Por", "Kanika" };
		int[] salary = { 560, 560, 500, 500, 190, 190, 560, 700 };
		int max = salary[0];
		int min = salary[0];
		double sum = 0;
		for (int i = 0; i < salary.length; i++) {
			if (max < salary[i]) {
				max = salary[i];
			}
			if (min > salary[i]) {
				min = salary[i];
			}
			sum = sum + salary[i];
		}
		/// Letter a///
		System.out.println("1.Employee who has highest salary:");
		for (int j = 0; j < employee.length; j++) {
			if (max == salary[j]) {
				System.out.println(employee[j] + " has the highest salary of " + "$" + max);
			}
		}
		System.out.println("....................................");

		/// Letter b///
		System.out.println("2.Employee who has lawest salary:");
		for (int k = 0; k < employee.length; k++) {
			if (min == salary[k]) {
				System.out.println(employee[k] + " has the lawest salary of " + "$" + min);
			}
		}
		System.out.println("....................................");

		/// Letter c///
		System.out.println("3.Employee who has lower salary than average: " + sum / salary.length);
		for (int c = 0; c < employee.length; c++) {
			if (salary[c] < sum / salary.length) {
				System.out.println(employee[c] + " : " + salary[c] + "$");
			}
		}
		System.out.println("....................................");

		/// Letter d///
		System.out.println("4.Employee who has higher salary than average: " + sum / salary.length);
		for (int c = 0; c < employee.length; c++) {
			if (salary[c] > sum / salary.length) {
				System.out.println(employee[c] + " : " + salary[c] + "$");
			}
		}
		System.out.println("....................................");

		/// Letter f///
		System.out.println("5.Employee who has same salary:");
		for (int i = 0; i <= salary.length - 1; i++) {
			for (int j = 0; j <= salary.length - 1; j++) {
				if (salary[i] == salary[j] && i != j) {
					System.out.println(employee[i] + ":" + salary[i] + "$");
					break;
				}
			}
		}

	}
}
