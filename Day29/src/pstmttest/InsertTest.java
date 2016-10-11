package pstmttest;

import java.sql.*;
import java.util.Scanner;

public class InsertTest {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̺� ���� Ȯ��");
			
			String url = "jdbc:mysql://127.0.0.1:3306/java";
			String DBid = "root";
			String DBpw = "sds902";
			
			con = DriverManager.getConnection(url, DBid, DBpw);
			System.out.println("DB ���� Ȯ��");
			
			
			
			Scanner scan = new Scanner(System.in);
			System.out.print("���̵� �Է� > ");
			String id = scan.nextLine();
			System.out.print("��й�ȣ �Է� > ");
			String passwd = scan.nextLine();
			System.out.print("�г��� �Է� > ");
			String nickname = scan.next();
			System.out.print("����Ʈ �Է� > ");
			int point = scan.nextInt();
			
			System.out.println(id + "/" + passwd + "/" + nickname + "/" + point);
			
			String sql = "insert into stmttest(id, passwd, nickname, point) "
					+ "values('" + id + "', '" + passwd +"', '" + nickname + "', " + point +");";
			
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			
			System.out.println("�Է� �Ϸ�");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
