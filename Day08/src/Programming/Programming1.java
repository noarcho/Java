package Programming;

import java.util.Scanner;

public class Programming1 {
	public static void main(String[] args) {
		boolean[] seat = new boolean[10];
		int input, yn;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < seat.length; i++) {
			seat[i] = false;
		}

		while (true) {
			System.out.print("�¼��� �����Ͻðڽ��ϱ�?(1 �Ǵ� 0) ");
			yn = scan.nextInt();

			if (yn == 0)
				break;

			System.out.println("������ ���� ���´� ������ �����ϴ�.");
			System.out.println("--------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print((i + 1) + " ");
			}
			System.out.println();
			System.out.println("--------------------------------");
			for (int i = 0; i < seat.length; i++) {
				if (seat[i] == true)
					System.out.print(1);
				else
					System.out.print(0);
				System.out.print(" ");
			}
			System.out.println();

			System.out.print("���° �¼��� �����Ͻðڽ��ϱ�? ");
			input = scan.nextInt();

			if (seat[input - 1] == true)
				System.out.println("�̹� ����� �¼��Դϴ�.");
			else {
				seat[input - 1] = true;
				System.out.println("����Ǿ����ϴ�.");
			}

		}

		System.out.println();

	}
}
