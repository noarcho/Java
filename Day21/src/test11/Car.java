package test11;

public class Car {
	private int speed;
	private String color;
	private String model;
/////////////////////////////////////////////////
	public Car() {}
	public Car(int s, String c, String m) {
		speed = s;
		color = c;
		model = m;
	}
/////////////////////////////////////////////////
	public void speedUp() throws Exception{
		speed += 10;
		if(speed>300){
			throw new Exception("과속과속과속과속");
		}
	}
	
	public void speedDown() throws Exception{
		speed -= 10;
		if(speed<0){
			throw new Exception("속도가 음수??????");
		}
	}
}
