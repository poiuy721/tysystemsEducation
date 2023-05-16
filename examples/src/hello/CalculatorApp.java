package hello;
public class CalculatorApp {

		public static void main(String[] args) {
			Calculator cal=new Calculator(10,6);
			
			cal.plus();
			cal.minus();
			cal.multiply();
			cal.divide();
			cal.rest();
			
			cal.printInfo();
			cal.clear();
			cal.printInfo();

		}

	}

