package rps;

import java.util.Scanner;

//0 가위 1 바위 2 보
class rps {
	private int select;

	public rps() {
		select = 0;
	}

	public int rps_roll() {
		return (int) (Math.random() * 3);
	}

	public void setValue(int v) {
		select = v;
	}

	public void check(int input) {
		if (select == input)
			System.out.println("무승부입니다.");
		else if ((select == 2 && input == 0) || (select == 0 && input == 2)) {
			if (select == 2 && input == 0)
				System.out.println("당신이 이겼습니다.");
			else if (select == 0 && input == 2)
				System.out.println("컴퓨터가 이겼습니다.");
			else
				System.out.println("에러!");
		} else if (select > input) {
			System.out.println("컴퓨터가 이겼습니다.");
		} else if (select < input)
			System.out.println("당신이 이겼습니다.");
	}

	public void print() {
		System.out.print("컴퓨터는 ");
		if (select == 2)
			System.out.print("보");
		else if (select == 1)
			System.out.print("바위");
		else if (select == 0)
			System.out.print("가위");
		System.out.println("를 선택합니다.");
	}
}

public class RpsTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		rps game = new rps();
		int input;

		while (true) {
			System.out.print("하나를 선택하시요: 가위(0), 바위(1), 보(2). [-1 입력시 종료]:");
			input = scan.nextInt();
			if(input == -1) break;
			if (input >= 0 && input <= 2) {
				game.setValue(game.rps_roll());
				game.print();
				game.check(input);
			} else
				System.out.println("잘못된 입력값입니다.");
		}
	}
}
