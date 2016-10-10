package test02;

public class Car {
	private int speed = 0;
	private String color = "WHITE";
	private String model = "SONATA";

	//////////////////////////////////////////////////////////////////
	public void speedUp() {
		if (speed < 300)
			speed += 10;
	}

	public void speedDown() {
		if (speed >= 10)
			speed -= 10;
	}

	public String toString() {
		return "���� : " + color + ", �� : " + model + ", ����ӵ� : " + speed;
	}

	/////////////////////////////////////////////////////////////////
	public void setColor(String c) {
		color = c;
	} // ������, setter

	public String getColor() {
		return color;
	}

	public void setModel(String c) {
		model = c;
	} // ������, setter

	public String getModel() {
		return model;
	}

	public void setSpeed(int c) {
		speed = c;
	} // ������, setter

	public int getSpeed() {
		return speed;
	}
}
