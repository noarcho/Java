package Programming;

import java.util.Scanner;

public class Programming3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int alp = 0, blk = 0, num = 0;
		String input;
		
		System.out.print("���ڿ��� �Է����ּ��� : ");
		
		input = scan.nextLine();
		
		for(int i = 0 ; i < input.length() ; i++){
			
			if(input.substring(i, i+1).matches("[a-zA-Z]") == true)	alp++;
			else if(input.substring(i, i+1).matches("[0-9]") == true) num++;
			else if(input.substring(i, i+1).matches(" ") == true) blk++;
		}
		
		System.out.println("���ĺ� ������ ���� : " + alp);
		System.out.println("������ ���� : " + num);
		System.out.println("���� ������ ���� : " + blk);

	}
}
