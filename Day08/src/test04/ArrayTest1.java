package test04;

import java.util.Scanner;

public class ArrayTest1 {
	public static void main(String[] args) {
/*		int[] salary = new int[2];
		int sum = 0;
		Scanner scan = new Scanner(System.in);

		// 입력 반복
		for (int i = 0; i < 2; i++) {
			System.out.println("직원" + (i + 1) + "의 월급을 입력하시오: ");
			salary[i] = scan.nextInt();
		}

		// 입력받은 숫자들을 sum에 누적하여 총합을 계산
		for (int i = 0; i < 2; i++)
			sum += salary[i];

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum / 2));*/
		
		final int NUMBER_COUNT;
		
		System.out.println("직원 수를 입력하시오: ");
		Scanner scan = new Scanner(System.in);
		NUMBER_COUNT = scan.nextInt();
				
		int[] salary = new int[NUMBER_COUNT];
		int sum = 0;

		// 입력 반복
		for (int i = 0; i < NUMBER_COUNT; i++) {
			System.out.println("직원" + (i + 1) + "의 월급을 입력하시오: ");
			salary[i] = scan.nextInt();
		}

		// 입력받은 숫자들을 sum에 누적하여 총합을 계산
		for (int i = 0; i < NUMBER_COUNT; i++)
			sum += salary[i];

		System.out.println("합계 : " + sum);
		// System.out.println("평균 : " + double(sum / NUMBER_COUNT)); 이거 아님!
		System.out.println("평균 : " + ((double)sum / NUMBER_COUNT));

	}
}
