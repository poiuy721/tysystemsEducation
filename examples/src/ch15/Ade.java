package ch15;

import java.text.DecimalFormat;

public class Ade extends Menu{
	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	private String recipe;
	
	public Ade(String name, int price, String recipe) {
		super(name,price);
		this.recipe = recipe;
	}
	public String printMenu() {
		DecimalFormat df=new DecimalFormat("#,###");
		return ("메뉴="+super.getName()+" | 가격="+df.format(super.getPrice())+" | 재료="+recipe);
	}
	
}
