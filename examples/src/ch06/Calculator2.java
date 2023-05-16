package ch06;

public class Calculator2 {
	public Calculator2() {}
	
	public void plus(int val1,int val2) {
		System.out.println("plus() :: "+val1+" + "+val2+" = "+(val1+val2));
	}
	public void minus(int val1,int val2) {
		System.out.println("minus() :: "+val1+" - "+val2+" = "+(val1-val2));
	}
	public void multiply(int val1,int val2) {
		System.out.println("multiply() :: "+val1+" * "+val2+" = "+(val1*val2));
	}
	public void divide(int val1,int val2) {
		System.out.println("divide() :: "+val1+" / "+val2+" = "+(val1/val2));
	}
	public void rest(int val1,int val2) {
		System.out.println("rest() :: "+val1+" % "+val2+" = "+(val1%val2));
	}
}
