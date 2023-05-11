package hello;

public class Bus extends Car {
	private int seat;
	
	public Bus() { super(); }
	public Bus(int wheel) {super(wheel);}
	public Bus(int wheel,int speed) {super(wheel,speed);}
	public Bus(int wheel,int speed,int seat) {
		super(wheel,speed);
		this.seat=seat;
	}
	
	
	public void setSeat(int seat) {
		this.seat=seat;
	}
	public int getSeat() {
		return seat;
	}
	public String toString() {
		System.out.println("====================\n"
				+ "Bus's toString()");
		return "wheel: "+Integer.toString(this.getWheel())+
				"\nspeed: "+Integer.toString(this.getSpeed())+
				"\nseat: "+Integer.toString(this.seat);
	}
	public void setSpeed(int speed) {
		if(speed<=120)
			super.setSpeed(speed);
		else super.setSpeed(120);
	}
}
