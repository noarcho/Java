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
				BankAccount Newac = new BankAccount(inp_name, String.valueOf(++countnum), inp_passwd, inp_balance);
				Newac.print();
				Ba.add(Newac);
				break;
				
			case 2:
				System.out.print("입금할 계좌번호 입력:");
				acnumber = scan.nextInt();
				scan.nextLine();
				searchacindex = SearchAccount(Ba, acnumber);
				if (searchacindex != -1) {
					System.out.print("비밀번호:");
					inp_passwd = scan.nextLine();
					if (inp_passwd.equals(Ba.get(searchacindex).getPasswd())) {
						System.out.print("얼마입금?:");
						inp_balance = scan.nextInt();
						Ba.get(searchacindex).deposit(inp_balance);
					} else
						System.out.println("비밀번호가 틀렸습니다.");
				} else
					System.out.println("계좌가 존재하지 않습니다.");
				break;
				
			case 3:
				System.out.print("출금할 계좌번호 입력:");
				acnumber = scan.nextInt();
				scan.nextLine();
				searchacindex = SearchAccount(Ba, acnumber);
				if (searchacindex != -1) {
					System.out.print("비밀번호:");
					inp_passwd = scan.nextLine();
					if (inp_passwd.equals(Ba.get(searchacindex).getPasswd())) {
						System.out.print("얼마출금?:");
						inp_balance = scan.nextInt();
						Ba.get(searchacindex).withdraw(inp_balance);
					} else
						System.out.println("비밀번호가 틀렸습니다.");
				} else
					System.out.println("계좌가 존재하지 않습니다.");
				break;
				
			case 4:
				System.out.print("계좌 조회할 계좌번호 입력:");
				acnumber = scan.nextInt();
				scan.nextLine();
				searchacindex = SearchAccount(Ba, acnumber);
				if (searchacindex != -1) {
					System.out.print("비밀번호:");
					inp_passwd = scan.nextLine();
					if (inp_passwd.equals(Ba.get(searchacindex).getPasswd())) {
						Ba.get(searchacindex).print();
					} else
						System.out.println("비밀번호가 틀렸습니다.");
				} else
					System.out.println("계좌가 존재하지 않습니다.");
				break;
				
			case 5:
				System.out.print("계좌번호 입력:");
				acnumber = scan.nextInt();
				scan.nextLine();
				searchacindex = SearchAccount(Ba, acnumber);
				if (searchacindex != -1) {
					System.out.print("비밀번호:");
					inp_passwd = scan.nextLine();
					if (inp_passwd.equals(Ba.get(searchacindex).getPasswd())) {

						System.out.print("송금할 계좌번호 입력:");
						acnumber = scan.nextInt();
						scan.nextLine();
						searchtfacindex = SearchAccount(Ba, acnumber);
						if (searchtfacindex != -1) {
							System.out.print("얼마송금?:");
							inp_balance = scan.nextInt();
							Ba.get(searchacindex).transfer(Ba.get(searchtfacindex), inp_balance);
						} else
							System.out.println("계좌가 존재하지 않습니다.");						
					} else
						System.out.println("비밀번호가 틀렸습니다.");
				} else
					System.out.println("계좌가 존재하지 않습니다.");
				break;
			case 6:
				System.out.print("삭제할 계좌번호 입력:");
				acnumber = scan.nextInt();
				scan.nextLine();
				searchacindex = SearchAccount(Ba, acnumber);
				if (searchacindex != -1) {
					System.out.print("비밀번호:");
					inp_passwd = scan.nextLine();
					if (inp_passwd.equals(Ba.get(searchacindex).getPasswd())) {
						Ba.remove(searchacindex);
						System.out.println("계좌를 삭제하였습니다.");
					} else
						System.out.println("비밀번호가 틀렸습니다.");
				} else
					System.out.println("계좌가 존재하지 않습니다.");
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
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
	} // 존재하면 해당 index값, 존재하지 않으면 -1 리턴
}
