package ch05;

public class CharAtExample {
	public static void main(String[] args) {
		String ssn="1212123434343";
		char sex=ssn.charAt(6);
		switch(sex) {
		case '1':
		case '3':
			System.out.println("male"); break;
		case '2':
		case '4':
			System.out.println("female"); break;
			
		}
	}
}
