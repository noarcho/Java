package Programming;

import java.util.Scanner;

public class Programming2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		int radius;

		while (true) {
			System.out.print("���� �������� ���̸� �Է����ּ��� : ");
			radius = scan.nextInt();
			System.out.println(radius * radius * 3.14);
			System.out.println("����Ͻðڽ��ϱ�?(Y/N)");
			s = scan.nextLine();
			s = scan.nextLine();
			
			s = s.toUpperCase();
			
			if(s.equals("N"))
				break;
			else if(s.equals("Y")){
				
			}
			else System.out.println("�߸��� �Է��Դϴ�.");
		}
		// s = scan.nextLine();

	}
}
