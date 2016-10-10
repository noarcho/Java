package programming2;

interface Drawable {
	void draw();
}

class Shape {
	protected int x,y;
}

class Rectangle extends Shape implements Drawable {

	@Override
	public void draw() {
		System.out.println("Rectangle Draw");
		
	}
	
}

class Triangle extends Shape implements Drawable {

	@Override
	public void draw() {
		System.out.println("Triangle Draw");
		
	}
	
}

class Circle extends Shape implements Drawable {

	@Override
	public void draw() {
		System.out.println("Circle Draw");
		
	}
	
}

public class ShapeTest2 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Circle c = new Circle();
		
		r.draw();
		t.draw();
		c.draw();
	}
}
