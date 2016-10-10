package middle_test;

import java.util.Scanner;

public class test02 {
	public static void main(String[] args) {
		double[] numbers;
		int input;

		Scanner scan = new Scanner(System.in);

		System.out.println("배열의 크기를 입력하시오: ");
		input = scan.nextInt();

		numbers = new double[input];

		System.out.println("double형 배열 생성");

	}
}