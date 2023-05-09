package ch06;

public class Car {
	String company="Hyundai";
	String model;
	String color;
	int maxSpeed;
	int gas;
	int speed;
	Car(){}
	Car(String model){this.model=model;}
	Car(String model,String color){this(model,color,250);}
	Car(String model,String color,int maxSpeed){
		this.model=model; this.color=color; this.maxSpeed=maxSpeed;
	}
	
	void setGas(int gas) {this.gas=gas;}
	boolean isLeftGas() {
		if(gas==0) return false;
		return true;
	}
	void setSpeed(int speed) {
		this.speed=speed;
	}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("gas "+gas+" left");
				gas--;
			}
			else {
				System.out.println("stop");
				return;
			}
		}
	}
	void run2() {
		this.setSpeed(100);
		System.out.println(this.speed);
	}
}
