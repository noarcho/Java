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
			System.out.print("좌석을 예약하시겠습니까?(1 또는 0) ");
			yn = scan.nextInt();

			if (yn == 0)
				break;

			System.out.println("현재의 예약 상태는 다음과 같습니다.");
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

			System.out.print("몇번째 좌석을 예약하시겠습니까? ");
			input = scan.nextInt();

			if (seat[input - 1] == true)
				System.out.println("이미 예약된 좌석입니다.");
			else {
				seat[input - 1] = true;
				System.out.println("예약되었습니다.");
			}

		}

		System.out.println();

	}
}
