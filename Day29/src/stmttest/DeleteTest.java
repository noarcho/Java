package stmttest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteTest {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� ���� Ȯ��");

			String url = "jdbc:mysql://127.0.0.1:3306/java";
			String DBid = "root";
			String DBpw = "sds902";

			con = DriverManager.getConnection(url, DBid, DBpw);
			System.out.println("DB ���� Ȯ��");
			
			stmt = con.createStatement();

			Scanner scan = new Scanner(System.in);

			System.out.print("������ id�� �Է��ϼ��� > ");
			String id = scan.nextLine();

			String sql = "delete from stmttest where id = '" + id + "'";
			stmt.executeUpdate(sql);
			System.out.println("���� �Ϸ�");

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
