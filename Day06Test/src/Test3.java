import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		int input, thou, hund, ten, one;

		Scanner scan = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ� : ");
		input = scan.nextInt();
		
		thou = input / 1000;
		hund = (input % 1000) / 100;
		ten = (input % 100) /10;
		one = (input % 10);
		
		System.out.println("õ�� �ڸ� : " + thou);
		System.out.println("���� �ڸ� : " + hund);
		System.out.println("���� �ڸ� : " + ten);
		System.out.println("���� �ڸ� : " + one);
		}
}
