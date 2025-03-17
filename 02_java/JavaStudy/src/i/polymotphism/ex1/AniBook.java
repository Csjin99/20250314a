package i.polymotphism.ex1;

public class AniBook extends Book{
	private int accessAge;

	public AniBook() {
		super();
	}

	public AniBook(String title, String author, String pulisher, int accessAge) {
		super(title,author,pulisher);
		this.accessAge = accessAge;
	}
	

	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return "AniBook ["+super.toString()+ " , accessAge=" + accessAge + "]";
	}

	
	
	
	
	
	

}
