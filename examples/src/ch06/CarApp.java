package ch06;

public class CarApp {
	public static void main(String[] args) {
		System.out.println("==company info==");
		String companyName="Audi";
		String address="독일";
		String phone="123-4567";
		Company company=new Company(companyName,address,phone);
		company.printInfo();
		
		System.out.println("==car info==");
		String name="A6";
		String color="Red";
		int  door=4;
		int maxSpeed=300;
		
		Car2 c=new Car2(name,company,color,door,maxSpeed);
		c.printInfo();
	}
}
