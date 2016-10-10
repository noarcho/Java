package test12;

public class Test {
	public static void main(String[] args) {
		Car c = new Car(0, "RED", "BMW");

		try {
			c.speedUp();
		} catch (SpeedTooFastException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			c.speedDown();
		} catch (SpeedTooSmallException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("에러 나나 안나나~?");
	}
}
