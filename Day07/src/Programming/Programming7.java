package Programming;

import java.util.Scanner;

public class Programming7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id = "admin", password = "pass1234";
		String input_id, input_password;
		
		System.out.print("���̵� �Է����ּ��� : ");
		input_id = scan.nextLine();
		System.out.print("��й�ȣ�� �Է����ּ��� : ");
		input_password = scan.nextLine();
		
		if(input_id.equals(id) == true){
			if(input_password.equals(password) == true)
				System.out.println("�α��� �Ǿ����ϴ�.");
			else
				System.out.println("��й�ȣ�� ���� �ʽ��ϴ�.");
		}
		else
			System.out.println("���̵� �����ʽ��ϴ�.");
		

	}
}
