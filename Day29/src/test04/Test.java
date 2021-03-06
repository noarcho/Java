package test04;

import java.sql.*;
import java.util.Scanner;



public class Test{
	public static void main(String[] args) {
		// finally에서 close하기 위해 변수 try밖에서 선언함.
		Connection con = null;
		PreparedStatement pstmt = null;
		//1. 드라이버 로딩
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로딩 테스트 완료!");
			
			//String url = "jdbc:mysql://70.12.109.123:3306/java";
			String url = "jdbc:mysql://127.0.0.1:3306/java";
			String id = "root";
			String pw = "sds902";
			
			//2. 커넥션 연결 생성
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("커넥션 생성 완료!!");
			
			//3. SQL 명령어 작성
			Scanner scan = new Scanner(System.in);
			System.out.print("제목:");
			String t = scan.nextLine();
			System.out.print("출판사:");
			String p = scan.next();
			System.out.print("가격:");
			int pr = scan.nextInt();
			System.out.print("출판년도:");
			String y = scan.next();
			
			String sql = "insert into books(title, publisher, price, year) values (?, ?, ?, ?)";
			
			System.out.println(t);
			System.out.println(p);
			System.out.println(pr);
			System.out.println(y);
			
			//4. Statement 객체 생성
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, t);
			pstmt.setString(2, p);
			pstmt.setInt(3, pr);
			pstmt.setString(4, y);
			
			
			//5. 명령어 실행 -> 5.1 excuteUpdate : insert, update, delete 해당
			int result = pstmt.executeUpdate();
			
			//6. 5번의 실행 결과값 컨트롤
			System.out.println("SQL 실행 완료 결과 : " + result);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("커넥션 생성 오류 : SQLException 발생");
			e.printStackTrace();
		} finally {
			// 7. 자원 반납
			if(pstmt!=null){
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(con != null){
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}