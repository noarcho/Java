package Programming;

import java.util.Scanner;

public class Programming5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		
		System.out.print("���ڿ��� �Է����ּ��� : ");
		
		input = scan.nextLine();

		for(int i = input.length()-1; i >= 0 ; i--)
			System.out.print(input.charAt(i));

	}
}
