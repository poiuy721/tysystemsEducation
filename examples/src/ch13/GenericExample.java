package ch13;

public class GenericExample {
	public static void main(String[] args) {

		Box<String> box1=new Box<>();
		box1.data="annyong";
		
		String str=box1.data;
		System.out.println(str);
		
		Box<Integer> box2=new Box<>();
		box2.data=100;
		int value=box2.data;
		System.out.println(value);
		
	}
}
