package ch06;

public class ReportCard {
	private String name;
	private int korean;
	private int english;
	private int math;
	public ReportCard() {}
	public ReportCard(String name) {
		this.name = name;
	}
	public ReportCard(String name, int korean, int english, int math) {
		this.name=name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	public int sum() {
		return this.korean + this.english + this.math;
	}
	public int average() {
		return sum() / 3;
	}
	public char hakjum() {
		switch (average() / 10) {
		case 10: return 'A';
		case 9: return 'A';
		case 8: return 'B';
		case 7: return 'C';
		default: return 'D';
		}
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void printInfo() {
		System.out.println("== 성적 ==");
		System.out.println("이름: " + name);
		System.out.println("국어: " + korean);
		System.out.println("영어: " + english);
		System.out.println("수학: " + math);
		System.out.println("합계: " + sum());
		System.out.println("평균: " + average());	
		System.out.println("학점= " + hakjum());		
	}
}
