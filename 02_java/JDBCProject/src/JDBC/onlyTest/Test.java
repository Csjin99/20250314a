package JDBC.onlyTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		Statement st = null;
		int res = 0;
		
		System.out.println("번호 입력  : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		String sql = "INSERT INTO TEST1 VALUES(" + num + ",'"+ name + "'," + age + ", SYSDATE)";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("OracleDriver 등록성공");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##JDBC", "JDBC");
			con.setAutoCommit(false);
			
			st = con.createStatement();
			
			res = st.executeUpdate(sql);
			if(res>0) {
				con.commit();
			}else {
				con.rollback();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if(res>0) {
			System.out.println("데이터 삽입 성공");
		}else {
			System.out.println("데이터 삽입 실패");
		}
		

	}

}
