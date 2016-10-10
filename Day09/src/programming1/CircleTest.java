package programming1;

public class CircleTest {
	public static void main(String[] args) {
		Circle circle = new Circle();
		
		circle.setPointX(4);
		circle.setPointY(5);
		circle.setRadius(3);
		
		System.out.println("x의 좌표값 : " + circle.getPointX());
		System.out.println("y의 좌표값 : " + circle.getPointY());
		System.out.println("반지름의 길이 : " + circle.getRadius());
		System.out.println("넓이 : " + circle.area());
	}

}
