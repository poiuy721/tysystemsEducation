package ch08;

public class CastingExample {
	public static void main(String[] args) {
		Vehicle v=new Bus();
		
		v.run();
		
		Bus b=(Bus)v;
		b.run();
		b.checkFare();
	}
}
