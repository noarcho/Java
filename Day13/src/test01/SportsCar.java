package test01;

public class SportsCar extends Car {
	public boolean isTurbo;
	
	public void printCar(){
		super.printCar();
		System.out.println("�ͺ���� : " + isTurbo);
	}
}
