package test05;

public class Test {
	public static void main(String[] args) {
		Car c = new Car();
		c.speedUp();
		System.out.println(c.toString());
		c.speedUp();
		System.out.println(c.toString());
		c.speedUp(20);
		System.out.println(c.toString());
	}
}
