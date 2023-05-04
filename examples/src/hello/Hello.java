package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sum s = new Sum();

		int sum = 0;
		int num = sc.nextInt();

		sum = s.sum(num);

		System.out.println(sum);
	}
}
