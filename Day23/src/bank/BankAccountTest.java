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
			System.out.println("-- 1:가입 2:입금 3:출금 4:계좌조회 5:송금 6:계좌삭제 -1:종료 --");
			System.out.print("-- select >");
			input = scan.nextInt();
			scan.nextLine();
			if (input == -1)
				break;
			switch (input) {
			case 1:
				System.out.print("이름:");
				inp_name = scan.nextLine();
				System.out.print("비밀번호:");
				inp_passwd = scan.nextLine();
				System.out.print("초기금액:");
				inp_balance = scan.nextInt();
				inp_Ba = new BankAccount(inp_name, "1111" + ++countnum, inp_passwd, inp_balance);
				Ba.put("1111" + countnum, inp_Ba);
				Ba.get("1111" + countnum).print();
				break;
			case 2:
				System.out.print("계좌번호:");
				acnumber = scan.nextLine();
				if(Ba.containsKey(acnumber)){
					System.out.print("비밀번호:");
					inp_passwd = scan.nextLine();
					if(Ba.get(acnumber).getPasswd().equals(inp_passwd)){
						System.out.print("입금금액:");
						inp_balance = scan.nextInt();
						Ba.get(acnumber).deposit(inp_balance);
					}
					else System.out.println("잘못된 비밀번호입니다.");
				}
				else System.out.println("계좌가 존재하지 않습니다.");
				break;
				
			case 3:
				System.out.print("계좌번호:");
				acnumber = scan.nextLine();
				if(Ba.containsKey(acnumber)){
					System.out.print("비밀번호:");
					inp_passwd = scan.nextLine();
					if(Ba.get(acnumber).getPasswd().equals(inp_passwd)){
						System.out.print("출금금액:");
						inp_balance = scan.nextInt();
						Ba.get(acnumber).withdraw(inp_balance);
					}
					else System.out.println("잘못된 비밀번호입니다.");
				}
				else System.out.println("계좌가 존재하지 않습니다.");
				break;
				
			case 4:
				System.out.print("계좌번호:");
				acnumber = scan.nextLine();
				if(Ba.containsKey(acnumber)){
					System.out.print("비밀번호:");
					inp_passwd = scan.nextLine();
					if(Ba.get(acnumber).getPasswd().equals(inp_passwd)){
						Ba.get(acnumber).print();
					}
					else System.out.println("잘못된 비밀번호입니다.");
				}
				else System.out.println("계좌가 존재하지 않습니다.");

				break;
				
			case 5:
				System.out.print("계좌번호:");
				acnumber = scan.nextLine();
				if(Ba.containsKey(acnumber)){
					System.out.print("비밀번호:");
					inp_passwd = scan.nextLine();
					if(Ba.get(acnumber).getPasswd().equals(inp_passwd)){
						
						System.out.print("송금계좌번호:");
						tfacnumber = scan.nextLine();
						if(Ba.containsKey(tfacnumber)){
							System.out.print("송금금액:");
							inp_balance = scan.nextInt();
							Ba.get(acnumber).transfer(Ba.get(tfacnumber), inp_balance);
						}
						else System.out.println("계좌가 존재하지 않습니다.");
						break;
						
					}
					else System.out.println("잘못된 비밀번호입니다.");
				}
				else System.out.println("계좌가 존재하지 않습니다.");
				break;
				
			case 6:
				System.out.print("계좌번호:");
				acnumber = scan.nextLine();
				if(Ba.containsKey(acnumber)){
					System.out.print("비밀번호:");
					inp_passwd = scan.nextLine();
					if(Ba.get(acnumber).getPasswd().equals(inp_passwd)){
						Ba.remove(acnumber);
						System.out.println("계좌가 삭제되었습니다.");
					}
					else System.out.println("잘못된 비밀번호입니다.");
				}
				else System.out.println("계좌가 존재하지 않습니다.");
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
