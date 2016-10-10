package lab2;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		int[] list;
		int sum = 0, count;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ����: ");
		count = sc.nextInt();
		list = new int[count];
		
		try{
			for(int i = 0; i < count ; i++){
				System.out.println("������ �Է��Ͻÿ�: ");
				list[i] = sc.nextInt();
			}
			for(int i = 0; i < count ; i++){

				sum += list[i];
			}
			System.out.println("����� : " + (sum /= count));
		}catch(ArithmeticException e){
			System.err.println("0���� ���� �� �����ϴ�!");
			e.printStackTrace();
		}catch(NegativeArraySizeException e){
			System.err.println("�迭�� ũ�Ⱑ �������Դϴ�!");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println("�迭�� �����ϴ� �ε����� �߸��Ǿ����ϴ�!");
			e.printStackTrace();
		}catch(NullPointerException e){
			System.err.println("Null ��ü�� �����Ͽ����ϴ�!");
			e.printStackTrace();
		}
	}
}
