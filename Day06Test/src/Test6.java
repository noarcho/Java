import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		int amount;
		double pay;
		
		Scanner scan = new Scanner(System.in);

		System.out.print("���� ������ �Է��Ͻÿ� : ");
		amount = scan.nextInt();
		
		if(amount >= 10) pay = 100 * amount * 0.9;
		else pay =  100 * amount;
		
		System.out.println("���� : " + pay);
				
		}
}
