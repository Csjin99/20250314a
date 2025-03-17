package i.polymotphism.ex1;

public class Book {
	private String title;
	private String author;
	private String pulisher;
	
	public Book() {
		super();
	}

	public Book(String title, String author, String pulisher) {
		super();
		this.title = title;
		this.author = author;
		this.pulisher = pulisher;
	}
	
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPulisher() {
		return pulisher;
	}

	public void setPulisher(String pulisher) {
		this.pulisher = pulisher;
	}

	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", pulisher=" + pulisher + "]";
	}

	
	
	
	
	

}
