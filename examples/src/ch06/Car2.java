package ch06;

public class Car2 {
	private String name;
	private Company company;
	private String color;
	private int door;
	private int maxSpeed;
	
	public Car2(String name,Company company,String color,int door,int maxSpeed) {
		this.name=name;
		this.company=company;
		this.color=color;
		this.door=door;
		this.maxSpeed=maxSpeed;
	}
	
	public void printInfo() {
		System.out.println("자동차명="+name);
		System.out.println("색상="+color);
		System.out.println("문개수="+door);
		System.out.println("최대속력="+maxSpeed);
		System.out.println("--company info--");
		company.printInfo();
	}
}
