import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		int input;
		
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자를 입력하시오 : ");
		input = scan.nextInt();

		if(input <= 0) System.out.println("입력값이 0보다 작습니다!");
		else 
			for(int i = 1; i < input; i++){
				if(i % 3 == 0)
					System.out.print(i + " ");
			}
				
		}
}
