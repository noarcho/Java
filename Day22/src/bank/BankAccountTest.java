package bank;

import java.util.LinkedList;
import java.util.Scanner;

import javax.naming.directory.SearchControls;

public class BankAccountTest {
	public static void main(String[] args) {
		LinkedList<BankAccount> Ba = new LinkedList<>();
		Scanner scan = new Scanner(System.in);
		int input, countnum = 0, acnumber, searchtfacindex, searchacindex, inp_balance;
		String inp_name, inp_passwd;

		while (true) {
			System.out.println("-- 1:���� 2:�Ա� 3:��� 4:������ȸ 5:�۱� 6:���»��� -1:���� --");
			System.out.print("-- select >");
			input = scan.nextInt();
			scan.nextLine();
			if (input == -1)
				break;
			switch (input) {
			case 1:
				System.out.print("�̸�:");
				inp_name = scan.nextLine();
				System.out.print("��й�ȣ:");
				inp_passwd = scan.nextLine();
				System.out.print("�ʱ�ݾ�:");
				inp_balance = scan.nextInt();
				BankAccount Newac = new BankAccount(inp_name, String.valueOf(++countnum), inp_passwd, inp_balance);
				Newac.print();
				Ba.add(Newac);
				break;
				
			case 2:
				System.out.print("�Ա��� ���¹�ȣ �Է�:");
				acnumber = scan.nextInt();
				scan.nextLine();
				searchacindex = SearchAccount(Ba, acnumber);
				if (searchacindex != -1) {
					System.out.print("��й�ȣ:");
					inp_passwd = scan.nextLine();
					if (inp_passwd.equals(Ba.get(searchacindex).getPasswd())) {
						System.out.print("���Ա�?:");
						inp_balance = scan.nextInt();
						Ba.get(searchacindex).deposit(inp_balance);
					} else
						System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				} else
					System.out.println("���°� �������� �ʽ��ϴ�.");
				break;
				
			case 3:
				System.out.print("����� ���¹�ȣ �Է�:");
				acnumber = scan.nextInt();
				scan.nextLine();
				searchacindex = SearchAccount(Ba, acnumber);
				if (searchacindex != -1) {
					System.out.print("��й�ȣ:");
					inp_passwd = scan.nextLine();
					if (inp_passwd.equals(Ba.get(searchacindex).getPasswd())) {
						System.out.print("�����?:");
						inp_balance = scan.nextInt();
						Ba.get(searchacindex).withdraw(inp_balance);
					} else
						System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				} else
					System.out.println("���°� �������� �ʽ��ϴ�.");
				break;
				
			case 4:
				System.out.print("���� ��ȸ�� ���¹�ȣ �Է�:");
				acnumber = scan.nextInt();
				scan.nextLine();
				searchacindex = SearchAccount(Ba, acnumber);
				if (searchacindex != -1) {
					System.out.print("��й�ȣ:");
					inp_passwd = scan.nextLine();
					if (inp_passwd.equals(Ba.get(searchacindex).getPasswd())) {
						Ba.get(searchacindex).print();
					} else
						System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				} else
					System.out.println("���°� �������� �ʽ��ϴ�.");
				break;
				
			case 5:
				System.out.print("���¹�ȣ �Է�:");
				acnumber = scan.nextInt();
				scan.nextLine();
				searchacindex = SearchAccount(Ba, acnumber);
				if (searchacindex != -1) {
					System.out.print("��й�ȣ:");
					inp_passwd = scan.nextLine();
					if (inp_passwd.equals(Ba.get(searchacindex).getPasswd())) {

						System.out.print("�۱��� ���¹�ȣ �Է�:");
						acnumber = scan.nextInt();
						scan.nextLine();
						searchtfacindex = SearchAccount(Ba, acnumber);
						if (searchtfacindex != -1) {
							System.out.print("�󸶼۱�?:");
							inp_balance = scan.nextInt();
							Ba.get(searchacindex).transfer(Ba.get(searchtfacindex), inp_balance);
						} else
							System.out.println("���°� �������� �ʽ��ϴ�.");						
					} else
						System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				} else
					System.out.println("���°� �������� �ʽ��ϴ�.");
				break;
			case 6:
				System.out.print("������ ���¹�ȣ �Է�:");
				acnumber = scan.nextInt();
				scan.nextLine();
				searchacindex = SearchAccount(Ba, acnumber);
				if (searchacindex != -1) {
					System.out.print("��й�ȣ:");
					inp_passwd = scan.nextLine();
					if (inp_passwd.equals(Ba.get(searchacindex).getPasswd())) {
						Ba.remove(searchacindex);
						System.out.println("���¸� �����Ͽ����ϴ�.");
					} else
						System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				} else
					System.out.println("���°� �������� �ʽ��ϴ�.");
				break;
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

	public static int SearchAccount(LinkedList<BankAccount> in, int acnumber) {
		int index = -1;
		for (int i = 0; i < in.size(); i++) {
			if (String.valueOf(acnumber).equals(in.get(i).getAcnumber())) {
				index = i;
				break;
			}
		}
		if (index >= 0)
			return index;
		else
			return -1;
	} // �����ϸ� �ش� index��, �������� ������ -1 ����
}
