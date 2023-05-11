package hello;

public class Truck extends Car{
	private int weight;
	

	public Truck() { super(); }
	public Truck(int wheel) {super(wheel);}
	
	public Truck(int wheel,int speed) {super(wheel,speed);}
	
	public Truck(int wheel,int speed,int weight) {
		super(wheel,speed);
		this.weight=weight;
	}
	
	public void setWeight(int weight) {
		this.weight=weight;
	}
	public int getWeight() {
		return weight;
	}
	public String toString() {
		System.out.println("====================\n"
				+ "Truck's toString()");
		return "wheel: "+Integer.toString(this.getWheel())+
				"\nspeed: "+Integer.toString(this.getSpeed())+
				"\nweight: "+Integer.toString(this.weight);
	}
	public void setSpeed(int speed) {
		if(speed<=100)
			super.setSpeed(speed);
		else super.setSpeed(100);;
	}
}
