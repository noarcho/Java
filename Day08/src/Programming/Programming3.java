package Programming;

import java.util.Scanner;

public class Programming3 {
	public static void main(String[] args) {
		int[] grade;
		int input, sum = 0;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생의 수를 입력하시오: ");
		input = scan.nextInt();
		
		grade = new int[input];
		
		for(int i = 0 ; i < grade.length ; i++){
			System.out.print("학생 " + (i+1) + "의 성적을 입력하시오:");
			grade[i] = scan.nextInt();
			if(grade[i] > 100 || grade[i] < 0){
				System.out.println("잘못된 성적입니다. 다시 입력하시오.");
				i--;
			}
			else sum += grade[i];
		}
		
		System.out.println("성적 평균은 " + (double)sum/grade.length);

	}
}
