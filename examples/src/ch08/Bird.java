package ch08;

public class Bird extends Animal implements Flyer{
	private int wings;
	public Bird(int age,int wings) {
		super(age);
		this.wings=wings;
	}
	@Override
	public void printInfo() {
		System.out.println("나이="+super.getAge()+" : 날개수="+wings);
	}
	@Override
	public void eat() {
		System.out.println("Bird.eat()");
	}
	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Bird.takeOff()");
	}
	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Bird.land()");
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Bird.fly()");
	}
}
