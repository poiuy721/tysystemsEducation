package ch07;

public class Pants extends Clothes{
	private String pantsType;
	public Pants(String product,String color,String brand,String pantsType) {
		super(product,color,brand);
		this.pantsType=pantsType;
	}
	
	public void printInfo() {
		System.out.println("==Pants Info ===");
		System.out.println("제품명="+super.getProduct()+" | 색상="+super.getColor()+" | 제조사="+super.getBrand()+" | 바지유형="+pantsType);
	}
}
