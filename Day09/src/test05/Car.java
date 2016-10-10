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
		return "색상 : " + color + ", 모델 : " + model + ", 현재속도 : " + speed;
	}
}
