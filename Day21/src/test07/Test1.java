package test07;

public class Test1 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int i = 0;
		try {
			for (i = 0; i <= array.length; i++) {
				System.out.println(array[i] + " ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε��� " + i + "�� ����� �� ���׿�!.");
		}

	}
}
