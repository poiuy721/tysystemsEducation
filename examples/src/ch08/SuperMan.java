package ch08;

public class SuperMan extends Human implements Flyer{

	public SuperMan(int age, String name) {
		super(age, name);
	}

	@Override
	public void eat() {
		System.out.println("SuperMan.eat()");
	}
	@Override
	public void takeOff() {
		// TODO Auto-generated method stub

		System.out.println("SuperMan.takeOff()");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub

		System.out.println("SuperMan.land()");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("SuperMan.fly()");
		
	}

}
