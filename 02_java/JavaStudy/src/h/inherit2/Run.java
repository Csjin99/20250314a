package h.inherit2;

public class Run {

	public static void main(String[] args) {
		//Desktop d1 = new Desktop();
		Desktop d1 = new Desktop("LG","d-100","사무용 PC",1000000,true);
		
		System.out.println(d1.infomation());

		TV t1 = new TV("샘숭","T-100", "LED TV",3000000,78);
		
		System.out.println(t1.infomation());

	}

}
