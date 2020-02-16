package yondemo;

public class Teacher_demo {

	public static void main(String[] args) {
		int[] QuizScore = { 90, 80, 50, 40, 70, 30, 60 };
		int pass = 0;
		int fails = 0;
		int maxScore = QuizScore[0];
		int minScore = QuizScore[0];
		int sum = 0;
		int count = 0;
		for (int i = 0; i <= QuizScore.length - 1; i++) {
			if (QuizScore[i] < 50) {
				fails++;

			} else {
				pass++;
			}
			if (maxScore < QuizScore[i]) {
				maxScore = QuizScore[i];
			}
			if (minScore > QuizScore[i]) {
				minScore = QuizScore[i];
			}
			sum = sum + QuizScore[i];
			count++;
		}
		System.out.println(fails + " " + " Students fails and " + pass + " " + "Students pass");
		System.out.println(maxScore + " The student that get max score");
		System.out.println(minScore + " The student that get max score");
		System.out.println(sum / count + " The average of all students");

	}

}
