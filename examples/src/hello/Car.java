package hello;

public class Car {
	static String company="Hyundai";
	private int wheel;
	private int speed;
	
	public Car() {
		System.out.println("Car()");
	}
	
	public void setWheel(int wheel) {
		this.wheel=wheel;
	}
	public int getWheel() {
		return wheel;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public int getSpeed() {
		return this.speed;
	}
}
