package Programming;

import java.util.Scanner;

public class Programming4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		String[] hexa2bin = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
				"1011", "1100", "1101", "1110", "1111" };
		System.out.print("16진수 문자열을 입력하시오: ");
		input = scan.nextLine();
		
		System.out.print('"' + input + '"' + "에 대한 이진수는 ");
		for(int i = 0; i < input.length() ; i++){
			if(input.charAt(i) >= '0' && input.charAt(i) <= '9')
				System.out.print(hexa2bin[Integer.parseInt(input.substring(i, i+1))]);
			else
				switch(input.charAt(i)){
				case 'a': case 'A':
					System.out.print(hexa2bin[10]);
					break;
				case 'b': case 'B':
					System.out.print(hexa2bin[11]);
					break;
				case 'c': case 'C':
					System.out.print(hexa2bin[12]);
					break;
				case 'd': case 'D':
					System.out.print(hexa2bin[13]);
					break;
				case 'e': case 'E':
					System.out.print(hexa2bin[14]);
					break;
				case 'f': case 'F':
					System.out.print(hexa2bin[15]);
					break;
				
				default:
					System.out.print("error");
				}
			System.out.print(" ");
		}
		System.out.println("입니다.");
	}
}
