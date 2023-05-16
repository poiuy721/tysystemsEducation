package ch06;

public class Shirt {
	private String name;
	private String color;
	private String company;
	private String materials;
	private String size;
	private int price;
	
	public Shirt() {
	}
	public Shirt(String name,String color,int price) {
		this.name=name;
		this.color=color;
		this.price=price;
	}
	public Shirt(String name,String color,String company,String materials,String size,int price) {
		this.name=name;
		this.color=color;
		this.company=company;
		this.materials=materials;
		this.size=size;
		this.price=price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setMaterials(String materials) {
		this.materials = materials;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void printInfo() {
		System.out.println("===== Shirt Info ======");
		System.out.println("이름 : "+name);
		System.out.println("컬러 : "+color);
		System.out.println("회사 : "+company);
		System.out.println("소재 : "+materials);
		System.out.println("사이즈 : "+size);
		System.out.println("가격 : "+price);
		System.out.println();
	}
	
}
