package l.io.ex.ex1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		int num;
		while(true) {
			System.out.println("***** MT Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴번호 : ");
			num =sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1:
				this.fileSave();
				break;
			case 2:
				this.fileOpen();
				break;
			case 3:
				this.fileEdit();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}	
	}
	
	public void fileSave() {
		/*
		 * StringBuilder
		 * 가변문자열을 처리하는 클래스이다. 문자열을 수정할 때 새로운 객체를 생성하지않고
		 * 내부 버퍼를 이용해서 성능을 최적화한다.
		 */
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str;
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			str = sc.nextLine();
			
			
			
			
			
			if(str.equalsIgnoreCase("ex끝it")) {
				String fileName;
				System.out.println("정할 파일명을 입력해주세요");
				System.out.print("파일명 : ");
				fileName = sc.nextLine();
				
				//파일명이 존재하면서 덮어쓰기를 하지 않겠다고 했을 때 복
				while(true) {
					if(fc.checkName(fileName)) { //파일명이 존재할때 
						System.out.println("존재하는 파일입니다 .덮어쓰시겠습니가?");
						char ispass = sc.next().charAt(0);
						if(ispass == 'y') {
							fc.fileSave(fileName, sb);
							return;
						}
					}else { //파일명이 존재하지 않았을 때
						fc.fileSave(fileName, sb);
						return;
					}
				}
			}

			
		}
	}

	
	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String fileName = sc.next();
		sc.nextLine();
		
		if(fc.checkName(fileName)) {
			StringBuilder sb = fc.fileOpen(fileName);
			System.out.println(sb.toString());
		}else {
			System.out.println("없는파일입니다.");
		}
		
	}
	
	public void fileEdit() {
		System.out.println("수정할 파일 명 : ");
		String fileName = sc.next();
		sc.nextLine();
		
		if(fc.checkName(fileName)) {
			StringBuilder sb = new StringBuilder();
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				
				String str = sc.nextLine();
			}
		}
		
	}

}
