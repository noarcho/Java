package test04;

import java.util.Scanner;

public class ArrayTest1 {
	public static void main(String[] args) {
/*		int[] salary = new int[2];
		int sum = 0;
		Scanner scan = new Scanner(System.in);

		// �Է� �ݺ�
		for (int i = 0; i < 2; i++) {
			System.out.println("����" + (i + 1) + "�� ������ �Է��Ͻÿ�: ");
			salary[i] = scan.nextInt();
		}

		// �Է¹��� ���ڵ��� sum�� �����Ͽ� ������ ���
		for (int i = 0; i < 2; i++)
			sum += salary[i];

		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + (sum / 2));*/
		
		final int NUMBER_COUNT;
		
		System.out.println("���� ���� �Է��Ͻÿ�: ");
		Scanner scan = new Scanner(System.in);
		NUMBER_COUNT = scan.nextInt();
				
		int[] salary = new int[NUMBER_COUNT];
		int sum = 0;

		// �Է� �ݺ�
		for (int i = 0; i < NUMBER_COUNT; i++) {
			System.out.println("����" + (i + 1) + "�� ������ �Է��Ͻÿ�: ");
			salary[i] = scan.nextInt();
		}

		// �Է¹��� ���ڵ��� sum�� �����Ͽ� ������ ���
		for (int i = 0; i < NUMBER_COUNT; i++)
			sum += salary[i];

		System.out.println("�հ� : " + sum);
		// System.out.println("��� : " + double(sum / NUMBER_COUNT)); �̰� �ƴ�!
		System.out.println("��� : " + ((double)sum / NUMBER_COUNT));

	}
}
