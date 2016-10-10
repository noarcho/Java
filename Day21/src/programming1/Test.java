package programming1;

public class Test {
	public static void main(String[] args) {
		sub();
	}
	public static void sub() {
		int[] array = new int[10];
		//int i = array[10];
		// 1. ArrayIndexOutOfBoundsException
		// (배열이 참조하는 인덱스가
		//  잘못되어 오류발생)
		
		try {
			int i = array[10];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("잘못된 인덱스를 참조하였습니다!");
		}
	}
}
