package test02;

public class SportsCar extends Car {
	private boolean isTurbo;
	
	public void printCar(){
		super.printCar();
		System.out.println("�ͺ���� : " + isTurbo);
	}
}
