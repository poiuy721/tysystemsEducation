package ch06;

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator2 cal=new Calculator2();
		int val1=10;
		int val2=6;
		
		cal.plus(val1,val2);
		cal.minus(val1,val2);
		cal.multiply(val1,val2);
		cal.divide(val1,val2);
		cal.rest(val1,val2);

	}

}
