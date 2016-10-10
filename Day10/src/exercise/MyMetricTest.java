package exercise;

public class MyMetricTest {
	public static void main(String[] args) {
		MyMetric m1 = new MyMetric();
		MyMetric m2 = new MyMetric();
		
		System.out.println(m1.kiloToMile(20));
		System.out.println(m2.mileToKilo(20));
	}

}
