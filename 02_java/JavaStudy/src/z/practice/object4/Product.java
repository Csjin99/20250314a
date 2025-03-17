package z.practice.object4;

public class Product {
	private String pNmae;
	private int pice;
	private String brand;
	
	
	public Product() {
		super();
	}

	public void information() {
		System.out.println("상품명 : " + this.pNmae);
		System.out.println("가격 : " + this.pice);
		System.out.println("브랜드 : " + this.brand);
	}
	

}
