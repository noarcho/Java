import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		int input;
		
		Scanner scan = new Scanner(System.in);

		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		input = scan.nextInt();

		if(input <= 0) System.out.println("�Է°��� 0���� �۽��ϴ�!");
		else 
			for(int i = 1; i < input; i++){
				if(i % 3 == 0)
					System.out.print(i + " ");
			}
				
		}
}
