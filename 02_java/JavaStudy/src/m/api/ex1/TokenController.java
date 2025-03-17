package m.api.ex1;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		super();
	}
	
	public String afterToken(String str) {
		StringTokenizer stn = new StringTokenizer(str, " ");
		String[] arr = str.split(" ");
		String str2 = String.join("",arr);
		return str2;
	}
	
	public String firstCap(String input) {
		String str =input.substring(0,1).toUpperCase();
		String str1 = str + input.substring(1);
		return str1;
		
	}
	
	public int findchar(String input, char one) {
		int count = 0;
		for(char c : input.toCharArray()) {
			if(c == one) {
				count++;
			}
		}
		return count;
	}
}

