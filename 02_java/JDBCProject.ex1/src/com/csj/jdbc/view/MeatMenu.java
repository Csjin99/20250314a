package com.csj.jdbc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.csj.jdbc.controller.MeatController;
import com.csj.jdbc.model.vo.Meat;

public class MeatMenu {
	private Scanner sc = new Scanner(System.in);
	private MeatController mc =new MeatController();
	
	public void mainMenu() {
		int count = 0;
		while(true) {
			System.out.println("*고기 선택*");
			System.out.println("1. 고기선택");
			System.out.println("9. 종료");
			System.out.println("관리자라면 관리자용 번호를 입력해주세요.");
			System.out.print("번호 입력 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1:
				this.buyMeat();
				break;
			case 9:
				System.out.println("이용해주셔서 감사합니다.");
				return;
			case 999:
				this.ceo();
				break;
			default:
				System.out.println("번호를 잘못입력하였습니다. 다시 입력하여주세요.");
				count++;

				}
			if(count == 5) {
				System.out.println("자동으로 잠금생태에 들어갑니다.");
				System.out.println("잠금상태를 푸실려면 번호를 입력하세요");
				System.out.print("비밀번호 입력 : ");
				int pass = sc.nextInt();
				sc.nextLine();
				if(pass == 1168) {	
					count =0;
				} else {
					System.out.println("완전한 잠금으로 넘어갑니다. 사용을 원하시면 재부팅하세요");
					break;
				}
			}
		}
	}
	
	public void ceo() {
		while(true){
			System.out.println("** 관리자 전용 **");
			System.out.println("1. 고기 구매");
			System.out.println("2. 고기 판매 가격 결정");
			System.out.println("3. 매출집계 및 고기현황");
			System.out.println("4. 판매중지할 고기 선택");
			System.out.println("나갈려면 9번");
			System.out.print("번호 입력 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1:
				this.insertMeat();
				break;
			case 2:
				this.updateMeatPrice();
				break;
			case 3:
				mc.selectMeat();
				break;
			case 4:
				this.deleteMeat();
				break;
			case 9:
				return;
				
			}
		
			
		}
		
	}
	
	public void insertMeat() {
		System.out.println("** 고기 구매 **");
		System.out.print("고기부위 : ");
		String name = sc.nextLine();
		System.out.print("고기가격 : ");
		int buyprice = sc.nextInt();
		System.out.print("수량 : ");
		int buynum = sc.nextInt();
		
		mc.insertMeat(name, buyprice, buynum);
	}
	
	public void updateMeatPrice() {
		System.out.println("가격 변경 및 결정");
		mc.selectMeat();
		System.out.println("가격조정을 원하는 고기를 선택하세요.");
		System.out.print("고기 명 : ");
		String meatname = sc.nextLine();
		
		System.out.print("가격 명 : ");
		int price = sc.nextInt();
		
		mc.updateMeatPrice(meatname, price);
		
	}
	
	public void buyMeat() {
		System.out.println("** 고기 구매 **");
		mc.selectMeat();
		
		System.out.print("고기명 : ");
		String name = sc.nextLine();
		
		System.out.print("구매수량 : ");
		int salsenum = sc.nextInt();
		
		mc.buyMeat(name,salsenum);
		
	}
	
	public void deleteMeat() {
		System.out.println("** 고기판매 중지 **");
		mc.selectMeat();
		System.out.println("삭제할 고기 명을 입력하세요");
		System.out.println("고기 명 : ");
		String name = sc.nextLine();
		
		mc.deleteMeat(name);
	}

	
	
	public void displayMemberList(ArrayList<Meat> list) {
		for(Meat m : list) {
			System.out.println(m);
		}
	}
	
	public void displaySuccess(String mes) {
		System.out.println(mes);
	}
	
	public void displayFail(String mes) {
		System.out.println(mes);
	}

}
