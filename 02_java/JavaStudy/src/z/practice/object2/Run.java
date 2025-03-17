package z.practice.object2;

import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		//choi개체 생성 최지원, 15살, 수학 :80, 영어:60, 국어:90
		//kim개체 생성 김민수, 17살, 수학 :60, 영어:75, 국어:70
		//park개체 생성 박지민, 19살, 수학 :90, 영어:45, 국어:90
		
		Student choi = new Student("최지원", 15, 80, 60, 90);
		Student kim = new Student("김민수", 17, 60, 75, 70);
		Student park = new Student("최지원", 19, 90, 45, 86);
		
		//각 학생의 평균을 구하세요.
		
//		double choiAVG = (choi.eng +choi.korean+ choi.Math) / 3.0;
//		double kimAVG = (kim.eng +kim.korean+ kim.Math) / 3.0;
//		double parkAVG = (park.eng +park.korean+ park.Math) / 3.0;
//		
//		System.out.println(choi.name +"의 평균 :" + choiAVG);
//		System.out.println(kim.name +"의 평균 :" + kimAVG);
//		System.out.println(park.name +"의 평균 :" + choiAVG);
		
		System.out.println(choi.name +"의 평균 :" + choi.getAvg());
		System.out.println(kim.name +"의 평균 :" + kim.getAvg());
		System.out.println(park.name +"의 평균 :" + park.getAvg());
		
		//lee라는 객체를 만들것이다
		//사용자로부터 이름,나이, 영어점수, 수학, 국어점수를 입력받아
		//평균을 구해라
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.next();
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		System.out.println("영어점수 : ");
		double eng = sc.nextDouble();
		
		System.out.println("수학점수 : ");
		double math = sc.nextDouble();
		
		System.out.println("국어점수 : ");
		double kor = sc.nextDouble();
		
		
		
		Student lee = new Student(name, age, eng, math, kor);
		
		System.out.println(lee.name +"의 평균 :" + lee.getAvg());
		
		
		//kh대학교 evg cut : 75, encut : 60, kocut: 60
		
		University kh = new University("kh대학교", 75, 60, 60);
		
		// kh.apply(lee);
		
		kh.apply(lee.name, lee.getAvg(), lee.eng, lee.korean);
		
	}

}
