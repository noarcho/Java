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
			System.out.println("결과:" + result);
		} catch (ArithmeticException ex) {
			System.out.println("두번째 숫자에 0을 입력하면 노노");
		} catch (InputMismatchException ex){
			System.out.println("숫자 입력하라고 숫자숫자숫자숫자");
		}
		System.out.println("프로그램 종료");

	}
}
