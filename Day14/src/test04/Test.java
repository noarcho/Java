package test04;

public class Test {
	public static void main(String[] args) {
		System.out.println(calcArea(new Shape()));
		System.out.println(calcArea(new Rectangle(10, 20)));
		System.out.println(calcArea(new Circle(5)));
		
//		 부모가 알고있는 것 중에 overriding 된거가 동적 형변환
//		 자식이 작성할 경우는 알 수가 없기 때문에 오류가 난다.
	}
	
	public static double calcArea(Shape s) {
		return s.getArea();
	}
}
