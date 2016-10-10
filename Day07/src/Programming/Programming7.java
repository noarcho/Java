package Programming;

import java.util.Scanner;

public class Programming7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id = "admin", password = "pass1234";
		String input_id, input_password;
		
		System.out.print("아이디를 입력해주세요 : ");
		input_id = scan.nextLine();
		System.out.print("비밀번호를 입력해주세요 : ");
		input_password = scan.nextLine();
		
		if(input_id.equals(id) == true){
			if(input_password.equals(password) == true)
				System.out.println("로그인 되었습니다.");
			else
				System.out.println("비밀번호가 맞지 않습니다.");
		}
		else
			System.out.println("아이디가 맞지않습니다.");
		

	}
}
