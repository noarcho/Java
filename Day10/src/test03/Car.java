package test03;

public class Car {
	private int speed;
	private String color;
	private String model;
	
	private static int numOfCars=0;
	
	public static int getNumOfCars(){
		return numOfCars;
	}
	
	// static : � ��ü�� �Ҽӵ��� �ʰ� �ϳ��� �����ϴ� ����
	
	///////////////////////////////////
	//Ŭ���� �ۼ��� �����ڸ� �ƿ� �ۼ� ���ϸ� �Ʒ� ����ִ� �����ڰ�
	//�����Ͻ� �ڵ����� ��, but �����ڸ� �ϳ��� ���� �����ϸ�
	//�ڵ����� ���������� �ʴ´�.
/*	public Car(){

	}*/
	public Car(){
		this(0,"WHITE","SONATA");
	}
	
	public Car(int s, String c, String m){
		System.out.println("int,String,String ������ ȣ���");
		speed = s;
		color = c;
		model = m;
		numOfCars++;
	}
	
	public void speedUp(int speed){
		this.speed += 10;
	}
	
	public void speedDown(){
		speed -= 10;
	}
	
	public String toString(){
		return "�� : " + model + " , ���� : " + color + ", ����ӵ� : " + speed;
	}

}
