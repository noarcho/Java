package programming1;

public class CircleTest {
	public static void main(String[] args) {
		Circle circle = new Circle();
		
		circle.setPointX(4);
		circle.setPointY(5);
		circle.setRadius(3);
		
		System.out.println("x�� ��ǥ�� : " + circle.getPointX());
		System.out.println("y�� ��ǥ�� : " + circle.getPointY());
		System.out.println("�������� ���� : " + circle.getRadius());
		System.out.println("���� : " + circle.area());
	}

}
