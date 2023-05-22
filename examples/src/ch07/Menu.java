package ch07;

public class Menu {
	private String menu;
	private int price;
	public Menu(String menu,int price) {
		this.menu=menu;
		this.price=price;
	}
	
	public String getMenu() {
		return menu;
	}

	public int getPrice() {
		return price;
	}

	public void printInfo() {
		System.out.println("=== Menu Info ===");
		System.out.println("메뉴="+menu+" | 가격="+price);
	}
}
