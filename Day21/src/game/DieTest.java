package game;

import java.util.Scanner;

class Die {
	private int pip;

	public Die() {
		pip = 1;
	}

	public int roll() {

		return (int) (Math.random() * 6) + 1;
	}

	public void setValue(int v) {
		pip = v;
	}

	public int getValue() {
		return pip;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "���� �ֻ����� ������ " + getValue() + "�Դϴ�.";
	}
}

public class DieTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Die d1 = new Die();
		int input = 0;

		while(input != d1.getValue()){
			d1.setValue(d1.roll());
			System.out.print("�ֻ��� ������ �Է����ּ���: ");
			input = scan.nextInt();
			if(input == -1) break;
			if(input == d1.getValue()) System.out.println("�����Դϴ�.");
			else System.out.println("�����Դϴ�.");
			System.out.println(d1.toString());
		}
	}
}
