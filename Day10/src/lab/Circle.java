package lab;

public class Circle {
	private double radius;
	private final static double PI = 3.141592;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	private double square(double radius){
		return Math.pow(radius, 2);
	}
	
	public double getArea(){
		return square(radius)*getPI();
	}
	
	public double getPerimeter(){
		return 2 * radius * getPI();
	}
	public static double getPI(){
		return PI;
	}
	
/*	public static void main(String[] args) {
		// square(10.0); static으로 정적임을 명시해주거나 새 객체를 new로 생성해주지 않으면 에러가 난다.
//		getPI();
	}*/ 
}
