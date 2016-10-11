package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test{
	public static void main(String[] args) {
		Connection con = null;
		//1. ����̹� �ε�
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� �ε� �׽�Ʈ �Ϸ�!");
			
			String url = "jdbc:mysql://127.0.0.1:3306/java";
			String id = "root";
			String pw = "sds902";
			
			//2. Ŀ�ؼ� ���� ����
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("Ŀ�ؼ� ���� �Ϸ�!!");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Ŀ�ؼ� ���� ���� : SQLException �߻�");
			e.printStackTrace();
		} finally {
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