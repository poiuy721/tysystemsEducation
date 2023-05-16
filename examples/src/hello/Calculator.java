package hello;

public class Calculator {
	private int val1;
	private int val2;
	
	public Calculator() {}
	public Calculator(int val1,int val2) {
		this.val1=val1;
		this.val2=val2;
	}
	
	public void plus() {
		System.out.println("plus() :: "+val1+" + "+val2+" = "+(val1+val2));
	}
	public void minus() {
		System.out.println("minus() :: "+val1+" - "+val2+" = "+(val1-val2));
	}
	public void multiply() {
		System.out.println("multiply() :: "+val1+" * "+val2+" = "+(val1*val2));
	}
	public void divide() {
		System.out.println("divide() :: "+val1+" / "+val2+" = "+(val1/val2));
	}
	public void rest() {
		System.out.println("rest() :: "+val1+" % "+val2+" = "+(val1%val2));
	}
	public void clear() {
		val1=0;
		val2=0;
	}
	public void printInfo() {
		System.out.println("===== printInfo() ======");
		System.out.println("val1 = "+val1+"  val2 = "+val2);
		System.out.println();
	}
}
