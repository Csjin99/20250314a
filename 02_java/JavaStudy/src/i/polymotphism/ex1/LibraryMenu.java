package i.polymotphism.ex1;

import java.util.Scanner;

import javax.crypto.NullCipher;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	
	public void mainMenu() {
		String name;
		int age;
		char gender;
		int num;
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.print("성별 : ");
		gender = sc.next().charAt(0);
		
		Member mem = new Member(name,age,gender);

		lc.insertMember(mem);
		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("5. 도서 추가하기");
			System.out.println("6. 도서 삭제하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1:
				Member m = lc.myinfo();
				System.out.println(m);
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 5:
				if(lc.isInertBook()) {
					insertBook();
				}else {
					System.out.println("더이상 도서를 추가할 수 없습니다.");
				}		
				break;
			case 6:
				deleteBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
				
			}
			
		}
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		for(int i = 0; i < bList.length && bList[i] != null;i++) {
			System.out.println(i + "번도서 : "+bList[i]);
		}
	}
	
	public void searchBook() {
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.next();
		Book[] searchList = lc.searchBook(keyword);
		for(int i = 0; i < searchList.length && searchList[i] != null;i++) {
			System.out.println(searchList[i]);
		}
		
	}
	
	public void rentBook() {
		selectAll();
		
		System.out.println("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		switch(result) {
		case 0:
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1:
			System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case 2:
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰을 확인하세요");
			break;
		}
		
	}
	public void insertBook() {
		String title, author,pulisher;
		int choice, age;

		while(true) {
			System.out.println("도서를 추가하겠습니다.");
			System.out.println("추가할 곳을 선택해주세요");
			System.out.println("1. 요리  2. 만화");
			System.out.print("추가할곳 : ");
			choice = sc.nextInt();
			
			if(!(choice == 1 || choice == 2)) {
				System.out.println("잘못입력했습니다.");
				continue;
			}
			System.out.print("도서명 : ");
			title = sc.next();
		
			System.out.print("저자명 : ");
			author = sc.next();
		
			System.out.print("제작사명 : ");
			pulisher = sc.next();
			sc.nextLine();
			
			int index = 0;
			switch(choice) {
			case 1:
				System.out.println("쿠폰 여부(y/n) : ");
				boolean isCoupon = (sc.next().toLowerCase().charAt(0) =='y');
				index =lc.isInertBook(new CookBook(title,author,pulisher,isCoupon)) ;
			case 2:
				System.out.println("나이 제한 : ");
				age = sc.nextInt();
				index = lc.isInertBook(new AniBook(title,author,pulisher,age)) ;
			}

			System.out.println(index + "번째에 성공적으로 추가하였습니다.");
			break;
		}
		
	}
	
	public void deleteBook() {
		selectAll();
		
		System.out.println("삭제할 번호 선택");
		int index = sc.nextInt();
		lc.deleteBook(index);
		
	}
	

}
