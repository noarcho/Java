package test01;

public class Car {
	private int speed;
	private String color;
	private String model;
	
	///////////////////////////////////
	//Ŭ���� �ۼ��� �����ڸ� �ƿ� �ۼ� ���ϸ� �Ʒ� ����ִ� �����ڰ�
	//�����Ͻ� �ڵ����� ��, but �����ڸ� �ϳ��� ���� �����ϸ�
	//�ڵ����� ���������� �ʴ´�.
/*	public Car(){

	}*/
	public Car(){
		System.out.println("�Ű����� ���� ������ ȣ���");
		speed = 0;
		color = "WHITE";
		model = "SONATA";
	}
	
	public Car(int s, String c, String m){
		System.out.println("int,String,String ������ ȣ���");
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
		return "�� : " + model + " , ���� : " + color + ", ����ӵ� : " + speed;
	}

}
