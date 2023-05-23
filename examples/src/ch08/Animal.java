package ch08;

public abstract class Animal {
	private int age;
	public int getAge() {
		return age;
	}
	public Animal(int age) {
		this.age=age;
	}
	public void printInfo() {
		System.out.println("Animal printInfo()");
	}
	public void eat() {
		System.out.println("Animal.eat()");
	}
}
