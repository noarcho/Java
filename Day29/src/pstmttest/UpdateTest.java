package pstmttest;

import java.sql.*;
import java.util.Scanner;

public class UpdateTest {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 연결 확인");
			
			String url = "jdbc:mysql://127.0.0.1:3306/java";
			String DBid = "root";
			String DBpw = "sds902";
			
			con = DriverManager.getConnection(url, DBid, DBpw);
			System.out.println("DB 연결 확인");
			

			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("비밀번호를 변경할 ID를 입력해주세요 >");
			String id = scan.nextLine();
			System.out.print("변경할 비밀번호를 입력해주세요 >");
			String pw = scan.nextLine();
			
			System.out.println(id + "/" + pw);
			
			String sql = "update stmttest set passwd='" + pw + "' where id='"+ id + "';";
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			System.out.println("수정 완료");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
