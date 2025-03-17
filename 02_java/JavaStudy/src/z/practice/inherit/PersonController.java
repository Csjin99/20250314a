package z.practice.inherit;

public class PersonController {
	Student[] s = new Student[3];
	Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int[] co = new int[2];
		int scount = 0;
		int ecount = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i] != null) {
				scount++;
			}
		}
		for(int i = 0; i < e.length; i++) {
			if(e[i] != null) {
				ecount++;
			}
		}
		co[0]= scount;
		co[1]= ecount;
		return co;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		
	}
	public Student[] printStudent() {
		return null;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
	
	}
	
	public Employee[] printEmployee() {
		return null;
	}
}
