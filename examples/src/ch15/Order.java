package ch15;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Order {
	private List<Menu> menuList;
	private static int orderNum=0;
	private static int menuNum=0;
	private static int totalPrice=0;
	DecimalFormat df=new DecimalFormat("#,###");
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
	
	public Order(List<Menu> menuList) {
		this.menuList=menuList;
		orderNum++;
	}
	public void printOrder() {
		int orderPrice=0;
		System.out.println("\n===== 주문서 =====");
		System.out.println("* 주문번호 : "+orderNum);
		for(int i=0;i<menuList.size();i++) {
			System.out.println("\t"+(i+1)+"."+menuList.get(i).printMenu());
			orderPrice+=menuList.get(i).getPrice();
			totalPrice+=menuList.get(i).getPrice();;
			menuNum++;
		}
		System.out.println("* 주문 메뉴수 : "+menuList.size());
		System.out.println("* 주문액 : "+df.format(orderPrice)+"(원)");
		System.out.println("* 주문시간 : "+sdf.format(new Date()));
	}
	public static void printSummary() {
		DecimalFormat dF=new DecimalFormat("#,###");
		System.out.println("\n===== 정산 =====");
		System.out.println("총 주문 건수 : "+orderNum);
		System.out.println("총 주문 메뉴 수 : "+menuNum);
		System.out.println("총 매출 : "+dF.format(totalPrice)+"(원)");
	}
}
