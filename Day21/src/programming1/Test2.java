package programming1;

public class Test2 {
	public static void main(String[] args) {
		try {
			sub();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("������ �̻��� �ε��� ���� �ͼ���!!");
			e.printStackTrace();
		}
	}

	public static void sub() throws ArrayIndexOutOfBoundsException {
		int[] array = new int[10];
		int i = array[10];
	}
}
