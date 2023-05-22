package ch07;

public class CarExample {
	public static void main(String[] args) {
		Carr c=new Carr();
		
		c.tire=new Tire();
		c.run();
		
		c.tire=new HankookTire();
		c.run();
		
		c.tire=new KumhoTire();
		c.run();
	}
}
