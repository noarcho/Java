package Programming;

import java.util.Scanner;

public class Programming2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		int radius;

		while (true) {
			System.out.print("원의 반지름의 길이를 입력해주세요 : ");
			radius = scan.nextInt();
			System.out.println(radius * radius * 3.14);
			System.out.println("계속하시겠습니까?(Y/N)");
			s = scan.nextLine();
			s = scan.nextLine();
			
			s = s.toUpperCase();
			
			if(s.equals("N"))
				break;
			else if(s.equals("Y")){
				
			}
			else System.out.println("잘못된 입력입니다.");
		}
		// s = scan.nextLine();

	}
}
