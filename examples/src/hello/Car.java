package hello;

public class Car {
	
	static String company="Hyundai";
	private int wheel;
	private int speed;
	public Car() {}
	public Car(int wheel) {
		this.wheel=wheel;
	}
	public Car(int wheel,int speed) {
		this.wheel=wheel;
		this.speed=speed;
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
	
	public String toString() {
		return "====================\n"
				+ "Car's toString()";
	}
}
