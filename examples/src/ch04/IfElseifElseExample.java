package ch04;

public class IfElseifElseExample {
	public static void main(String[] args) {
		int score=75;
		
		if(score>=90) {
			System.out.println("100~90");
			System.out.println("A");
			
		}
		else if(score>=80) {
			System.out.println("80~89");
			System.out.println("B");
		}
		else if(score>=70) {
			System.out.println("70~79");
			System.out.println("C");
		}else {
			System.out.println("lower than 70");
			System.out.println("D");
		}
	}
}
