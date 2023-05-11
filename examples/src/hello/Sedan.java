package hello;

public class Sedan extends Car{
	private String roof;
	

	public Sedan() { super(); }
	public Sedan(int wheel) {super(wheel);}
	public Sedan(int wheel,int speed) {super(wheel,speed);}
	public Sedan(int wheel,int speed,String roof) {
		super(wheel,speed);
		this.roof=roof;
	}
	
	public void setRoof(String roof) {
		this.roof=roof;
	}
	public String getRoof() {
		return roof;
	}
	public String toString() {
		System.out.println("====================\n"
				+ "Sedan's toString()");
		return "wheel: "+Integer.toString(this.getWheel())+
				"\nspeed: "+Integer.toString(this.getSpeed())+
				"\nroof: "+this.roof;
	}
	public void setSpeed(int speed) {
		if(speed<=200)
			super.setSpeed(speed);
		else super.setSpeed(200);
	}
}
