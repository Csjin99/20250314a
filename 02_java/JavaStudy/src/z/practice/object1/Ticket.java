package z.practice.object1;

import java.util.Scanner;

public class Ticket {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영화번호를 입력하세요: ");
		int MovieID = sc.nextInt();
		
		Movie movie1 = new Movie();
		if(MovieID == 1) {
			movie1.director = "최성진";
			movie1.pirce = 0;
			movie1.rating = 10;
			movie1.title = "살아남기";
			movie1.infio();
		}	
	}
	

}
