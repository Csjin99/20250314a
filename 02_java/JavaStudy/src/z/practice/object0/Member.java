package z.practice.object0;

public class Member {
	String id;
	String pwd;
	String name;
	String phone;
	String email;
	int age;
	char gender;
	
	//alt + shift +s -> o
	
	public Member() {
		super();
		
	}
	
	public Member(String id, String pwd, String name) {
		this.id =id;
		this.pwd =pwd;
		this.name =name;
	}
	
	
	public void setInfo(String phone, String email, int age, char gender){
		this.phone =phone;
		this.email = email;
		this.age = age;
		this.gender = gender;
		
	}
	
	public void toInfol() {
		System.out.println("이름: "+ this.name);
		System.out.println("나이: "+ this.age);
		System.out.println("성별: "+ this.gender);
		System.out.println("전화번호: "+ this.phone);
		System.out.println("이메일: "+ this.email);
		System.out.println("id: "+ this.id + "pwd : " + this.pwd);
	}

}
