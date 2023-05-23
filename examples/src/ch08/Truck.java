package ch08;

public class Truck extends Car implements TruckModel{
	public Truck(String name) {
		super(name);
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		System.out.println(super.getName()+"에 짐을 싣다.");
	}

	@Override
	public void unload() {
		// TODO Auto-generated method stub

		System.out.println(super.getName()+"에서 짐을 내리다.");
	}
}
