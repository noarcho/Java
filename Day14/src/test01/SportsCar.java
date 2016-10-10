package test01;

public class SportsCar extends Car {
	private boolean turbo;

	public SportsCar() {
		super(0, "SONATA", "RED");
		turbo = false;
	}// 값을 안줬을시

	public SportsCar(int s, String m, String c, boolean t) {
		super(s, m, c);
		turbo = t;
	}// 초기값을 주었을시

	public void childMethod() {
		System.out.println("자식클래스가 추가한 메소드");
	}

	public void printCar() {
		super.printCar();
		System.out.println("터보모드:turbo");
	}
}
