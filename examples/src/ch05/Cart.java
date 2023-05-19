package ch05;

import java.text.DecimalFormat;

import ch06.Shirt;

public class Cart {
	private Member member;
	private Book[] bookArray;
	private Shirt[] shirtArray;
	private int booksExpense;
	private int shirtsExpense;
	private int totalExpense;
	DecimalFormat df=new DecimalFormat("#,###");
	
	public Cart(Member member,Book[] bookArray,Shirt[] shirtArray) {
		this.member=member;
		this.bookArray=new Book[bookArray.length];
		this.bookArray=bookArray;
		this.shirtArray=new Shirt[shirtArray.length];
		this.shirtArray=shirtArray;
	}
	
	public void printBooksExpense() {
		System.out.print("도서 총 금액 : ");
		int totalBooksExpense=0;
		for(int i=0;i<bookArray.length;i++)
			totalBooksExpense+=bookArray[i].getPrice();
		System.out.println(df.format(totalBooksExpense)+"(원)");
		this.booksExpense=totalBooksExpense;
	}
	public void printOneBook(Book b) {
		System.out.print("분야=");
		if (b.getCategory().equals("comic"))
			System.out.println("만화");
		else if (b.getCategory().equals("travel"))
			System.out.println("여행");
		else if (b.getCategory().equals("food"))
			System.out.println("음식");
		else if (b.getCategory().equals("health"))
			System.out.println("건강");
		else if (b.getCategory().equals("pc"))
			System.out.println("컴퓨터");
		else if (b.getCategory().equals("etc"))
			System.out.println("기타");
		System.out.println("제목=" + b.getTitle());
		System.out.println("저자=" + b.getAuthor());
		System.out.println("출판사=" + b.getPublisher());
		System.out.println("가격=" + df.format(b.getPrice()));
		System.out.println("isbn=" + b.getIsbn());
	}
	
	public void printBooksInfo(){
		for (int i = 0; i < bookArray.length; i++) {
			System.out.println("\n" + (i + 1) + ".");
			printOneBook(bookArray[i]);
		}
		System.out.println("\n* 구매수 : "+bookArray.length+"(권)");
		System.out.print("* 구매액 : ");
		int totalBooksExpense=0;
		for(int i=0;i<bookArray.length;i++)
			totalBooksExpense+=bookArray[i].getPrice();
		System.out.println(df.format(totalBooksExpense)+"(원)");
	}
	
	public void printBooksInfoByCategory(String category) {
		int bookNum = 1;
		for (int i = 0; i < bookArray.length; i++) {
			if (category.equals(bookArray[i].getCategory())) {
				System.out.println("\n" + bookNum + ".");
				printOneBook(bookArray[i]);
				bookNum++;
			}
		}
		if (bookNum == 1)
			System.out.println("No data available");
	}
	
	public void printShirtsExpense() {
		System.out.print("셔츠 총 금액 : ");
		int totalShirtsExpense=0;
		for(int i=0;i<shirtArray.length;i++)
			totalShirtsExpense+=shirtArray[i].getPrice();
		System.out.println(df.format(totalShirtsExpense)+"(원)");
		this.shirtsExpense=totalShirtsExpense;
	}
	public void printOneShirt(Shirt s) {
		System.out.println("상품명=" + s.getName());
		System.out.println("색상=" + s.getColor());
		System.out.println("제조사=" + s.getCompany());
		System.out.println("소재=" + s.getMaterials());
		System.out.println("크기=" + s.getSize());
		System.out.println("가격=" + df.format(s.getPrice()));
	}
	public void printShirtsInfo(){
		for (int i = 0; i < shirtArray.length; i++) {
			System.out.println("\n" + (i + 1) + ".");
			printOneShirt(shirtArray[i]);
		}
		System.out.println("\n* 구매수 : "+ shirtArray.length+"(벌)");
		System.out.print("* 구매액 : ");
		int totalShirtsExpense=0;
		for(int i=0;i<shirtArray.length;i++)
			totalShirtsExpense+=shirtArray[i].getPrice();
		System.out.println(df.format(totalShirtsExpense)+"(원)");
	}
	public void printTotalExpense() {
		int totalExpense=0;
		for(int i=0;i<bookArray.length;i++)
			totalExpense+=bookArray[i].getPrice();
		for(int i=0;i<shirtArray.length;i++)
			totalExpense+=shirtArray[i].getPrice();
		System.out.println("지출 총 금액 : "+df.format(totalExpense)+"(원)");
		this.totalExpense=totalExpense;
	}
	public void printCartInfo() {
		System.out.println("-----Books Info-----");
		printBooksInfo();
		System.out.println("-----Shirts Info-----");
		printShirtsInfo();
		System.out.println("----- Total Info -----");
		System.out.println("* 구매수\n\t책 : "+bookArray.length+"(권)");
		System.out.println("\t셔츠 : "+shirtArray.length+"(벌)");
		System.out.println("구매액 총합 : "+df.format(this.totalExpense)+"(원)");
	}
	public void printGiftYn() {
		System.out.println("사은품 여부 : "+(this.totalExpense>200000?"대상":"대상 아님"));
	}
	public void buy(boolean pointUseYn) {
		System.out.println("=====[ 영수증 ]=====");
		System.out.println("\n-----고객-----");
		System.out.println("아이디 : "+member.getId());
		System.out.println("이름 : "+member.getName());
		System.out.println("등급 : "+member.getMembership());
		
		System.out.println("\n----- 구매내역 -----");
		System.out.println("도서\n");
		for(int i=0;i<bookArray.length;i++) {
			System.out.println("\t"+(i+1)+". "+bookArray[i].getTitle()+" "+df.format(bookArray[i].getPrice())+"(원)");
		}
		System.out.println("셔츠\n");
		for(int i=0;i<shirtArray.length;i++) {
			System.out.println("\t"+(i+1)+". "+shirtArray[i].getName()+" "+df.format(shirtArray[i].getPrice())+"(원)");
		}
		System.out.println("\n----- 구매금액 -----");
		System.out.println("도서 : "+df.format(booksExpense)+"(원)");
		System.out.println("셔츠 : "+df.format(shirtsExpense)+"(원)");
		System.out.println("총액 : "+df.format(totalExpense)+"(원)");
		System.out.println("\n----- 결제금액 -----");
		if(pointUseYn) {
			System.out.println("포인트 사용 : "+df.format(member.getPoint()));
			totalExpense-=member.getPoint();
			member.setPoint(0);
		}
		System.out.println("결제금액 : "+df.format(totalExpense)+"(원)");
		
		System.out.println("\n----- 포인트 -----");
		System.out.println("현재 포인트 : "+df.format(member.getPoint()));
		int newPoint=0;
		if(member.getMembership().equals("S"))
			newPoint+=totalExpense/100*3;
		else if(member.getMembership().equals("A"))
			newPoint+=totalExpense/100*2;
		else
			newPoint+=totalExpense/100;
		System.out.println("신규 포인트 : "+df.format(newPoint));
		member.setPoint(member.getPoint()+newPoint);
		System.out.println("누적 포인트 : "+df.format(member.getPoint()));
		System.out.println("\n----- 사은품 -----");
		printGiftYn();
	}
}
