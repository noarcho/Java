package test06;

public class Test {
	public static void main(String[] args) {
		
		// �Ʒ� ó���� ����������
		//int[]numbers;
		//numbers = new int[5];
		
		// �Ʒ�ó���� �ȵ�
		//int[] numbers;
		//numbers = {10, 20, 30, 40, 50};
		
		int[] numbers = {10, 20, 30, 40, 50};
				
		for(int i = 0; i < numbers.length; i++){
			System.out.println(numbers[i]);
		}
		
		System.out.println("-------");
		// ���ο� ������ for �ݺ���(for-each �ݺ���)
		for(int n:numbers){
			System.out.println(n);
		}
	}
}
