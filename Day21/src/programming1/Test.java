package programming1;

public class Test {
	public static void main(String[] args) {
		sub();
	}
	public static void sub() {
		int[] array = new int[10];
		//int i = array[10];
		// 1. ArrayIndexOutOfBoundsException
		// (�迭�� �����ϴ� �ε�����
		//  �߸��Ǿ� �����߻�)
		
		try {
			int i = array[10];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("�߸��� �ε����� �����Ͽ����ϴ�!");
		}
	}
}
