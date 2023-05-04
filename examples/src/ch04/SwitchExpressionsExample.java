package ch04;

public class SwitchExpressionsExample {
	public static void main(String[] args) {
		char grade='B';
		
		switch(grade) {
		case 'A','a'->{
			System.out.println("a or A");
		}
		case 'B','b'->{
			System.out.println("b or B");
		}
		default->{
			System.out.println("default");
		}
		
		}
		
		switch(grade) {
		case 'A','a'->System.out.println("a");
		case 'B','b'->System.out.println("b");
		default->System.out.println("default");
		}
	}
	
	
}
