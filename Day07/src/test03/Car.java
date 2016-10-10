package test03;

public class Car {
	int speed;
	String model;
	
	void speedUp(){
		speed += 10;
	}
	void speedDown(){
		speed -= 10;
	}
	
	public String toString(){
		return "¼Óµµ:"+speed+", ¸ðµ¨:"+model;
	}
}
