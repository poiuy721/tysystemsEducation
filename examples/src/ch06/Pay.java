package ch06;

public class Pay {
	private int hourPay;
	
	
	public Pay() {
		
	}
	public Pay(int hourPay) {
		this.hourPay=hourPay;
	}
	
	
	public int getDayPay() {
		return hourPay*8;
	}
	public int getWeekPay() {
		return getDayPay()*5;
	}
	public int getYearPay() {
		return getWeekPay()*52;
	}
}
