package test03;

public class Test {
	public static void main(String[] args) {

		System.out.println("Car클래스 객체의 수 : " + Car.getNumOfCars());		
		Car c1 = new Car();
		Car c2 = new Car(10, "RED", "BMW");
		
		System.out.println("Car클래스 객체의 수 : " + Car.getNumOfCars());
		
		// static : 어떤 객체에 소속되지 않고 하나만 유지하는 변수
	}
}