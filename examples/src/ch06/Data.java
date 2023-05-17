package ch06;

public class Data {
	private int number;
	private static int count;
	
	public Data() {
		number++;
		count++;
	}
	
	public void printInfo() {
		System.out.println("번호="+number);
		System.out.println("카운트="+count);
	}
}
