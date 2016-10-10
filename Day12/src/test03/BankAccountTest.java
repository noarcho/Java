package test03;

import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount[] bank = new BankAccount[100];
		Scanner scan = new Scanner(System.in);

		int input, index = 0, custCount;	// input: 전체 반복시 메뉴 입력값, index, custCount : 배열 인덱스
		String name, acnumber, passwd; // 입력용 이름, 계좌번호, 비밀번호
		String bonus_acnumber;
		int balance; // 입력용 잔고
		boolean check = false; // 전체 배열중 맞는 계좌 확인용 boolean 변수
		
		

		while (true) {
			System.out.println("-- 1:가입 2:입금 3:출금 4:계좌조회 -1:종료 --");
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
				System.out.print("이름:");
				name = scan.next();
				System.out.print("비밀번호:");
				passwd = scan.next();
				System.out.print("초기금액:");
				balance = scan.nextInt();
				scan.nextLine();
				bank[index] = new BankAccount(name, acnumber, passwd, balance);
				bank[index].print();
				index++;
				break;
			case 2:
				check = false;
				System.out.print("계좌번호:");
				acnumber = scan.next();
				for (custCount = 0; custCount < index; custCount++) {
					if (bank[custCount].getAcnumber().equals(acnumber)) {
						check = true;
						break;
					}
				}
				if (check == true) {
					System.out.print("비밀번호:");
					passwd = scan.next();
					if (bank[custCount].getPasswd().equals(passwd)) {
						System.out.print("입금 금액:");
						balance = scan.nextInt();
						bank[custCount].deposit(balance);
					} else {
						System.out.println("비밀번호가 틀립니다.");
					}
				} else {
					System.out.println("계좌를 찾을수 없습니다.");
				}
				break;
			case 3:
				check = false;
				System.out.print("계좌번호:");
				acnumber = scan.next();
				for (custCount = 0; custCount < index; custCount++) {
					if (bank[custCount].getAcnumber().equals(acnumber)) {
						check = true;
						break;
					}
				}
				if (check == true) {
					System.out.print("비밀번호:");
					passwd = scan.next();
					if (bank[custCount].getPasswd().equals(passwd)) {
						System.out.print("출금 금액:");
						balance = scan.nextInt();
						bank[custCount].withdraw(balance);
					} else {
						System.out.println("비밀번호가 틀립니다.");
					}

				} else {
					System.out.println("계좌를 찾을수 없습니다.");
				}
				break;
			case 4:
				check = false;
				System.out.print("계좌번호:");
				acnumber = scan.next();
				for (custCount = 0; custCount < index; custCount++) {
					if (bank[custCount].getAcnumber().equals(acnumber)) {
						check = true;
						break;
					}
				}
				if (check == true) {
					System.out.print("비밀번호:");
					passwd = scan.next();
					if (bank[custCount].getPasswd().equals(passwd)) {
						bank[custCount].print();
					} else {
						System.out.println("비밀번호가 틀립니다.");
					}

				} else {
					System.out.println("계좌를 찾을수 없습니다.");
				}
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
