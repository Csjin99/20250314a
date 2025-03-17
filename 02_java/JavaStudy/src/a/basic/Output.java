package a.basic;

public class Output {
	public static void main(String[] args) {
		//코드를 사용하는 영역
		
		
		
		//출력문
		//println() = \n -> 개행문자를 포함
		System.out.println("안녕하세여ㅛ");
		//print() -> 일반출력문
		System.out.print("성진");
		
		//문자열 포멧을 이용한 출력문
		//System.out.printf(문자열 포멧, 값1, 값2, 값3)
		String name = "최성진";
		int age = 15;
		System.out.println("저는" + name + "이고 나이는" + age + "살이다");
		System.out.println(name );
		System.out.printf("저는 %s이고 나이는 %d입니다.", name, age);
		/*
		 *포멧안에서 쓸수 있는 키워드 
		 * %d : 정수
		 * %c : 문자
		 * %s : 문자열
		 * %f : 실수
		 */
		
		
		/*
		 * 주석: 컴퓨터는 인식하지않고 사람이 필요에 따라 설명등을 적어두는 용도
		 */
	}

}
