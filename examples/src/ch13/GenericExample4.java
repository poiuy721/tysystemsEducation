package ch13;

public class GenericExample4 {
	public static <T> Box<T> boxing(T t){
		Box<T> box=new Box<>();
		box.setData(t);
		return box;
	}
	
	public static void main(String[] args) {
		Box<Integer> box1=boxing(100);
		System.out.println(box1.getData());
		
		Box<String> box2=boxing("홍");
		System.out.println(box2.getData());
	}
}
