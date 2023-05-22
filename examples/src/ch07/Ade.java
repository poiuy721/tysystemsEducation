package ch07;

public class Ade extends Menu{
	private String materials;
	public Ade(String menu,int price,String materials) {
		super(menu,price);
		this.materials=materials;
	}
	
	public void printInfo() {
		System.out.println("=== Ade Info ===");
		System.out.println("메뉴="+super.getMenu()+" | 가격="+super.getPrice()+" | 재료="+materials);
	}
}

