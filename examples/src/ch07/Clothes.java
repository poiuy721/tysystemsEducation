package ch07;

public class Clothes {
	private String product;
	private String color;
	private String brand;
	public String getProduct() {
		return product;
	}
	public String getColor() {
		return color;
	}
	public String getBrand() {
		return brand;
	}
	public Clothes(String product,String color,String brand) {
		this.product=product;
		this.color=color;
		this.brand=brand;
	}
	public void printInfo() {
		System.out.println("===Clothes Info===");
		System.out.println("제품="+product+" | 색상="+color+" | 제조사="+brand);
	}
}
