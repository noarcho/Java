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
		System.out.println("추측하는 숫자 입력:");
		userGuess = scan.nextInt();
	}

	private void checkAnswer() {
		if (randomNumber == userGuess) {
			System.out.println("맞추셨습니다!! 축하합니다!!");
		} else
			System.out.println("틀렸습니다.. 정답은" + randomNumber + "입니다.");
	}
	
	public void startGame(){
		RollDice();
		inputUserGuess();
		checkAnswer();
	}
}
