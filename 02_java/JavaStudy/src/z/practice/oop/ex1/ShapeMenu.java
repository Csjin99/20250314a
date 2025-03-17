package z.practice.oop.ex1;

import java.util.Scanner;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();

	public void inputMenu() {
		while(true){
			System.out.println("==== 도형 프로그램 ====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			switch(menuNum){
			case 3:
				triangleMenu();
				continue;
			case 4:
				squareMenu();
				continue;
			case 9:
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
					
			}
		}
		
		
	}
	public void triangleMenu() {
		Shape sh = new Shape();
		while(true) {
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			switch(menuNum) {
			case 1:
				System.out.print("높이 : ");
				double height = sc.nextInt();
				System.out.print("너비 : ");
				double width = sc.nextInt();
				tc.calcArea(height, width);
				sc.nextLine();
				continue;
			case 2:
			case 3:
			//	sh.information();
				continue;
			case 9:
				return;
			}
		
		}
	}
	public void squareMenu() {
		
	}
	public void inputSize(int type, int menuNum) {
		
	}
	
	public void printlnformation() {
		
	}
}
