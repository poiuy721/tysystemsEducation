package ch06;

import java.util.ArrayList;

public class CarExample {
	public static void main(String[] args) {
		//Car myCar=new Car();
		Car car1=new Car("my car");
		System.out.println(car1.company);
		System.out.println(car1.model+"\n");
		
		Car car2=new Car("my car","red");
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color+"\n");
		
		Car car3=new Car("taxi","black",200);
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println(car3.maxSpeed+"\n");
		
	}
}
