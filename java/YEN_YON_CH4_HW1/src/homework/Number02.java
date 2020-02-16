package homework;

public class Number02 {

	public static void main(String[] args) {
		int[] numbers = new int[15];
		int count = 0;
		String index = "";
		for (int i = 0; i < numbers.length; i++) {
			int random = (int) (Math.random() * 11 + 0);
			numbers[i] = random;
			System.out.print(numbers[i] + " ");
			if (numbers[i] == 5) {
				count++;
				index = index + i + " ";
			}
		}
		System.out.println();
		if (count != 0) {
			System.out.println("There are " + count + " of number of 5 in index as bellow.");
			System.out.println("Index: " + index);
		} else {
			System.out.println("Number 5 not found!");
		}
	}
}
