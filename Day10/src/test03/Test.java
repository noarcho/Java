package test03;

public class Test {
	public static void main(String[] args) {

		System.out.println("CarŬ���� ��ü�� �� : " + Car.getNumOfCars());		
		Car c1 = new Car();
		Car c2 = new Car(10, "RED", "BMW");
		
		System.out.println("CarŬ���� ��ü�� �� : " + Car.getNumOfCars());
		
		// static : � ��ü�� �Ҽӵ��� �ʰ� �ϳ��� �����ϴ� ����
	}
}