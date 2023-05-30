package ch15;

import java.util.List;

public class BookStoreApp {
	public static void main(String[] args) {
		String[] contents= {
				"comic/열혈강호/전극진-양재현/대원씨아이/4500/979-11-5754-926-9",
				"travel/뉴욕 100배 즐기기/홍지윤/알에이치코리아/14400/978-89-255-8673-1\r\n"
				, "travel/바르셀로나 지금이 좋아/정다운/중앙북스/15000/978-89-991-7580-0\r\n"
				, "food/오늘의 맥주/이성준/오운/18000/979-11-92814-04-9\r\n"
				, "food/버번 위스키의 모든 것/조승원/(주)교유당/24000/979-11-90277-42-6"
		};
		Biz biz=new Biz();
		List<Book> bookList=biz.convert(contents);
		
		BookStore bs=new BookStore(bookList);
		
		System.out.println("\n===== printBookStore() =====");
		bs.printBookStore();
		
		System.out.println("\n=====printBooksByCategory()=====");
		System.out.println("\n----- comic -----");
		String category="comic";
		bs.printBooksByCategory(category);
		
		System.out.println("\n----- travel -----");
		category="travel";
		bs.printBooksByCategory(category);
		
		System.out.println("\n----- food -----");
		category="food";
		bs.printBooksByCategory(category);
		
		System.out.println("\n----- health -----");
		category="health";
		bs.printBooksByCategory(category);
		
		System.out.println("\n===== printBookByIsbn() =====");
		System.out.println("\n----- 979-11-90277-42-6 -----");
		String isbn="979-11-90277-42-6";
		bs.printBookByIsbn(isbn);
		
		System.out.println("\n----- 979-11-90277-42-7 -----");
		isbn="979-11-90277-42-7";
		bs.printBookByIsbn(isbn);
		
		System.out.println("\n===== printBooksByTitleLike() =====");
		System.out.println("\n----- 뉴욕 -----");
		String title="뉴욕";
		bs.printBooksByTitleLike(title);

		System.out.println("\n-----  서울 -----");
		title="서울";
		bs.printBooksByTitleLike(title);
		
		System.out.println("\n===== printBooksByMaxPrice() =====");
		System.out.println("\n----- 10000 -----");
		int maxPrice=10000;
		bs.printBooksByMaxPrice(maxPrice);
		
		System.out.println("\n----- 2000 -----");
		maxPrice=2000;
		bs.printBooksByMaxPrice(maxPrice);

		System.out.println("\n===== printBooksByMinPrice() =====");
		System.out.println("\n----- 15000 -----");
		int minPrice=15000;
		bs.printBooksByMinPrice(minPrice);
		
		System.out.println("\n----- 50000 -----");
		minPrice=50000;
		bs.printBooksByMinPrice(minPrice);

		System.out.println("\n===== printBooksByBetweenPrice() =====");
		System.out.println("\n----- 5000~20000 -----");
		int betweenMinPrice=5000;
		int betweenMaxPrice=20000;
		bs.printBooksByBetweenPrice(betweenMinPrice,betweenMaxPrice);
		
		System.out.println("\n----- 50000~200000 -----");
		betweenMinPrice=50000;
		betweenMaxPrice=200000;
		bs.printBooksByBetweenPrice(betweenMinPrice,betweenMaxPrice);
	}
}
