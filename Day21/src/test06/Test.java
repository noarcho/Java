package test06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2, result;


		try {
			System.out.println("num1:");
			n1 = scan.nextInt();
			System.out.println("num2");
			n2 = scan.nextInt();

			result = n1 / n2;
			System.out.println("���:" + result);
		} catch (ArithmeticException ex) {
			System.out.println("�ι�° ���ڿ� 0�� �Է��ϸ� ���");
		} catch (InputMismatchException ex){
			System.out.println("���� �Է��϶�� ���ڼ��ڼ��ڼ���");
		}
		System.out.println("���α׷� ����");

	}
}
