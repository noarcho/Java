package Programming;

import java.util.Scanner;

public class Programming3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int alp = 0, blk = 0, num = 0;
		String input;
		
		System.out.print("문자열을 입력해주세요 : ");
		
		input = scan.nextLine();
		
		for(int i = 0 ; i < input.length() ; i++){
			
			if(input.substring(i, i+1).matches("[a-zA-Z]") == true)	alp++;
			else if(input.substring(i, i+1).matches("[0-9]") == true) num++;
			else if(input.substring(i, i+1).matches(" ") == true) blk++;
		}
		
		System.out.println("알파벳 글자의 갯수 : " + alp);
		System.out.println("숫자의 갯수 : " + num);
		System.out.println("공백 문자의 갯수 : " + blk);

	}
}
