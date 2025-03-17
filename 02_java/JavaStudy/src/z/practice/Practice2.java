package z.practice;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		단, 입력한 수는 1보다 크거나 같아야 합니다. 
		1 미만의 숫자가 입력됐다면 
		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요
		
		ex.
		1이상의 숫자를 입력하세요 : 4			1이상의 숫자를 입력하세요 : 0
		1 2 3 4 						1 이상의 숫자를 입력해주세요.
										1이상의 숫자를 입력하세요 : 8
										1 2 3 4 5 6 7 8 
		*/
		
		/*
		while(true){
			System.out.print("1이상의 숫자를 입력하세요 :");
			int num =sc.nextInt();
			if(num > 0) {
				for(int i = 1; i <=num;i++)
				System.out.print(i+ " ");
				break;
			}else {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
			
		}
		
		*/

		
		
		
		/*
			 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
			단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
			회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
			비회원은 게시글 조회만 가능합니다.
			
			ex.
			권한을 확인하고자 하는 회원 등급 : 관리자
			회원관리 게시글관리 게시글작성 댓글작성 게시글조회 
		
		String str;
		System.out.print("권한을 확인하고자 하는 회원 등급: ");
		str = sc.next();
		
		String[] str1 = {"회원관리","게시글 관리","게시글 작성","게시글 조회","댓글 작성"};
		String[] str2 = {"게시글 작성","게시글 조회","댓글 작성"};
		String[] str3 = {"게시글 조회"};
		
		if(str.equals("관리자")) {
			System.out.println(Arrays.toString(str1));
		} else if (str.equals("회원")) {
			System.out.println(Arrays.toString(str2));
		} else {
			System.out.println(Arrays.toString(str3));
		}
		
		
		------------------강사님-----
		
		System.out.print("권한을 확인하고자 하는 회원 등급: ");
		String role = sc.next();
		
		String access = "";
		switch(role){
		case "관리자":
			access +="회원관리 게시글관리 ";
		case "회원":
			access +="게시글작성 댓글조회 ";
		case "비회원":
			access +="게시글조회";
			break;
		default:
			System.out.println("잘못입력했습니다.");
			return;
		}
		System.out.println(access);	
		*/
		
		/*
			 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
			만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
			
			ex.
			첫 번째 숫자 : 8	첫 번째 숫자 : 4	첫 번째 숫자 : 9
			두 번째 숫자 : 4 	두 번째 숫자 : 8 	두 번째 숫자 : 0
			4 5 6 7 8 		4 5 6 7 8 		1 이상의 숫자를 입력해주세요.
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		
		if(num1 > 0 && num2 > 0) {
			if(num1 >num2) {
				for(int i = num2; i <= num1; i++) {
					System.out.print(i+ " ");
					
				}
			}else if(num2 > num1) {
				for(int i = num1; i <= num2; i++) {
					System.out.print(i+ " ");
				}
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			break;
		}
*/
			 /*
			  사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
				단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
				
				숫자 : 4				숫자 : 10
				===== 4단 ===== 			9 이하의 숫자만 입력해주세요.
				===== 5단 =====
				===== 6단 =====
				===== 7단 =====
				===== 8단 =====
				===== 9단 =====
				(해당 단의 내용들은 길이 상 생략)

			 
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num >0 && num < 10) {
			for(int i = num; i < 10; i++) {
				System.out.printf("======%d=======",i);
				System.out.println();
				for(int j = 1;j < 10;j++) {	
					System.out.println(i+"*"+j+"="+(i*j));
				}
				System.out.println();
				
			}
		}else {
			System.out.println("9이하의 숫자만 입력하세요.");
		}
		*/
			 /*
			 	길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 
				순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
				
				ex.
				1 2 3 4 5 6 7 8 9 10 
			 
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+ " ");
		}
			*/
			 /*
			 	사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 
				1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
				
				ex.
				양의 정수 : 5
				1 2 3 4 5 
			 
		System.out.println("양의 정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i =0 ;i <arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+ " ");
		}
		*/
			 /*
			 	문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
				개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
				
				ex.
				문자열 : application
				문자 : i
				application에 i가 존재하는 위치(인덱스) : 4 8 
				i 개수 : 2
			 
		String str1;
		System.out.print("문자열 : ");
		str1 =sc.nextLine();
		
		char chr;
		System.out.print("문자 :");
		chr = sc.nextLine().charAt(0);
		int count= 0;
		
		char[] ch = new char[str1.length()];
		System.out.print(str1+"에"+chr+"가 존재하는 위치 :");
		for(int i = 0; i <ch.length; i++) {
			ch[i] = str1.charAt(i);
			if(ch[i] == chr) {
				System.out.print(i+" ");
				
				count++;
			}

		}
		System.out.println();
		System.out.println(chr+" 개수 : "+count);
		*/
			 /*
			 “일“ ~ “토”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
				입력한 숫자와 같은 인덱스에 있는 요일을 출력하고 
				범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
				
				ex.
				0 ~ 6 사이 숫자 입력 : 4			0 ~ 6 사이 숫자 입력 : 7
				목요일						    잘못 입력하셨습니다.
				
				// 일 월 화 수 목 금 토
			 
		System.out.print("0 ~ 6사이 숫자를 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 0:
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		
		*/
			 
			 /*
			 4행 4열짜리 정수형 배열을 선언 및 할당하고
				1) 1 ~ 16까지 값을 차례대로 저장하세요.
				2) 저장된 값들을 차례대로 출력하세요.
			
			ex.
			 1  2  3  4 
			 5  6  7  8 
			 9 10 11 12 
			13 14 15 16 
			 
		int[][] num = new int[4][4];
		
		num[0][0] = 1;
		num[0][1] = 2;
		num[0][2] = 3;
		num[0][3] = 4;
		num[1][0] = 5;
		num[1][1] = 6;
		num[1][2] = 7;
		num[1][3] = 8;
		num[2][0] = 9;
		num[2][1] = 10;
		num[2][2] = 11;
		num[2][3] = 12;
		num[3][0] = 13;
		num[3][1] = 14;
		num[3][2] = 15;
		num[3][3] = 16;
		
		for(int j = 0; j <num.length; j++) {
			System.out.println();
			for(int i = 0; i< num[j].length;i++) {
				System.out.print(num[j][i]+" ");
		}
	}
			 */
			 /*
			 4행 4열짜리 정수형 배열을 선언 및 할당하고
				1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
				2) 저장된 값들을 차례대로 출력하세요.
			
			ex.
			16 15 14 13 
			12 11 10  9 
			 8  7  6  5 
			 4  3  2  1 
			
		int[][] arr = new int[4][4];
		int a = 16;
		
			

			for(int j = 0; j <arr.length; j++) {
				System.out.println();
				for(int i = 0; i< arr[j].length;i++) {
					arr[j][i] = a--;
					System.out.print(arr[j][i]+" ");
				}
			}
*/
			 /*
			 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
				ex. 
				주민번호를 입력하세요(- 포함) : 132456-2123456
				
				여자
			 
		String str;
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		str = sc.next();
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i <arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		if(arr[8] == 1) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		*/
		
			/*
			 A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고 
				인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
				(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
				
				ex.
				A사원의 연봉 : 2500
				B사원의 연봉 : 2900
				C사원의 연봉 : 2600
				
				A사원 연봉/연봉+a : 2500/3500.0
				3000 이상
				B사원 연봉/연봉+a : 2900/2900.0
				3000 미만
				C사원 연봉/연봉+a : 2600/2989.9999999999995
				3000 미만
			
		System.out.print("A사원의 연봉 : ");
		int num1 =sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int num2 =sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int num3 =sc.nextInt();
		
		double i = num1+(num1*0.4);
		double j = num2+(num2*0);
		double e = num3+(num3*0.15);
		
		
		System.out.println("A사원 연봉/연봉+a : "+num1+"/"+i);
		if(i>3000) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
		System.out.println("A사원 연봉/연봉+a : "+num2+"/"+j);
		if(j>3000) {
			System.out.println("3000 이상");
		}else {
			System.out.println("3000 미만");
		}
		System.out.printf("A사원 연봉/연봉+a : %d/%f \n",num3,e);
		if(e>3000) {
			System.out.println("3000 이상");
		}else {
			System.out.println("3000 미만");
		}
		
		 */
		 /*
		 	키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라 
			저체중/정상체중/과체중/비만을 출력하세요.
			BMI = 몸무게 / (키(m) * 키(m))
			BMI가 18.5미만일 경우 저체중  /  18.5이상 23미만일 경우 정상체중
			BMI가 23이상 25미만일 경우 과체중  /  25이상 30미만일 경우 비만
			BMI가 30이상일 경우 고도 비만
			
			ex.
			키(m)를 입력해 주세요 : 1.65
			몸무게(kg)를 입력해 주세요 : 58.4
			BMI 지수 : 21.45087235996327
			정상체중
		 
		System.out.print("키(m)를 입력해 주세요 : ");
		double ke = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double kg = sc.nextDouble();
		
		double bmi = kg/(ke * ke);
		
		System.out.printf("BMI 지수 : %f \n",bmi);
		if(bmi <18.5) {
			System.out.println("저체중");
		} else if(bmi < 23) {
			System.out.println("정상체중");
		} else if(bmi < 25) {
			System.out.println("과체중");
		} else if(bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도 비만");
		}
		
		 */
	/*
	 	중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
		평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요. 
		70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요. -6

		ex 1.
		중간 고사 점수 : 80
		기말 고사 점수 : 30
		과제  점수 : 60
		출석 회수 : 18
		================= 결과 =================
		중간 고사 점수(20) : 16.0
		기말 고사 점수(30) : 9.0
		과제 점수       (30) : 18.0
		출석 점수       (20) : 18.0 
		총점 : 61.0
		Fail [점수 미달]
	 
		System.out.print("중간 고사 점수 : ");
		int j = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int g = sc.nextInt();
		System.out.print("과제 고사 점수 : ");
		int r = sc.nextInt();
		System.out.print("출석 회수:");
		int c = sc.nextInt();
		
		double i = j *0.2;
		double a = g*0.3;
		double b = r *0.3;
		double z = c;
		double q = i + a+ b+ z;
		System.out.println("============== 결과 ============");
		System.out.println("중간고사 점수(20) : "+ i);
		System.out.println("기말고사 점수(20) : "+ a);
		System.out.println("과제 점수(20) : "+ b);
		System.out.println("출석 점수(20) : "+z);
		System.out.println("총점 : "+ q);
		if(q>=70 && z > 14) {
			System.out.println("PASS");
		} else if (q<70) {
			System.out.println("Fail [점수미달]");
		} else if (z < 15) {
			System.out.println("Fail [출석미달]");
		}
	 */
	 /*
		 	정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
			단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
			exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
			또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면 
			“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
			없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고 
			두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.

			연산자(+, -, *, /, %) : +
			정수1 : 10
			정수2 : 4
			10 + 4 = 14
			
			연산자(+, -, *, /, %) : /		  연산자(+, -, *, /, %) : /
			정수1 : 10 				      정수1 : 10
			정수2 : 4 				      정수2 : 0
			10 / 4 = 2				      0으로 나눌 수 없습니다. 다시 입력해주세요.
			
			연산자(+, -, *, /, %) : ^ 	  연산자(+, -, *, /, %) : exit
			정수1 : 10 				      프로그램을 종료합니다.
			정수2 : 4
			없는 연산자입니다. 다시 입력해주세요.
		 
		
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if(!((str.equals("+")) || (str.equals("-")) || (str.equals("*")) || (str.equals("/")) || (str.equals("%")))) {
				System.out.println("없는 연산자입니다 다시입력하세요");
				continue;
			}
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			if(str.equals("+")) {
				int a= num1 +num2;
				System.out.println(num1+"+"+num2+ "="+ a);
			} else if (str.equals("-")) {
				int b = num1 -num2;
					System.out.println(num1+"-"+num2+ "="+ b);	
			} else if (str.equals("*")) {
				int z = num1 *num2;
				System.out.println(num1+"*"+num2+ "="+ z);	
			} else if (str.equals("/")) {
				int r = num1 / num2;
				System.out.println(num1+"/"+num2+ "="+ r);	
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
				}
			} else if (str.equals("%")) {
				int k = num1 % num2;
				System.out.println(num1+"%"+num2+ "="+ k);
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
					
				}
			}
			
		}
		*/
		
		
		 /*
			    사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가
				몇 개 있는지 개수를 출력하세요. 
			 	“더 하시겠습니까?”라고 추가로 물어보도록 하세요.
				이 때, N이나 n이 나오면 프로그램을 끝내고 Y나 y면 계속 진행하도록 하되 Y, y, N, n이 아닌 
				다른 문자를 입력했을 경우 “잘못된 대답입니다. 다시 입력해주세요.”를 출력하고 
				더 하겠냐는 물음을 반복하세요.
				ex.
				문자열 : application			 더 하시겠습니까? (y/n) : k
				문자 : a				         잘못된 대답입니다. 다시 입력해주세요.
				포함된 개수 : 2				 더 하시겠습니까? (y/n) : Y
				더 하시겠습니까? (y/n) : y		 문자열 : ant
				문자열 : business			     문자 : b
				문자 : s				         포함된 개수 : 0
				포함된 개수 : 3				 더 하시겠습니까? (y/n) : N
			 
		
		while(true) {
			String str1;
			System.out.print("문자열 : ");
			str1 =sc.nextLine();
		
			char chr;
			System.out.print("문자 :");
			chr = sc.nextLine().charAt(0);
			int count= 0;
		
			char[] ch = new char[str1.length()];
		
			for(int i = 0; i <ch.length; i++) {
				ch[i] = str1.charAt(i);
				if(ch[i] == chr) {
					count++;
				}

		
			}
		
			System.out.println("포함된 개수 : "+count);
			while(true){
				System.out.print("더 하시겠습니까? (y/n) : "  );
				String s =sc.next();
				sc.nextLine();
				if(s.equals("Y")|| s.equals("y")) {
					break;
				} else if(s.equals("N")|| s.equals("n")) {
					return;
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요");
				}
			}
		}
			 */
		/*
			 1부터 100 사이의 정수 중 임의의 난수가 정해지고 사용자는 정해진 난수를 맞추는데 
			 몇 번 만에 맞췄는지 출력하세요.
				ex.
				90
				1~100 사이의 임의의 난수를 맞춰보세요 : 0
				1~100 사이의 숫자를 입력해주세요.
				1~100 사이의 임의의 난수를 맞춰보세요 : 101
				1~100 사이의 숫자를 입력해주세요.
				1~100 사이의 임의의 난수를 맞춰보세요 : 50
				UP !
				1~100 사이의 임의의 난수를 맞춰보세요 : 75
				UP !
				1~100 사이의 임의의 난수를 맞춰보세요 : 83
				UP !
				1~100 사이의 임의의 난수를 맞춰보세요 : 93
				DOWN !
				1~100 사이의 임의의 난수를 맞춰보세요 : 89
				UP !
				1~100 사이의 임의의 난수를 맞춰보세요 : 92
				DOWN !
				1~100 사이의 임의의 난수를 맞춰보세요 : 90
				정답입니다 !!
				7회만에 맞추셨습니다.
			
		int num = (int)(Math.random()*100)+1;
		int cou = 0;
		while(true) {
			System.out.println("1~100 사의 임의의 난수를 맞춰보세요 :");
			int n = sc.nextInt();
			cou++;
			
			if(n <1 || n > 100) {
				System.out.println("1~100사이의 숫자를 입력하세요.");
				continue;
			}
			if(n < num) {
				System.out.println("UP!");
			} else if (n > num) {
				System.out.println("DOWN!");
			} else {
				System.out.println("정답입니다!!");
				System.out.println(cou+"회만에 맞추셨습니다.");
				break;
			}
		
		}
		 */
		/*
			  사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 컴퓨터가 가위인지 보인지 주먹인지는
				랜덤한 수를 통해서 결정하도록 하고, 사용자에게는 직접 가위바위보를 받으세요.
				사용자가 “exit”를 입력하기 전까지 가위바위보를 계속 진행하고 “exit”가 들어가면 반복을 멈추고
				몇 번의 승부에서 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.

				당신의 이름을 입력해주세요 : 박신우          가위바위보 : exit
				가위바위보 : 가위                        3전 0승 2무 1패
				컴퓨터 : 가위
				박신우 : 가위
				비겼습니다.
				
				가위바위보 : 가위
				컴퓨터 : 바위
				박신우 : 가위
				졌습니다 ㅠㅠ
				
				가위바위보 : 가위
				컴퓨터 : 가위
				박신우 : 가위
				비겼습니다.

				//컴퓨터에 랜덤으로 "가위,바위,보"중 하나를 부여해야한다.
				//문자열을 랜덤으로 줄 수 없으니 우리는 랜덤 숫자를 부여하자
				//		int com = (int)(Math.random() * 3); //0(가위) 1(바위) 2(보)
				//		gameArr[0] -> 가위
				//		gameArr[1] -> 바위
				//		gameArr[2] -> 보
		 
		String[] gameArr = {"가위", "바위", "보"};
		// String[] gameArr = new String[com];
		// gameArr[0] = "가위";
		// gameArr[1] = "바위";
		// gameArr[2] = "보";
		int to = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name =sc.next();
		
		while(true) {
			int com = (int)(Math.random() *3);
			System.out.print("가위바위보 : ");
			String game = sc.next();
			if(game.equals("exit")) {
				System.out.printf(" %d전 %d승 %d무 %d패", to, win, draw, lose);
				break;
			}
			String comp = gameArr[com];
			System.out.println("컴퓨터 :"+comp);
			System.out.println(name+" : "+ game);
			
			if(comp.equals(game)) {
				draw++;
				System.out.println("비겼습니다.");
			} else if ((comp.equals("가위")&&game.equals("바위"))||(comp.equals("바위")&&game.equals("보"))||(comp.equals("보")&&game.equals("가위"))) {
				win++;
				System.out.println("이겼습니다.");
			} else {
				lose++;
				System.out.println("졌습니다 ㅜㅜ");
			}
			to++;
		}
		 */
		 /*
			 배열에 들어있는 데이터 중 홀수의 값들을 출력하고 합을 구한다. 
			단, continue를 이용하여 작성한다. 
			
			사용데이터 : int[] array = {1,2,3,4,5,6,7,8,9,10};

			실행결과: 1 
					3 
					5 
					7 
					9 
					합계 : 25.0 
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		double sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i]%2 ==1) {
				System.out.println(array[i]);
				sum+=array[i];
				continue;
			}
		}
		System.out.println("합계 : "+sum);
		*/	 
		/*
			 2차원 배열에 들어있는 데이터들의 합계와 평균을 구한다. 
			 
			 데이터 : int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
	 
		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		int sum = 0;
		for(int i = 0; i < array.length;i ++) {
			for(int j = 0; j < array[i].length; j++) {
				sum+= array[i][j];
			}
		}
		System.out.println("합계 : "+ sum);
		System.out.println("평균 : "+ sum / 16.0);
	 */
	 /*
			 2차원 배열에 들어있는 데이터중 가장 큰 값과 가장 작은 값을 구한다. 
			 
			 데이터 : int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}}; 
	
		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		int m = array[0][0];
		int n = array[0][0];
		for(int i = 0; i < array.length;i ++) {
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j]>m){
					m = array[i][j];
				}
				if(array[i][j]<n){
					n = array[i][j];
				}
			}
		}
		System.out.println(m);
		System.out.println(n);
 */
	/*
			 2차원 배열에 들어있는 데이터들 중 3의 배수만 골라내서 새로운 1차원배열에 기록하고 출력한다. 
			 단 중복 값은 하나만 기록되게 한다.
			 
			 int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}}; 
			int[] copyAr = new int[array의 행갯수 * 열갯수];
	 
		int in = 0;
		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		int[] copyAr = new int[array.length*array[0].length];
		for(int i = 0; i < array.length;i ++) {
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j]%3 == 0) {
					boolean a = false;
					for(int k = 0; k < in; k++) {
						if(copyAr[k] == array[i][j]) {
							a =true;
							break;
						}
					} if(!a) {
						copyAr[in++] = array[i][j];
					}		
				}
			}
		}
		for(int a = 0; a < in ;a++) {
			System.out.print(copyAr[a]+ " ");
		}
		*/
	}

}
