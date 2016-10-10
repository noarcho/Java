import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		int input, thou, hund, ten, one;

		Scanner scan = new Scanner(System.in);

		System.out.print("정수를 입력하시오 : ");
		input = scan.nextInt();
		
		thou = input / 1000;
		hund = (input % 1000) / 100;
		ten = (input % 100) /10;
		one = (input % 10);
		
		System.out.println("천의 자리 : " + thou);
		System.out.println("백의 자리 : " + hund);
		System.out.println("십의 자리 : " + ten);
		System.out.println("일의 자리 : " + one);
		}
}
