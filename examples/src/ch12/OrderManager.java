package ch12;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderManager {
	private Menu[] order;
	public OrderManager(Menu[] order) {
		this.order=order;
	}
	public void printReciept() {
		SimpleDateFormat dateForm=new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		DecimalFormat decimalForm=new DecimalFormat("#,###");
		int sumPrice=0;
		
		System.out.println("==[영수증]==");
		System.out.println("--주문 시간--");
		System.out.println(dateForm.format(new Date()));
		System.out.println("\n--주문 상세--");
		for(int i=0;i<order.length;i++) {
			System.out.println((i+1)+". 메뉴="+order[i].getName()+" | 가격="+decimalForm.format(order[i].getPrice()));
			sumPrice+=order[i].getPrice();
		}
		System.out.println("--주문 금액 합계--");
		System.out.println(decimalForm.format(sumPrice)+"(원)");
	}
}
