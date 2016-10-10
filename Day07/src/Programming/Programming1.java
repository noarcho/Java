package Programming;

import java.util.Scanner;

public class Programming1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		boolean is_ok;

		System.out.print("물품 번호를 입력해주세요 : ");
		s = scan.nextLine();

		if (s.length() == 6) {
			if (s.substring(0, 2).matches("[a-zA-Z]{2}") == true) {
				if (s.substring(2, 6).matches("[0-9]{4}") == true) {
					is_ok = true;
				} else {
					is_ok = false;
				}
			} else {
				is_ok = false;
			}
		} else
			is_ok = false;
		
		if(is_ok==true)
			System.out.println("올바른 물품번호입니다.");
		else if(is_ok==false)
			System.out.println("잘못된 입력입니다.");

	}
}
