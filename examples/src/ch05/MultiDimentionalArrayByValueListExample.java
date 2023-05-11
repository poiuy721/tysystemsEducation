package ch05;

public class MultiDimentionalArrayByValueListExample {
	public static void main(String[] args) {
		int[][] scores = { { 80, 90, 96 }, { 76, 88 } };
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);

		int class1Sum = 0;
		for (int score : scores[0])
			class1Sum += score;
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println(class1Avg);

		int class2Sum = 0;
		for (int score : scores[1])
			class2Sum += score;
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println(class2Avg);

		int totalStudent = 0;
		int totalSum = 0;
		for (int i = 0; i < scores.length; i++) {
			totalStudent += scores[i].length;
			for (int j = 0; j < scores[i].length; j++)
				totalSum += scores[i][j];
		}
		double totalAvg=(double)totalSum/totalStudent;
		System.out.println(totalAvg);

	}
}
