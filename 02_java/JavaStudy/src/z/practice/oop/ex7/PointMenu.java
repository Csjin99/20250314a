package z.practice.oop.ex7;

import java.util.Scanner;

/*
 * Menu클래스의 역할
 * 프리젠테이션 뷰의 역할
 * :사용자와의 소통을 위한 클ㄹ래스(입출력)
 */

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		int choice;
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			choice =sc.nextInt();
			switch(choice) {
			case 1:
				this.circleMenu();
				break;
			case 2:
				this.rectangleMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
					System.out.println("잘못입력하셨습니다.");
			}
		}
		
	}
	
	public void circleMenu() {
		int choice;
		while(true) {
			System.out.println("===== 원 메뉴 =====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			choice =sc.nextInt();
			switch(choice) {
			case 1:
				this.calcCircum();
				break;
			case 2:
				this.calcCircleArea();
				break;
			case 9:
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
			
			}
		}
	}
	
	public void rectangleMenu() {
		int choice;
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			choice =sc.nextInt();
			switch(choice) {
			case 1:
				calcPerimeter();
				break;
			case 2:
				calcRectArea();
				break;
			case 9:
				return;
			
			}
		}
		
	}
	
	public void calcCircum() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.println("반지름 : ");
		int raidus = sc.nextInt();
		
		String m = cc.calcCircum(x,y, raidus);
		System.out.println("둘레 : " + m);
		
	}
	
	public void calcCircleArea() {
		
	}
	
	public void calcPerimeter() {
		
	}
	
	public void calcRectArea() {
		
	}
}
