package ch05;

public class GarbageObjectExample {
	public static void main(String[] args) {
		String hobby="trip";
		hobby=null;
		
		String kind1="car";
		String kind2=kind1;
		kind1=null;
		System.out.println(kind2);
	}
}
