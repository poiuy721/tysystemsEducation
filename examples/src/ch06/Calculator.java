package ch06;

public class Calculator {
	static double pi=3.142592;
	void powerOn() {
		System.out.println("power on");
	}
	void powerOff() {
		System.out.println("power off");
	}
	static int plus(int x,int y) {
		return x+y;
	}
	static int minus(int x,int y) {
		return x-y;
	}
	double divide(int x,int y) {
		return (double)x/(double)y;
	}
	double areaRectangle(double width) {
		return width*width;
	}
	double areaRectangle(double width,double height) {
		return width*height;
	}
	
}
