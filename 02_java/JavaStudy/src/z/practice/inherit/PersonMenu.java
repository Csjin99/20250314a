package z.practice.inherit;

import java.util.Scanner;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	
	public void mainMenu() {
		int[] result = pc.personCount();
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은"+result[0]+"명입니다.");
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은"+result[1]+"명입니다.");
		int choice;
		while(true) {
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				this.studentMenu();
				break;
			case 2:
				this.employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					
			
			}
		}
		
	}
	
	public void studentMenu() {
		int[] result = pc.personCount();
		int choice;
		while(true) {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			if(result[0] == 3) {
				System.out.println("학생을 담을수 있는 공간이 꽉 찼기 때문에 학생추가 메뉴는 더이상 활성화 되지않습니다.");
			}
			System.out.print("메뉴 번호 : ");
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				if(result[0] == 3) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				}
				this.insertStudent();
				break;
			case 2:
				this.printStudent();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					
			
			}
		}
		
	}
	
	public void employeeMenu() {
		int[] result = pc.personCount();
		int choice;
		while(true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			if(result[1] == 10) {
				System.out.println("사원을 담을수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더이상 활성화 되지않습니다.");
			}
			System.out.print("메뉴 번호 : ");
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				if(result[1] == 10) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				}
				this.insertEmployee();
				break;
			case 2:
				this.printEmployee();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					
			
			}
		}
		
	}
	
	public void insertStudent() {
		int[] result = pc.personCount();
		String name, major;
		int age, grade;
		double height, weight;
		System.out.print("학생 이름 :");
		name = sc.next();
		System.out.print("학생 나이 :");
		age = sc.nextInt();
		System.out.print("학생 키 :");
		height = sc.nextDouble();
		System.out.print("학생 몸무게 :");
		weight = sc.nextDouble();
		System.out.print("학생 학년 :");
		grade = sc.nextInt();
		System.out.print("학생 전공 :");
		major = sc.next();
		sc.nextLine();
		
		pc.insertStudent(name, age, height, weight, grade, major);
		
		while(true) {
			if(result[0] != 3) {
				System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무키나 누르세요 :");
				char input = sc.nextLine().toLowerCase().charAt(0);
				if(input == 'n') {
					
				}
			}
		}
		
		
	}
	
	public void printStudent() {
		
	}
	
	public void insertEmployee() {
		
	}
	
	public void printEmployee() {
		

	}

}
