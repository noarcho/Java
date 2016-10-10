package programming1;

import java.util.Random;

interface Movable {
	void move(int dx, int dy);
}

class Shape {
	protected int x,y;

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}

class Rectangle extends Shape implements Movable {
	
	public Rectangle(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(int dx, int dy) {
		this.x = dx;
		this.y = dy;
	}
}

class Triangle extends Shape implements Movable {
	
	public Triangle(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(int dx, int dy) {
		this.x = dx;
		this.y = dy;
	}
	
}

class Circle extends Shape implements Movable {
	
		public Circle(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(int dx, int dy) {
		this.x = dx;
		this.y = dy;
	}
	
}

public class ShapeTest1 {
	public static void main(String[] args) {
		Movable[] array = new Movable[3];
		Random random = new Random();
		
		array[0] = new Rectangle(0, 0);
		array[1] = new Triangle(0, 0);
		array[2] = new Circle(0, 0);
		
		array[0].move(random.nextInt(10), random.nextInt(10));
		array[1].move(random.nextInt(10), random.nextInt(10));
		array[2].move(random.nextInt(10), random.nextInt(10));
		
		
		
		
	}
}