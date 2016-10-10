import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		int input, sec, min, hour;

		Scanner scan = new Scanner(System.in);

		System.out.print("초를 입력하시오 : ");
		input = scan.nextInt();
		
		hour = input / (int)Math.pow(60, 2);
		min = (input % (int)Math.pow(60, 2)) / 60;
		sec = (input % (int)Math.pow(60, 2)) % 60; 
		

		System.out.println(hour + "시간 " + min + "분 " + sec + "초");
	}
}
