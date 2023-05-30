package ch15;

import java.text.DecimalFormat;
import java.util.List;

public class BookStore {
	private List<Book> bookList;
	DecimalFormat df = new DecimalFormat("#,###");

	public BookStore(List<Book> bookList) {
		this.bookList = bookList;
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

	public void printBookStore() {
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println("\n" + (i + 1) + ".");
			printOneBook(bookList.get(i));
		}
	}

	public void printBooksByCategory(String category) {
		int bookNum = 1;
		for (int i = 0; i < bookList.size(); i++) {
			if (category.equals(bookList.get(i).getCategory())) {
				System.out.println("\n" + bookNum + ".");
				printOneBook(bookList.get(i));
				bookNum++;
			}
		}
		if (bookNum == 1)
			System.out.println("No data available");
	}

	public void printBookByIsbn(String isbn) {
		int bookNum = 1;
		for (int i = 0; i < bookList.size(); i++) {
			if (isbn.equals(bookList.get(i).getIsbn())) {
				System.out.println("\n" + bookNum + ".");
				printOneBook(bookList.get(i));
				bookNum++;
			}
		}
		if (bookNum == 1)
			System.out.println("No data available");
	}

	public void printBooksByTitleLike(String title) {
		int bookNum = 1;
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getTitle().contains(title)) {
				System.out.println("\n" + bookNum + ".");
				printOneBook(bookList.get(i));
				bookNum++;
			}
		}
		if (bookNum == 1)
			System.out.println("No data available");
	}

	public void printBooksByMaxPrice(int maxPrice) {
		int bookNum = 1;
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getPrice() <= maxPrice) {
				System.out.println("\n" + bookNum + ".");
				printOneBook(bookList.get(i));
				bookNum++;
			}
		}
		if (bookNum == 1)
			System.out.println("No data available");
	}
	public void printBooksByMinPrice(int minPrice) {
		int bookNum = 1;
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getPrice() >= minPrice) {
				System.out.println("\n" + bookNum + ".");
				printOneBook(bookList.get(i));
				bookNum++;
			}
		}
		if (bookNum == 1)
			System.out.println("No data available");
	}
	public void printBooksByBetweenPrice(int betweenMinPrice,int betweenMaxPrice) {
		int bookNum = 1;
		for (int i = 0; i < bookList.size(); i++) {
			if ((bookList.get(i).getPrice() >= betweenMinPrice)&&(bookList.get(i).getPrice() <= betweenMaxPrice)) {
				System.out.println("\n" + bookNum + ".");
				printOneBook(bookList.get(i));
				bookNum++;
			}
		}
		if (bookNum == 1)
			System.out.println("No data available");
	}
}
