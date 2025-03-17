package b.operater;

import java.util.Scanner;

public class Practice2 {
	/*
	 * 키보드로 정수 두개를 입력받아 두수의 합 차 곱 나누기 값을 출력
	 * 
	 * [출력창]
	 * 첫번째 정수 : 키보드 입력
	 * 두번째 정수 : 기보드입력
	 * 
	 * 더하기 :
	 * 빼기 :
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("첫번째 정수 : ");
		num1 = sc.nextInt();

		System.out.print("두번째 정수 : ");
		num2 = sc.nextInt();

		System.out.println("더하기 : " + (num1 + num2));
		System.out.println("빼기 : " + (num1 - num2));
		System.out.println("곱하기 : " + (num1 * num2));
		System.out.println("나누기 : " + (num1 / num2));
	}

}
