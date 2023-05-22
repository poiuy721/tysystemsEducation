package ch07;

public class Shirt extends Clothes{
	private String sleeves;
	private String size;
	public Shirt(String product,String color,String brand,String sleeves,String size) {
		super(product,color,brand);
		this.sleeves=sleeves;
		this.size=size;
	}
	public void printInfo() {
		System.out.println("==Shirt Info==");
		System.out.println("제품명="+super.getProduct()+" | 색상="+super.getColor()+" | 제조사="+super.getBrand()+" |  소매유형="+sleeves+" |크기="+size);
	}
}
