import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		int num1, num2, num3, average;

		Scanner scan = new Scanner(System.in);

		System.out.print("���� �Է��Ͻÿ� : ");
		num1 = scan.nextInt();
		System.out.print("���� �Է��Ͻÿ� : ");
		num2 = scan.nextInt();
		System.out.print("���� �Է��Ͻÿ� : ");
		num3 = scan.nextInt();

		average = (num1 + num2 + num3);
		
		System.out.println("��� : " + average/3.0);
	}
}
