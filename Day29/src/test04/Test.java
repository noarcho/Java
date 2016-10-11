package test04;

import java.sql.*;
import java.util.Scanner;



public class Test{
	public static void main(String[] args) {
		// finally���� close�ϱ� ���� ���� try�ۿ��� ������.
		Connection con = null;
		PreparedStatement pstmt = null;
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
			
			//3. SQL ���ɾ� �ۼ�
			Scanner scan = new Scanner(System.in);
			System.out.print("����:");
			String t = scan.nextLine();
			System.out.print("���ǻ�:");
			String p = scan.next();
			System.out.print("����:");
			int pr = scan.nextInt();
			System.out.print("���ǳ⵵:");
			String y = scan.next();
			
			String sql = "insert into books(title, publisher, price, year) values (?, ?, ?, ?)";
			
			System.out.println(t);
			System.out.println(p);
			System.out.println(pr);
			System.out.println(y);
			
			//4. Statement ��ü ����
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, t);
			pstmt.setString(2, p);
			pstmt.setInt(3, pr);
			pstmt.setString(4, y);
			
			
			//5. ���ɾ� ���� -> 5.1 excuteUpdate : insert, update, delete �ش�
			int result = pstmt.executeUpdate();
			
			//6. 5���� ���� ����� ��Ʈ��
			System.out.println("SQL ���� �Ϸ� ��� : " + result);
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