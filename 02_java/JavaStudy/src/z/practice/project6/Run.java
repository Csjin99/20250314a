package z.practice.project6;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("노래잘부르기","강진","감기");
		Book b3 = new Book("죽어야한다","성준","가지",30000,5);
		
		
		b1.inform();
		b2.inform();
		b3.inform();
	}

}
