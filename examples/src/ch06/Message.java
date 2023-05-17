package ch06;

public class Message {
	public void printInfo(String msg) {
		System.out.println(msg);
	}
	public void printInfo(int msg) {
		System.out.println(msg);
	}
	public void printInfo(String msg1,int msg2) {
		System.out.println(msg1+", "+msg2);
	}
	public void printInfo(int msg1,String msg2) {
		System.out.println(msg1+", "+msg2);
	}
}
