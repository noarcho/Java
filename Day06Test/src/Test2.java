import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		int input, sec, min, hour;

		Scanner scan = new Scanner(System.in);

		System.out.print("�ʸ� �Է��Ͻÿ� : ");
		input = scan.nextInt();
		
		hour = input / (int)Math.pow(60, 2);
		min = (input % (int)Math.pow(60, 2)) / 60;
		sec = (input % (int)Math.pow(60, 2)) % 60; 
		

		System.out.println(hour + "�ð� " + min + "�� " + sec + "��");
	}
}
