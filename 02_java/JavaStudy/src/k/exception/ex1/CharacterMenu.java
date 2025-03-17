package k.exception.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CharacterMenu {
	
	public void menu() {
//		Scanner sc= new Scanner(System.in);
//		String s = sc.nextLine();
//		CharaterController cc = new CharaterController();
		String s = null;
		CharaterController cc = new CharaterController();
			
			try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
				System.out.print("문자열 : ");
				s = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				System.out.println("'"+s+"'"+"에 포합된 영문자 개수 : "+cc.countAlpha(s));
			} catch (CharCheckException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				e.printStackTrace();
			} 
		}
	}

			
		

