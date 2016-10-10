package Programming;

import java.util.Scanner;

public class Programming4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		int word = 1;
				
		System.out.print("문자열을 입력해주세요 : ");
		
		input = scan.nextLine();
		
		for(int i = 0 ; i < input.length() ; i++)
			if(input.substring(i, i+1).equals(" ")) word++;
		
		System.out.println("단어의 갯수 : " + word);


	}
}
