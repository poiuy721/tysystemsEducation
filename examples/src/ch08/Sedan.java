package ch08;

public class Sedan extends Car implements PassengerModel{
	public Sedan(String name) {
		super(name);
	}

	@Override
	public void getOn() {
		// TODO Auto-generated method stub
		System.out.println(super.getName()+"에 타다");
	}

	@Override
	public void getOff() {
		// TODO Auto-generated method stub
		System.out.println(super.getName()+"에서 내리다");
		
	}
}
