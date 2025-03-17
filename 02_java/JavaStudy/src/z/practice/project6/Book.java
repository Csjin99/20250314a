package z.practice.project6;

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {
		super();
	}

	public Book(String title, String publisher, String author) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}

	public Book(String title, String publisher, String author, int price, double discountRate) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void inform() {
		System.out.println("제목 :" + this.title);
		System.out.println("? :"+this.publisher);
		System.out.println("? :"+this.author);
		System.out.println("가격 : "+this.price);
		System.out.println("횟수 : "+this.discountRate);
		
	}

}
