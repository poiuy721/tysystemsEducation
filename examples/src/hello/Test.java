package hello;

public class Test {
	public static void main(String[] args) {
		//constructor overloading
		Car car=new Car();
		Bus bus=new Bus(4);
		Truck truck=new Truck(4,80);
		Sedan sedan=new Sedan(4,150,"convertable");
		
		System.out.println(car);
		System.out.println(bus);
		System.out.println(truck);
		System.out.println(sedan);
		System.out.println();
		//initialize object array 
		Sedan[] sedanArray=new Sedan[10];
		for(int i=0;i<sedanArray.length;i++) {
			sedanArray[i]=new Sedan(4,i*10);
		}
		System.out.print("sedan array's speed: ");
		for(Sedan s:sedanArray)
			System.out.print(s.getSpeed()+" ");
		System.out.println();
		
		//method overriding
		System.out.println();
		bus.setSpeed(300);
		System.out.println("bus's speed: "+bus.getSpeed()+"\n");
		
		//polymorphism
		Car truck2=new Truck(4,100,5);
		System.out.println("truck2's wheel: "+truck2.getWheel()+"\ntruck2's speed: "+truck2.getSpeed()+"\n");
		Truck truck3=(Truck) truck2;
		System.out.println("truck3's wheel: "+truck3.getWheel()+"\n"
				+ "truck3's speed: "+truck3.getSpeed()+"\n"
						+ "truck3's weight: "+truck3.getWeight());
	}
}
