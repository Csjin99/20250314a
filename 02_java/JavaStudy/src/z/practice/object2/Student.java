package z.practice.object2;

//이름 나이 수학, 영어, 국어점수를 가지고있는 학생클래스
public class Student {
	//필드
	String name; //이름
	int age; //나이
	double height; //키
	double Math;
	double eng;
	double korean;
	
	
	
	//생성자
	//객체를 초기화해주기 위한 특수목적 메서드
	//개발자가 생성해주지 않으면 기능이없는 디폴트 생성자가 컴파일과정에서 생성됨.
	//생성자는 class와 이름이 동일하다.
	//반환형이 존재하지 않는다.
	
	public Student() {
	}
	
	//생성자도 매서드 오버로딩이 가능하다
	//alt + shift + s -> o
	public Student(String name, int age, double math, double eng, double korean) {
		super();
		this.name = name;
		this.age = age;
		this.Math = math;
		this.eng = eng;
		this.korean = korean;
	}
	
	
	//메서드
	public void myInfo() { //내정보를 출력하는 기능
		System.out.println("안녕하세요. 저는" + this.age + "살의 " + this.name + "입니다.");
		
	}
	
	public double getAvg() {
		return (this.eng+ this.Math+this.korean) /3.0;
		
	}
	

	
}
