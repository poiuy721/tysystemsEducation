package hello;

public class Bus extends Car {
	private int seat;
	
	public Bus() {
		System.out.println("Bus()");
	}
	
	public void setSeat(int seat) {
		this.seat=seat;
	}
	public int getSeat() {
		return seat;
	}
}
