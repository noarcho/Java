package rps;

import java.util.Scanner;

//0 ���� 1 ���� 2 ��
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
			System.out.println("���º��Դϴ�.");
		else if ((select == 2 && input == 0) || (select == 0 && input == 2)) {
			if (select == 2 && input == 0)
				System.out.println("����� �̰���ϴ�.");
			else if (select == 0 && input == 2)
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			else
				System.out.println("����!");
		} else if (select > input) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		} else if (select < input)
			System.out.println("����� �̰���ϴ�.");
	}

	public void print() {
		System.out.print("��ǻ�ʹ� ");
		if (select == 2)
			System.out.print("��");
		else if (select == 1)
			System.out.print("����");
		else if (select == 0)
			System.out.print("����");
		System.out.println("�� �����մϴ�.");
	}
}

public class RpsTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		rps game = new rps();
		int input;

		while (true) {
			System.out.print("�ϳ��� �����Ͻÿ�: ����(0), ����(1), ��(2). [-1 �Է½� ����]:");
			input = scan.nextInt();
			if(input == -1) break;
			if (input >= 0 && input <= 2) {
				game.setValue(game.rps_roll());
				game.print();
				game.check(input);
			} else
				System.out.println("�߸��� �Է°��Դϴ�.");
		}
	}
}
