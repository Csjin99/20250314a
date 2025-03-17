package j.interface1.ex1;

public class Run {

	public static void main(String[] args) {
		PhoneController ph = new PhoneController();
		String[] results = ph.method();
		
		for(int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
			System.out.println();
		}

	}

}
