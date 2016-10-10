package test01;

public class Car {
	private int speed;
	private String color;
	private String model;
	
	///////////////////////////////////
	//클래스 작성시 생성자를 아예 작성 안하면 아래 비어있는 생성자가
	//컴파일시 자동으로 들어감, but 생성자를 하나라도 직접 생성하면
	//자동으로 생성해주지 않는다.
/*	public Car(){

	}*/
	public Car(){
		System.out.println("매개변수 없는 생성자 호출됨");
		speed = 0;
		color = "WHITE";
		model = "SONATA";
	}
	
	public Car(int s, String c, String m){
		System.out.println("int,String,String 생성자 호출됨");
		speed = s;
		color = c;
		model = m;
	}
	
	public void speedUp(int speed){
		this.speed += 10;
	}
	
	public void speedDown(){
		speed -= 10;
	}
	
	public String toString(){
		return "모델 : " + model + " , 색상 : " + color + ", 현재속도 : " + speed;
	}

}
