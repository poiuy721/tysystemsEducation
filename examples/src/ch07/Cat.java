package ch07;

public class Cat extends Animal{
	private int legs;
	public Cat(String name,int age,String sex,int legs) {
		super("Cat",name,age,sex);
		this.legs=legs;
	}
	
	public void printInfo() {
		System.out.println("==Cat Info==");
		System.out.println("동물="+super.getType()+" | 이름="+super.getName()+" | 나이="+super.getAge()+" | 성별="+(super.getSex().equals("F")?"여":"남")+" | 다리="+legs+"(개)");
	}
	public void sleep() {
		System.out.println(super.getName()+" :: sleep()");
	}
}
