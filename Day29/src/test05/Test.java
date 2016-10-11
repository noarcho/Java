package test05;

import java.sql.*;
import java.util.Scanner;



public class Test{
	public static void main(String[] args) {
		// finally���� close�ϱ� ���� ���� try�ۿ��� ������.
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//1. ����̹� �ε�
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� �ε� �׽�Ʈ �Ϸ�!");
			
			//String url = "jdbc:mysql://70.12.109.123:3306/java";
			String url = "jdbc:mysql://127.0.0.1:3306/java";
			String id = "root";
			String pw = "sds902";
			
			//2. Ŀ�ؼ� ���� ����
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("Ŀ�ؼ� ���� �Ϸ�!!");
			
			//3. SQL ��ɾ� �ۼ�
			
			String sql = "select book_id, title, price from books";
			
			//4. Statement ��ü ����
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				int book_id = rs.getInt(1);
				String title = rs.getString(2);
				int price = rs.getInt(3);
				
				System.out.println(book_id + "/" + title + "/" + price);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Ŀ�ؼ� ���� ���� : SQLException �߻�");
			e.printStackTrace();
		} finally {
			// 7. �ڿ� �ݳ�
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