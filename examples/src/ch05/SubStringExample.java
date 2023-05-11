package ch05;

public class SubStringExample {
	public static void main(String[] args) {
		String ssn="121212-3542154";
		String firstNum=ssn.substring(0,6);
		String lastNum=ssn.substring(7);
		
		System.out.println(firstNum);
		System.out.println(lastNum);
	}
}
