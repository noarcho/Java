package Programming;

import java.util.Scanner;

public class Programming3 {
	public static void main(String[] args) {
		int[] grade;
		int input, sum = 0;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("�л��� ���� �Է��Ͻÿ�: ");
		input = scan.nextInt();
		
		grade = new int[input];
		
		for(int i = 0 ; i < grade.length ; i++){
			System.out.print("�л� " + (i+1) + "�� ������ �Է��Ͻÿ�:");
			grade[i] = scan.nextInt();
			if(grade[i] > 100 || grade[i] < 0){
				System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��Ͻÿ�.");
				i--;
			}
			else sum += grade[i];
		}
		
		System.out.println("���� ����� " + (double)sum/grade.length);

	}
}
