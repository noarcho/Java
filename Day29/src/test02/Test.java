package test02;

import java.sql.*;



public class Test{
	public static void main(String[] args) {
		// finally에서 close하기 위해 변수 try밖에서 선언함.
		Connection con = null;
		Statement stmt = null;
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
			//String sql = "insert into books(title, publisher, price, year) values ('월간 이밥차', '이밥차 편집부', 2000, '2016')";
			String sql = "insert into books(title, publisher, price, year) values ('월간 이밥차', '이밥차 편집부', 2000, '2016')";
			
			//4. Statement 객체 생성
			stmt = con.createStatement();
			
			//5. 명령어 실행 -> 5.1 excuteUpdate : insert, update, delete 해당
			int result = stmt.executeUpdate(sql);
			
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
			if(stmt!=null){
				try {
					stmt.close();
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