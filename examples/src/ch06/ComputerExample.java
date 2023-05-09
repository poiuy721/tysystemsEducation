package ch06;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom=new Computer();
		System.out.println(myCom.sum(1,2,3));
		System.out.println(myCom.sum(1,2,3,4,5));
		
		int[] values= {1,2,3,4,5};
		System.out.println(myCom.sum(values));
		
		System.out.println(myCom.sum(new int[] {1,2,3,4,5}));
		
	}
	
}
