package i.polymotphism.ex1;

public class CookBook extends Book{
	private boolean coupon;

	public CookBook() {
		super();
	}

	public CookBook(String title, String author, String pulisher,boolean coupon) {
		super(title,author,pulisher);
		this.coupon = coupon;
	}
	
	

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return "CookBook ["+super.toString()+" , coupon=" + coupon + "]";
	}


	
	
	
	
	

}
