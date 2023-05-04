package ch04;

public class MultiplicationTableExample {
	public static void main(String[] args) {
		/*
		 * for (int m = 2; m <= 9; m++) { System.out.println("***" + m + "***"); for
		 * (int n = 1; n <= 9; n++) System.out.println(m * n); }
		 */

		int j = 2;
		while (j <= 9) {
			System.out.println(j + " 단");
			int k = 1;
			while (k <= 9) {
				System.out.println(j + "x" + k + "=" + (j * k));
				k++;
			}
			j++;
		}

	}
}
