package ch04;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String inputString;
		
		do {
			inputString=sc.nextLine();
			System.out.println(inputString);
		}while(!inputString.equals("q"));
		
		System.out.println("quit");
	}
}
