package middle_test;

public class test01 {
	public static void main(String[] args) {
		int[] numbers = {0,1,2,3,4};
		
		for(int i = 0;i<numbers.length;i++)
		{
			numbers[i] *= 2;
			System.out.println(numbers[i]);
		}
		
	}
}