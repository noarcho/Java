package test01;

public class SportsCar extends Car {
	private boolean turbo;

	public SportsCar() {
		super(0, "SONATA", "RED");
		turbo = false;
	}// ���� ��������

	public SportsCar(int s, String m, String c, boolean t) {
		super(s, m, c);
		turbo = t;
	}// �ʱⰪ�� �־�����

	public void childMethod() {
		System.out.println("�ڽ�Ŭ������ �߰��� �޼ҵ�");
	}

	public void printCar() {
		super.printCar();
		System.out.println("�ͺ����:turbo");
	}
}
