package test04;

public class Test {
	public static void main(String[] args) {
		System.out.println(calcArea(new Shape()));
		System.out.println(calcArea(new Rectangle(10, 20)));
		System.out.println(calcArea(new Circle(5)));
		
//		 �θ� �˰��ִ� �� �߿� overriding �ȰŰ� ���� ����ȯ
//		 �ڽ��� �ۼ��� ���� �� ���� ���� ������ ������ ����.
	}
	
	public static double calcArea(Shape s) {
		return s.getArea();
	}
}
