import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		String name;
		int age;

		Scanner scan = new Scanner(System.in);

		System.out.print("�̸��� �Է��Ͻÿ� : ");
		name = scan.nextLine();
		System.out.print("���̸� �Է��Ͻÿ� : ");
		age = scan.nextInt();
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		
		}
}
