package test02;

public class Test {
	public static void main(String[] args) {
		Car c = new Car();
		
		// c.speed = 80; // 접근불가
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		
		System.out.println(c.toString());
		
		// c.color = "REd"; // 실행불가 , 직접 넣지않고 메소드를 설계하여 그 메소드를 통하여 넣음
		c.setColor("YELLOW");
		
		System.out.println(c.toString());
		
		//System.out.println("c 객체의 색상:" + c.color);
		// private가 되어있기 때문에 단독으로 접근해서 사용 할 수 없다. 따라서 getColor 메소드를 만들어 반환해준다
		System.out.println("c 객체의 색상:" + c.getColor());
		System.out.println("c 객체의 모델:" + c.getModel());
		System.out.println("c 객체의 속도:" + c.getSpeed());
		
		
	}
}
