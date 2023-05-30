package ch15;

import java.text.DecimalFormat;

public class Coffee extends Menu{
	private String bean;
	
	public Coffee(String name, int price, String bean) {
		super(name,price);
		this.bean = bean;
	}

	public String getBean() {
		return bean;
	}

	public void setBean(String bean) {
		this.bean = bean;
	}
	public String printMenu() {
		DecimalFormat df=new DecimalFormat("#,###");
		return ("메뉴="+super.getName()+" | 가격="+df.format(super.getPrice())+" | 재료="+bean);
	}
	
}
