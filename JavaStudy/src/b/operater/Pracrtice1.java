package b.operater;

import java.util.Scanner;

public class Pracrtice1 {
	/*
	 * 키보드로 가로, 세로값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력
	 * 면적 : 가로 * 세로
	 * 둘레 : (가로 + 세로) *2
	 * 
	 * [출력창]
	 * 가로 : (입력)
	 * 세로 : (입력)
	 * 
	 * 면적 : ~
	 * 둘레 : ~
	 * + 소수점 2번쨰자리까지만 출력
	 */

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		float num1, num2;
		System.out.print("가로길이 :");
		num1 = sc.nextFloat();
		System.out.println();
		
		System.out.print("세로길이 : ");
		num2 = sc.nextFloat();
		System.out.println();
		
		double m = num1 * num2;
		double d = (num1 + num2) *2;
		
		
		System.out.printf("면적 : %.2f", m);
		System.out.printf("둘레 : %.2f", d);
		

	}

}
