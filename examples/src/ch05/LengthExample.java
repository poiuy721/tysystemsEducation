package ch05;

public class LengthExample {
	public static void main(String[] args) {
		String ssn="1212123213213";
		int length=ssn.length();
		
		if(length==13)
			System.out.println("correct");
		else System.out.println("wrong");
	}
}
