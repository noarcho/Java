package programming1;

public class Programming1 {
	public static void main(String[] args) {
		Cylinder obj1 = new Cylinder();
		System.out.println("obj1의 반지름의 길이 : " + obj1.getRadius());
		System.out.println("obj1의 면적의 넓이 : " + obj1.getArea());
		System.out.println("======================");
		Cylinder obj2 = new Cylinder(5.0, 3.0);
		System.out.println("obj2의 반지름의 길이 : " +obj2.getRadius());
		System.out.println("obj2의 면적의 넓이 : " + obj2.getArea());
		System.out.println("obj1의 높이의 길이 : " + obj2.getHeight());
		System.out.println("obj1의 부피 : " + obj2.getVolume());
	}
}

class Circle {
	private double radius;
	private String color;
	
	public Circle(){
		this.radius = 0;
		this.color = null;
	}
	public Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
	}
	public double getRadius(){
		return radius;
	}
	public double getArea(){
		return Math.pow(radius, 2) * Math.PI;
	}
}

class Cylinder extends Circle {
	private double height;
	
	public Cylinder(){	}
	public Cylinder(double radius){
		super(radius, null);
	}
	public Cylinder(double radius, double height){
		super(radius, null);
		this.height = height;
	}
	public double getHeight(){
		return height;
	}
	public double getVolume(){
		return super.getArea()*height;
	}
}