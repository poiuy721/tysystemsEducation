package ch18;

import java.io.Serializable;

public class Product implements Serializable{

	private static final long serialVersionUID = 7394135165810371117L;
	private String name;
	private int price;
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return name+": "+price;
	}
}
