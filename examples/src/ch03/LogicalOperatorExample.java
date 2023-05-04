package ch03;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int cCode='A';
		if((65<=cCode)&(cCode<=90)) {
			System.out.println("A~Z");
		}
		if((97<=cCode)&&(cCode<=122)) {
			System.out.println("a~z");
		}
		if((48<=cCode)&&(cCode<=57)) {
			System.out.println("0~9");
		}
		
		
		int value=6;
		if((value%2==0)|(value%3==0)) {
			System.out.println("Multiple of 2or3");
		}
		
		boolean result=(value%2==0)||(value%3==0);
		if(!result) System.out.println("Not a multiple of 2or3");
	}
}
