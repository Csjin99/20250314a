package z.practice.object2;

//이름, 평균합격 컷, 국어최저점수, 영어최저점수

public class University {
	String name;
	int evgCut;
	int koCut;
	int enCut;
	
	public University() {
		super();
	}
	
	
	public University(String name, int evgCut, int koCut, int enCut) {
		super();
		this.name = name;
		this.evgCut = evgCut;
		this.koCut = koCut;
		this.enCut = enCut;
	}
	
	//지원한뒤 합격이면 true / 불합격이면 false 리턴
	public void apply(Student st) {
		if(st.getAvg() >= this.evgCut &&
				st.eng >= this.enCut &&
				st.korean >= this.koCut) {
			System.out.println(st.name + "님 합격입다.");
		}else {
			System.out.println(st.name +"님 불합격입니다.");
		}
		
	}
	
	public void apply(String name,double avg, double eng, double korean) {
		if(avg >= this.evgCut &&
				eng >= this.enCut &&
				korean >= this.koCut) {
			System.out.println(name + "님 합격입다.");
		}else {
			System.out.println(name +"님 불합격입니다.");
		}
		
	}
	
	

}
