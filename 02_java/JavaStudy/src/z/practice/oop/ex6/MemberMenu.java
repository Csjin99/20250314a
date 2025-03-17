package z.practice.oop.ex6;

import java.util.Scanner;



public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {
		
	}
	
	public void maninMenu() {
		while(true) {
			System.out.println("최대 등록가능한 회원수는 "+ mc.SIZE +"명입니다.");
			System.out.printf("최대 등록가능한 회원수는 %d명입니다.\n", mc.existMemberNum());
			if(mc.existMemberNum() != 10) {

				System.out.println("1. 새회원 등록");
			} else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.println("메뉴 번호: ");
				int choice = sc.nextInt();
				switch(choice) {
				case 1:
					if(mc.existMemberNum() != 10) {
					this.insertMember();
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						return;
					}
					break;
				case 2:
					this.searchMember();
					break;
				case 3:
					this.updateMember();
					break;
				case 4:
					this.deleteMember();
					break;
				case 5:
					printAll();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}

		}
		
	}
	
	public void insertMember() {
		String id, name, password, email;
		char gender;
		int age;
		System.out.println("새 회원을 등록합니다.");
		while(true) {
			System.out.print("아이디 : ");
			id =sc.next();
			if(mc.checkId(id)) { //사용가능
				break;
			}else {
				System.out.println("중복되는 값입니다. 다시 입력해주세요");
			}
		}
		

				System.out.print("이름 : ");
				name =sc.next();
				
				System.out.print("비밀번호 : ");
				password =sc.next();
				
				System.out.print("이메일 : ");
				email =sc.next();
				
				while(true) {
					System.out.print("성별(M/F) : ");
					gender = sc.next().toUpperCase().charAt(0);
					if(gender == 'M' || gender == 'F') {
						break;
					}else {
						System.out.println("성별을 다시 입력하세요.");
					}
				}
				System.out.print("나이 : ");
				age =sc.nextInt();
				sc.nextLine();
				
				mc.insertMember(id, name, password, email, gender, age);
	}

	
		
		
	
	public void searchMember() {
		System.out.println("1.아이디로 검색하기");
		System.out.println("2.이름으로 검색하기");
		System.out.println("3.이메일로 검색하기");
		System.out.println("9.메인으로 돌아가기");
		System.out.println("메뉴 번호 : ");
		int choice =sc.nextInt();
		switch(choice) {
		case 1:
			this.searchId();
			break;
		case 2:
			this.searchName();
			break;
		case 3:
			this.searchEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void searchId() {
		String id;
		
		System.out.println("검색할 아이디 : ");
		id = sc.next();
		
		String memberinfo = mc.searchId(id);
		
		if(memberinfo == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(memberinfo);
		}
		
	}
	public void searchName() {
		String Name;
		
		System.out.println("검색할 이름 : ");
		Name = sc.next();
		
		Member[] mArr = mc.searchName(Name);
		if(mArr[0] == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for(Member mem : mArr) {
				if(mem == null)
					break;
				
			System.out.println(mem.inform());
		}
	}
	}
		
	public void searchEmail() {
		String email;
		
		System.out.println("검색할 이메일 : ");
		email = sc.next();
		
		
		}
		
	public void updateMember() {
		System.out.println("1.아이디로 검색하기");
		System.out.println("2.이름으로 검색하기");
		System.out.println("3.이메일로 검색하기");
		System.out.println("9.메인으로 돌아가기");
		System.out.println("메뉴 번호 : ");
		int choice =sc.nextInt();
		switch(choice) {
		case 1:
			this.searchId();
			break;
		case 2:
			this.searchName();
			break;
		case 3:
			this.searchEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	public void updatePassword() {
		String id, pwd;
		System.out.println("수정할 회원의 아이디: ");
		id = sc.next();
		
		System.out.println("수정할 비밀번호: ");
		pwd = sc.next();
		sc.nextLine();
		
		boolean isUpdate =mc.updatePasswore(id, pwd);
		
		if(isUpdate) {
			System.err.println("수정이 성공적으로 되었습니다.");
			
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		
	}
	public void updateName() {
		
	}
	public void updateEmail() {
		
	}
	public void deleteMember() {
		System.out.println("1.특정회원 삭제");
		System.out.println("2.모든회원 삭제");
		System.out.println("9.메인으로 돌아가기");
		System.out.println("메뉴 번호 : ");
		int choice =sc.nextInt();
		switch(choice) {
		case 1:
			this.deleteOne();
			break;
		case 2:
			this.deleteAll();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	public void deleteOne() {
		String id;
		System.out.println("삭제할 ID : ");
		id = sc.next();
		
		System.out.println("정말 삭제하시겠습니까?(y/n) : ");
		char result = sc.next().toLowerCase().charAt(0);
		
		if(result == 'y') {
			boolean isDelete = mc.delete(id);
			if(isDelete) {
				System.out.println("성공적으로 삭제하였습니다.");
			} else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
			
		}
		
	}
	public void deleteAll() {
		System.out.println("정말 삭제하시겠습니까?(y/n) : ");
		char result = sc.next().toLowerCase().charAt(0);
		if(result == 'y') {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
		}
		
	}
	public void printAll() {
		Member[] mArr = mc.printAll();
		for(Member mem : mArr) {
			if(mem == null)
				break;
			
			System.out.println(mem.inform());
		}
		
	}

}
