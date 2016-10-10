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
		return "현재 주사위의 눈금은 " + getValue() + "입니다.";
	}
}

public class DieTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Die d1 = new Die();
		int input = 0;

		while(input != d1.getValue()){
			d1.setValue(d1.roll());
			System.out.print("주사위 눈금을 입력해주세요: ");
			input = scan.nextInt();
			if(input == -1) break;
			if(input == d1.getValue()) System.out.println("정답입니다.");
			else System.out.println("오답입니다.");
			System.out.println(d1.toString());
		}
	}
}
