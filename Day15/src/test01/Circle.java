package test01;

public class Circle extends Shape {
	
	private int radius;
	
	public Circle(int r){
		radius = r;
	}
	
	@Override
	public double getArea(){
		return radius*radius*3.14;
	}

}
