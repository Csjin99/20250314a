package k.exception.ex1;

public class CharaterController {

	public CharaterController() {
		super();
	}
	
	public int countAlpha(String s) throws CharCheckException{
		int count = 0;
		char[] a = new char[s.length()];
		for(int i = 0; i <s.length();i++) {
			a[i] = s.charAt(i);
			if(s.charAt(i) > 64 && s.charAt(i) > 91 || s.charAt(i)>96 && s.charAt(i)<123) {
				count++;
			}
				if(a[i] == ' ') {
					throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
				}
		} 
		
		return count;
	}

}
