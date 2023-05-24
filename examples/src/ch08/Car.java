package ch08;

public class Car {
	private String name;
	
	public Car() {}
	public Car(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	
	Tire t1=new HankookTire();
	Tire t2=new HankookTire();
	void run() {
		t1.roll();
		t2.roll();
	}
}
