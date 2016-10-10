package test12;


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
	public void speedUp() throws SpeedTooFastException {
		speed += 10;
		if(speed > 300){
			throw new SpeedTooFastException();
		}
	}
	
	public void speedDown() throws SpeedTooSmallException {
		speed -= 10;
		if(speed < 0){
			throw new SpeedTooSmallException();
		}
	}
}
