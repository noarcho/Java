package lab2;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		int[] list;
		int sum = 0, count;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수의 개수: ");
		count = sc.nextInt();
		list = new int[count];
		
		try{
			for(int i = 0; i < count ; i++){
				System.out.println("정수를 입력하시오: ");
				list[i] = sc.nextInt();
			}
			for(int i = 0; i < count ; i++){

				sum += list[i];
			}
			System.out.println("평균은 : " + (sum /= count));
		}catch(ArithmeticException e){
			System.err.println("0으로 나눌 수 없습니다!");
			e.printStackTrace();
		}catch(NegativeArraySizeException e){
			System.err.println("배열의 크기가 음수값입니다!");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println("배열을 참조하는 인덱스가 잘못되었습니다!");
			e.printStackTrace();
		}catch(NullPointerException e){
			System.err.println("Null 객체를 참조하였습니다!");
			e.printStackTrace();
		}
	}
}
