package Programming;

import java.util.Scanner;

public class Programming2 {
	public static void main(String[] args) {
		int[] number = new int[10];
		int input;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < number.length; i++) {
			System.out.print("���� �Է��Ͻÿ� : ");
			input = scan.nextInt();
			number[(input - 1) / 10]++;
		}

		for (int i = 0; i < number.length; i++) {
			System.out.print((i * 10 + 1) + " - " + (i + 1) * 10 + ": ");
			for (int j = 0; j < number[i]; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
