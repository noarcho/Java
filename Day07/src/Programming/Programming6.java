package Programming;

import java.util.Scanner;

public class Programming6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vow = 0, con = 0;
		String input;
		
		System.out.print("���ڿ��� �Է����ּ��� : ");
		
		input = scan.nextLine();
		
		for(int i = 0 ; i < input.length() ; i++){
			
			if(input.substring(i, i+1).matches("[aeiouAEIOU]") == true)	vow++;
			else if(input.substring(i, i+1).matches("[[^aeiouAEIOU ]a-zA-Z]") == true) con++;
		}
		
		System.out.println("������ ���� : " + vow);
		System.out.println("������ ���� : " + con);

	}
}
