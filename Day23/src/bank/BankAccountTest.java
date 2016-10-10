package bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args) {
		Map<String, BankAccount> Ba = new HashMap<String, BankAccount>();
		BankAccount inp_Ba;
		Scanner scan = new Scanner(System.in);
		int input, countnum = 0, inp_balance;
		String inp_name, inp_passwd, acnumber, tfacnumber;

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
				inp_Ba = new BankAccount(inp_name, "1111" + ++countnum, inp_passwd, inp_balance);
				Ba.put("1111" + countnum, inp_Ba);
				Ba.get("1111" + countnum).print();
				break;
			case 2:
				System.out.print("���¹�ȣ:");
				acnumber = scan.nextLine();
				if(Ba.containsKey(acnumber)){
					System.out.print("��й�ȣ:");
					inp_passwd = scan.nextLine();
					if(Ba.get(acnumber).getPasswd().equals(inp_passwd)){
						System.out.print("�Աݱݾ�:");
						inp_balance = scan.nextInt();
						Ba.get(acnumber).deposit(inp_balance);
					}
					else System.out.println("�߸��� ��й�ȣ�Դϴ�.");
				}
				else System.out.println("���°� �������� �ʽ��ϴ�.");
				break;
				
			case 3:
				System.out.print("���¹�ȣ:");
				acnumber = scan.nextLine();
				if(Ba.containsKey(acnumber)){
					System.out.print("��й�ȣ:");
					inp_passwd = scan.nextLine();
					if(Ba.get(acnumber).getPasswd().equals(inp_passwd)){
						System.out.print("��ݱݾ�:");
						inp_balance = scan.nextInt();
						Ba.get(acnumber).withdraw(inp_balance);
					}
					else System.out.println("�߸��� ��й�ȣ�Դϴ�.");
				}
				else System.out.println("���°� �������� �ʽ��ϴ�.");
				break;
				
			case 4:
				System.out.print("���¹�ȣ:");
				acnumber = scan.nextLine();
				if(Ba.containsKey(acnumber)){
					System.out.print("��й�ȣ:");
					inp_passwd = scan.nextLine();
					if(Ba.get(acnumber).getPasswd().equals(inp_passwd)){
						Ba.get(acnumber).print();
					}
					else System.out.println("�߸��� ��й�ȣ�Դϴ�.");
				}
				else System.out.println("���°� �������� �ʽ��ϴ�.");

				break;
				
			case 5:
				System.out.print("���¹�ȣ:");
				acnumber = scan.nextLine();
				if(Ba.containsKey(acnumber)){
					System.out.print("��й�ȣ:");
					inp_passwd = scan.nextLine();
					if(Ba.get(acnumber).getPasswd().equals(inp_passwd)){
						
						System.out.print("�۱ݰ��¹�ȣ:");
						tfacnumber = scan.nextLine();
						if(Ba.containsKey(tfacnumber)){
							System.out.print("�۱ݱݾ�:");
							inp_balance = scan.nextInt();
							Ba.get(acnumber).transfer(Ba.get(tfacnumber), inp_balance);
						}
						else System.out.println("���°� �������� �ʽ��ϴ�.");
						break;
						
					}
					else System.out.println("�߸��� ��й�ȣ�Դϴ�.");
				}
				else System.out.println("���°� �������� �ʽ��ϴ�.");
				break;
				
			case 6:
				System.out.print("���¹�ȣ:");
				acnumber = scan.nextLine();
				if(Ba.containsKey(acnumber)){
					System.out.print("��й�ȣ:");
					inp_passwd = scan.nextLine();
					if(Ba.get(acnumber).getPasswd().equals(inp_passwd)){
						Ba.remove(acnumber);
						System.out.println("���°� �����Ǿ����ϴ�.");
					}
					else System.out.println("�߸��� ��й�ȣ�Դϴ�.");
				}
				else System.out.println("���°� �������� �ʽ��ϴ�.");
				break;
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
