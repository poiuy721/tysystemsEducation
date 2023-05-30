package ch15;

public class Book {
	private String category;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String isbn;
	
	public String getCategory() {
		return category;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getPrice() {
		return price;
	}

	public String getIsbn() {
		return isbn;
	}

	public Book(String category,String title,String author,String publisher,int price,String isbn) {
		this.category=category;
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.price=price;
		this.isbn=isbn;
	}
}
