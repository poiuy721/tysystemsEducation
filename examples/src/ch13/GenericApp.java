package ch13;

public class GenericApp {
	public static void main(String[] args) {
		System.out.println("===GenericP===");
		System.out.println("---Person---");
		GenericP<Person> g1=new GenericP<Person>();
		g1.setField(new Person("Paige",20));
		g1.getField().printInfo();
		
		System.out.println("---SuperMan---");
		GenericP<SuperMan> g2=new GenericP<SuperMan>();
		g2.setField(new SuperMan("Clock",40));
		g2.getField().printInfo();
		
		System.out.println("===GenericFH===");
		System.out.println("---UFO---");
		GenericFH<UFO> g10=new GenericFH<UFO>();
		g10.setField(new UFO("쟁반"));
		g10.getField().printInfo();
		g10.getField().fly();
		g10.getField().hidden();
		
		System.out.println("---SuperMan---");
		GenericFH<SuperMan> g11=new GenericFH<SuperMan>();
		g11.setField(new SuperMan("Clock",40));
		g11.getField().printInfo();
		g11.getField().fly();
		g11.getField().hidden();
		
		System.out.println("===GenericPFH===");
		System.out.println("---SuperMan---");
		GenericPFH<SuperMan> g21=new GenericPFH<>();
		g21.setField(new SuperMan("Clock",40));
		g21.getField().printInfo();
		g21.getField().fly();
		g21.getField().hidden();
	}
}
