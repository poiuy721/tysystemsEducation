package ch08;

public class Human extends Animal{
	private String name;
	public Human(int age,String name) {
		super(age);
		this.name=name;
	}
	@Override
	public void printInfo() {
		System.out.println("나이="+super.getAge()+" : 이름="+name);
	}
	@Override
	public void eat() {
		System.out.println("Human.eat()");
	}
}
