package ch05;

import java.text.DecimalFormat;

public class BookStore {
	private Book[] bookArray;
	DecimalFormat df = new DecimalFormat("#,###");

	public BookStore(Book[] bookArray) {
		this.bookArray = new Book[bookArray.length];
		this.bookArray = bookArray;
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
		for (int i = 0; i < bookArray.length; i++) {
			System.out.println("\n" + (i + 1) + ".");
			printOneBook(bookArray[i]);
		}
	}

	public void printBooksByCategory(String category) {
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

	public void printBookByIsbn(String isbn) {
		int bookNum = 1;
		for (int i = 0; i < bookArray.length; i++) {
			if (isbn.equals(bookArray[i].getIsbn())) {
				System.out.println("\n" + bookNum + ".");
				printOneBook(bookArray[i]);
				bookNum++;
			}
		}
		if (bookNum == 1)
			System.out.println("No data available");
	}

	public void printBooksByTitleLike(String title) {
		int bookNum = 1;
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i].getTitle().contains(title)) {
				System.out.println("\n" + bookNum + ".");
				printOneBook(bookArray[i]);
				bookNum++;
			}
		}
		if (bookNum == 1)
			System.out.println("No data available");
	}

	public void printBooksByMaxPrice(int maxPrice) {
		int bookNum = 1;
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i].getPrice() <= maxPrice) {
				System.out.println("\n" + bookNum + ".");
				printOneBook(bookArray[i]);
				bookNum++;
			}
		}
		if (bookNum == 1)
			System.out.println("No data available");
	}
	public void printBooksByMinPrice(int minPrice) {
		int bookNum = 1;
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i].getPrice() >= minPrice) {
				System.out.println("\n" + bookNum + ".");
				printOneBook(bookArray[i]);
				bookNum++;
			}
		}
		if (bookNum == 1)
			System.out.println("No data available");
	}
	public void printBooksByBetweenPrice(int betweenMinPrice,int betweenMaxPrice) {
		int bookNum = 1;
		for (int i = 0; i < bookArray.length; i++) {
			if ((bookArray[i].getPrice() >= betweenMinPrice)&&(bookArray[i].getPrice() <= betweenMaxPrice)) {
				System.out.println("\n" + bookNum + ".");
				printOneBook(bookArray[i]);
				bookNum++;
			}
		}
		if (bookNum == 1)
			System.out.println("No data available");
	}
}
