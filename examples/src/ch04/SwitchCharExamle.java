package ch04;

public class SwitchCharExamle {
	public static void main(String[] args) {
		char grade='B';
		
		/*
		 * switch(grade) { case 'A': case 'a': System.out.println("a or A"); break; case
		 * 'B': case 'b': System.out.println("b or B"); break; default:
		 * System.out.println("default"); }
		 */
		
		if(grade=='A'||grade=='a')
			System.out.println("우수 회원입니다.");
		else if(grade=='B'||grade=='b')
			System.out.println("일반 회원입니다.");
		else
			System.out.println("손님입니다.");
		
		
	}
}
