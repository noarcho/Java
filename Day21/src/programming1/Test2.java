package programming1;

public class Test2 {
	public static void main(String[] args) {
		try {
			sub();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("허용범위 이상의 인덱스 참조 익셉션!!");
			e.printStackTrace();
		}
	}

	public static void sub() throws ArrayIndexOutOfBoundsException {
		int[] array = new int[10];
		int i = array[10];
	}
}
