package z.practice.object0;

public class Runn {
	public static void main(String[] args) {
		Member m = new Member();
		
		Member m1 = new Member("skqwe","qwe123","최성진");
		m1.setInfo("010-1234-5588", "asdasd@naver.com", 20, '남');
		
		
		Member m2 = new Member("skqwq","qwe123","최미진");
		m2.setInfo("010-1234-1111", "asdasd@naver.com", 30, '남');
		
		Member m3 = new Member("skqwz","qwe123","최고진");
		m3.setInfo("010-1234-5678", "asdasd@naver.com", 10, '남');
		
		m1.toInfol();
		m2.toInfol();
		m3.toInfol();
		
		}
}

