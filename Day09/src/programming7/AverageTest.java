package programming7;

public class AverageTest {
	public static void main(String[] args) {
		Average average = new Average();
		
		System.out.println("54, 36�� ��� : " + average.getAverage(54, 38));
		System.out.println("24, 48, 36�� ��� : " + average.getAverage(24, 48, 36));

	}
}
