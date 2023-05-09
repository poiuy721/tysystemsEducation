package ch06;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc=new Calculator();
		myCalc.powerOn();
		
		/*
		 * System.out.println(myCalc.plus(5, 6)); System.out.println(myCalc.divide(10,
		 * 4));
		 * 
		 * myCalc.powerOff();
		 * 
		 * System.out.println(myCalc.areaRectangle(10));
		 * System.out.println(myCalc.areaRectangle(10,20));
		 */
		
		double result1=10*10*Calculator.pi;
		int result2=Calculator.plus(10, 5);
		int result3=Calculator.minus(10, 5);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
