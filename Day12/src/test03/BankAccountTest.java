package test03;

import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount[] bank = new BankAccount[100];
		Scanner scan = new Scanner(System.in);

		int input, index = 0, custCount;	// input: ��ü �ݺ��� �޴� �Է°�, index, custCount : �迭 �ε���
		String name, acnumber, passwd; // �Է¿� �̸�, ���¹�ȣ, ��й�ȣ
		String bonus_acnumber;
		int balance; // �Է¿� �ܰ�
		boolean check = false; // ��ü �迭�� �´� ���� Ȯ�ο� boolean ����
		
		

		while (true) {
			System.out.println("-- 1:���� 2:�Ա� 3:��� 4:������ȸ -1:���� --");
			System.out.print("-- select >");
			input = scan.nextInt();
			
			if(index+1 < 10) bonus_acnumber = "0000";
			else if(index+1 < 100) bonus_acnumber = "000";
			else if(index+1 >= 100) bonus_acnumber = "00";
			else bonus_acnumber = null;


			if (input == -1)
				break;
			switch (input) {
			case 1:
				acnumber = bonus_acnumber + String.valueOf(index + 1);
				System.out.print("�̸�:");
				name = scan.next();
				System.out.print("��й�ȣ:");
				passwd = scan.next();
				System.out.print("�ʱ�ݾ�:");
				balance = scan.nextInt();
				scan.nextLine();
				bank[index] = new BankAccount(name, acnumber, passwd, balance);
				bank[index].print();
				index++;
				break;
			case 2:
				check = false;
				System.out.print("���¹�ȣ:");
				acnumber = scan.next();
				for (custCount = 0; custCount < index; custCount++) {
					if (bank[custCount].getAcnumber().equals(acnumber)) {
						check = true;
						break;
					}
				}
				if (check == true) {
					System.out.print("��й�ȣ:");
					passwd = scan.next();
					if (bank[custCount].getPasswd().equals(passwd)) {
						System.out.print("�Ա� �ݾ�:");
						balance = scan.nextInt();
						bank[custCount].deposit(balance);
					} else {
						System.out.println("��й�ȣ�� Ʋ���ϴ�.");
					}
				} else {
					System.out.println("���¸� ã���� �����ϴ�.");
				}
				break;
			case 3:
				check = false;
				System.out.print("���¹�ȣ:");
				acnumber = scan.next();
				for (custCount = 0; custCount < index; custCount++) {
					if (bank[custCount].getAcnumber().equals(acnumber)) {
						check = true;
						break;
					}
				}
				if (check == true) {
					System.out.print("��й�ȣ:");
					passwd = scan.next();
					if (bank[custCount].getPasswd().equals(passwd)) {
						System.out.print("��� �ݾ�:");
						balance = scan.nextInt();
						bank[custCount].withdraw(balance);
					} else {
						System.out.println("��й�ȣ�� Ʋ���ϴ�.");
					}

				} else {
					System.out.println("���¸� ã���� �����ϴ�.");
				}
				break;
			case 4:
				check = false;
				System.out.print("���¹�ȣ:");
				acnumber = scan.next();
				for (custCount = 0; custCount < index; custCount++) {
					if (bank[custCount].getAcnumber().equals(acnumber)) {
						check = true;
						break;
					}
				}
				if (check == true) {
					System.out.print("��й�ȣ:");
					passwd = scan.next();
					if (bank[custCount].getPasswd().equals(passwd)) {
						bank[custCount].print();
					} else {
						System.out.println("��й�ȣ�� Ʋ���ϴ�.");
					}

				} else {
					System.out.println("���¸� ã���� �����ϴ�.");
				}
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
