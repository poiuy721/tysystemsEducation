package ch07;

public class Coffee extends Menu{
	private String coffeeBean;
	public Coffee(String menu,int price,String coffeeBean) {
		super(menu,price);
		this.coffeeBean=coffeeBean;
	}
	
	public void printInfo() {
		System.out.println("=== Coffee Info ===");
		System.out.println("메뉴="+super.getMenu()+" | 가격="+super.getPrice()+" | 원두="+coffeeBean);
	}
}
