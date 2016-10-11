package stmttest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로딩 확인");

			String url = "jdbc:mysql://127.0.0.1:3306/java";
			String DBid = "root";
			String DBpw = "sds902";

			con = DriverManager.getConnection(url, DBid, DBpw);
			System.out.println("DB 연결 확인");

			String sql = "select id, passwd, nickname, point from stmttest";
			stmt = con.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String id1 = rs.getString(1);
				String passwd = rs.getString(2);
				String nickname = rs.getString(3);
				int point = rs.getInt(4);

				System.out.println(id1 + "/" + passwd + "/" + nickname + "/" + point);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
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
