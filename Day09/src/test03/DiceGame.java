package test03;

import java.util.Scanner;
import java.util.Random;

public class DiceGame {
	private int randomNumber;
	private int userGuess;

	private void RollDice() {
		
		// randomNumber = (int)(Math.random() * 6 ) +1;
		randomNumber = new Random().nextInt(10) + 1;
	}

	private void inputUserGuess() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����ϴ� ���� �Է�:");
		userGuess = scan.nextInt();
	}

	private void checkAnswer() {
		if (randomNumber == userGuess) {
			System.out.println("���߼̽��ϴ�!! �����մϴ�!!");
		} else
			System.out.println("Ʋ�Ƚ��ϴ�.. ������" + randomNumber + "�Դϴ�.");
	}
	
	public void startGame(){
		RollDice();
		inputUserGuess();
		checkAnswer();
	}
}
