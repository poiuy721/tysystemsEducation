package ch08;

public class Airplane implements Flyer,Transport{

	@Override
	public void unload() {
		// TODO Auto-generated method stub
		System.out.println("Airplane.unload()");
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Airplane.takeOff()");
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Airplane.land()");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Airplane.fly()");
		
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		System.out.println("Airplane.load()");
	}

}
