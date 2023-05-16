package ch06;

public class User {
	private String name;
	private int age;
	private float height;
	private char sex;
	private boolean marriageYn;

	
	public User() {
	}
	public User(String name,int age,char sex) {
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	public User(String name,int age,char sex,float height,boolean marriageYn) {
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.height=height;
		this.marriageYn=marriageYn;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public void setMarriageYn(boolean marriageYn) {
		this.marriageYn = marriageYn;
	}
	public void printInfo() {
		System.out.println("===== User Info =====");
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("키 : "+height);
		switch(sex) {
		case 'M': System.out.println("성별 : 남"); break;
		case 'W': System.out.println("성별 : 여"); break;
		}
		System.out.println("결혼 여부 : "+(marriageYn?"기혼":"미혼"));
	}
}
