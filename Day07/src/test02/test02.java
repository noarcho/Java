package test02;

public class test02 {
	public static void main(String[] args) {
		Car myCar = new Car();
		
	
		myCar.speed = 100;
		myCar.model = "¼Ò³ªÅ¸";
		
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		
		String result = myCar.toString();
		
		System.out.println(result);
		
		myCar.speedDown();
		myCar.speedDown();
		
		result = myCar.toString();
		System.out.println(result);
		
	}
}
