package o.collection.list.ex1;

import java.util.Scanner;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		int num;
		while(true) {
			System.out.println("********** 메인 메뉴 **************");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위쳉 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			num = sc.nextInt();
			switch(num) {
			case 1:
				this.addList();
				break;
			case 2:
				this.addAtZero();
				break;
			case 3:
				this.printAll();
				break;
			case 4:
				this.serchMusic();
				break;
			case 5:
				this.removeMusic();
				break;
			case 6:
				this.serchMusic();
				break;
			case 7:
				this.ascTitle();
				break;
			case 8:
				this.descSinger();
				break;
			case 9:
				System.out.println("종료");
			}
		}
		
	}
	public void addList() {
		String title;
		String singer;
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("곡명 : ");
		title = sc.nextLine();
		sc.nextLine();
		System.out.print("가수 명 : ");
		singer = sc.nextLine();
		
		int result = mc.addList(new Music(title,singer));
		
		if(result == 1) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	
		
	}
	public void addAtZero() {
	
	}
	public void printAll() {
	
	}
	public void serchMusic() {
	
	}
	public void removeMusic() {
	
	}
	public void ascTitle() {
	
	}
	public void descSinger() {
		
	}


}
