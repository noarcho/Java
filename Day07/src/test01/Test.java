package test01;

public class Test {
	public static void main(String[] args) {
		Car c;
		c = new Car();
		
		c.speed = 100;
		c.mileage = 100000;
		c.model = "¼Ò³ªÅ¸";
		c.echo = true;
		
		 c.printCarStatus();
		
		Car c2 = new Car();
		
		c2.speed = 200;
		c2.mileage = 0;
		c2.echo = false;
		c2.model = "¸ð´×";
		
		c2.printCarStatus();
	}
}
