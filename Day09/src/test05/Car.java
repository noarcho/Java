package test05;

public class Car {
	private String color="WHITE";
	private String model="SONATA";
	private int speed=0;
	
	public void speedUp(){
		speed += 10;
	}
	public void speedUp(int s){
		speed += s;
	}
	
	public String toString(){
		return "���� : " + color + ", �� : " + model + ", ����ӵ� : " + speed;
	}
}
