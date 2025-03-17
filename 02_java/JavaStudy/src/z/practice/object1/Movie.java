package z.practice.object1;

public class Movie {
	String title;
	String director;
	double rating;
	int pirce;
	
	
	
	public Movie() {
		super();
	}



	public Movie(String title, String director, double rating, int pirce) {
		super();
		this.title = title;
		this.director = director;
		this.rating = rating;
		this.pirce = pirce;
	}
	
	public void infio() {
		System.out.println("영화이름 : "+ title);
		System.out.println("영화감독 : "+ director);
		System.out.println("총스태프 : "+ rating);
		System.out.println("가격 : "+ pirce);
		
	}
	
	

}
