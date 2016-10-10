package test06;

public class Test {
	public static void main(String[] args) {
		
		// 아래 처럼은 가능하지만
		//int[]numbers;
		//numbers = new int[5];
		
		// 아래처럼은 안됨
		//int[] numbers;
		//numbers = {10, 20, 30, 40, 50};
		
		int[] numbers = {10, 20, 30, 40, 50};
				
		for(int i = 0; i < numbers.length; i++){
			System.out.println(numbers[i]);
		}
		
		System.out.println("-------");
		// 새로운 형태의 for 반복문(for-each 반복문)
		for(int n:numbers){
			System.out.println(n);
		}
	}
}
