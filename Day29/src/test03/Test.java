package test03;

import java.sql.*;
import java.util.Scanner;



public class Test{
	public static void main(String[] args) {
		// finally���� close�ϱ� ���� ���� try�ۿ��� ������.
		Connection con = null;
		Statement stmt = null;
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
			Scanner scan = new Scanner(System.in);
			System.out.print("����:");
			String title = scan.nextLine();
			System.out.print("���ǻ�:");
			String publisher = scan.next();
			System.out.print("����:");
			int price = scan.nextInt();
			System.out.print("���ǳ⵵:");
			String year = scan.next();
			
			String sql = "insert into books(title, publisher, price, year) values ('"
			+ title + "', '" + publisher +"', " + price + ", '" + year +"')";
			
			//4. Statement ��ü ����
			stmt = con.createStatement();
			
			//5. ��ɾ� ���� -> 5.1 excuteUpdate : insert, update, delete �ش�
			int result = stmt.executeUpdate(sql);
			
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