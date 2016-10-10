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
				System.out.print("Ÿ���� ");
			else if (s instanceof Rectangle)
				System.out.print("���簢���� ");
			else if (s instanceof Triangle)
				System.out.print("�ﰢ���� ");
			System.out.print("���̴� ");
			return s.getArea();
		} else if (s instanceof ThreeDimshape) {
			if (s instanceof Sphere)
				System.out.print("���� ");
			else if (s instanceof Cube)
				System.out.print("������ü�� ");
			else if (s instanceof Cylinder)
				System.out.print("������� ");
			System.out.print("���Ǵ� ");
			return s.getVolume();
		} else{
			System.out.println("error");
			return 0;
		}
	}
}