import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		String name;
		int age;

		Scanner scan = new Scanner(System.in);

		System.out.print("이름를 입력하시오 : ");
		name = scan.nextLine();
		System.out.print("나이를 입력하시오 : ");
		age = scan.nextInt();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
		}
}
