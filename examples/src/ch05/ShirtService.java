package ch05;

import ch06.Shirt;

public class ShirtService {
	public static Shirt makeService(String name,String color,String company,String materials,String size,int price) {
		return new Shirt(name,color,company,materials,size,price);
	}
}
