package programming5;

public class Test {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[6];

		shapes[0] = new Ellipse(0, 0, 6, 4);
		shapes[1] = new Rectangle(0, 0, 3, 4);
		shapes[2] = new Triangle(0, 0, 3, 4);
		shapes[3] = new Sphere(0, 0, 5);
		shapes[4] = new Cube(0, 0, 3);
		shapes[5] = new Cylinder(0, 0, 3, 4);

		for (int i = 0; i < shapes.length; i++) {
			System.out.println(print(shapes[i]));
		}

	}

	public static double print(Shape s) {
		if (s instanceof TwoDimshape) {
			if (s instanceof Ellipse)
				System.out.print("타원의 ");
			else if (s instanceof Rectangle)
				System.out.print("직사각형의 ");
			else if (s instanceof Triangle)
				System.out.print("삼각형의 ");
			System.out.print("넓이는 ");
			return s.getArea();
		} else if (s instanceof ThreeDimshape) {
			if (s instanceof Sphere)
				System.out.print("구의 ");
			else if (s instanceof Cube)
				System.out.print("정육면체의 ");
			else if (s instanceof Cylinder)
				System.out.print("원기둥의 ");
			System.out.print("부피는 ");
			return s.getVolume();
		} else{
			System.out.println("error");
			return 0;
		}
	}
}