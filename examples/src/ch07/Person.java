package ch07;


public class Person {

	private String name;// 이름
	private int age; // 나이
	
	public Person() {
		System.out.println("Person()");
	}
	public Person(String name) {
		this.name=name;
		System.out.println("Person(String)");
	}
	public Person(int age) {
		this.age=age;
		System.out.println("Person(int)");
	}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("Person(String,int)");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("Person.printInfo() : 이름 : "+this.name+" | 나이 : "+age);
	}

}