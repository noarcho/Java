package programming3;

class Point {
	private double x,y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}

class Shape {
	private double size;
	private Point center;
	
	public Shape(double size, Point center) {
		super();
		this.size = size;
		this.center = center;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
}

class Triangle extends Shape {
	private Point p1, p2, p3;
	private double area, girth = 0;

	public Triangle(Point p1, Point p2, Point p3) {
		super(0, null);
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		
		Point temp = new Point((p1.getX() + p2.getX() + p3.getX())/3.0, (p1.getY() + p2.getY() + p3.getY())/3.0);
		this.setCenter(temp);
		
		this.setSize(0.5 * Math.abs((p1.getX()-p2.getX())*p3.getY()
				                     + (p2.getX()-p3.getX())*p1.getY()
				                     + (p3.getX()-p1.getX())*p2.getY()));
		
		this.area = this.getSize();
		this.girth += Math.sqrt(Math.pow((p1.getX()-p2.getX()), 2) + Math.pow((p1.getY()-p2.getY()), 2));
		this.girth += Math.sqrt(Math.pow((p2.getX()-p3.getX()), 2) + Math.pow((p2.getY()-p3.getY()), 2));
		this.girth += Math.sqrt(Math.pow((p3.getX()-p1.getX()), 2) + Math.pow((p3.getY()-p1.getY()), 2));
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP3() {
		return p3;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
	}

	public double getArea() {
		return area;
	}

	public double getGirth() {
		return girth;
	}
	
	
}

public class programming3 {
	public static void main(String[] args) {
		Point p1 = new Point(0.0,0.0);
		Point p2 = new Point(4.0,0.0);
		Point p3 = new Point(4.0,3.0);
		Triangle t1 = new Triangle(p1, p2, p3);
		
		System.out.println(t1.getArea());
		System.out.println(t1.getGirth());
	}
}


