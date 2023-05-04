package ch04;

public class IfNestedExample {
	public static void main(String[] args) {
		/*
		 * int score=(int)(Math.random()*20)+81;
		 * 
		 * String grade;
		 * 
		 * if(score>=90) { if(score>=95) grade="A+"; else grade="A"; } else {
		 * if(score>=85) grade="B+"; else grade="B"; } System.out.println(grade);
		 */

		int score = (int) (Math.random() * 20) + 81;
		;
		String grade = " ";

		if (score >= 95)
			grade = "A+";
		else if (score >= 90)
			grade = "A";
		else if (score >= 85)
			grade = "B+";
		else if (score >= 80)
			grade = "B";
		else if (score >= 75)
			grade = "C+";
		else if (score >= 70)
			grade = "C";
		else
			grade = "D+";

		System.out.println("점수: " + score);
		switch (grade) {
		case "A+":
			System.out.println("학점: " + grade);
			break;
		case "A":
			System.out.println("학점: " + grade);
			break;
		case "B+":
			System.out.println("학점: " + grade);
			break;
		case "B":
			System.out.println("학점: " + grade);
			break;
		case "C+":
			System.out.println("학점: " + grade);
			break;
		case "C":
			System.out.println("학점: " + grade);
			break;
		case "D+":
			System.out.println("학점 : " + grade);
		}

	}
}
