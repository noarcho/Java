package test03;

public class Test03 {
	public static void main(String[] args) {
			Car c1 = new Car();
			Car c2;
			
			c2 = c1;
			
			c1.speed = 100;
			c1.model = "아우디";
			System.out.println(c2.toString());
			
			//주소값이 같기때문에 둘다 확인 가능
			
			c1 = null;
			c2 = null;
			
			// 만약  개체를 참조하고 있는 변수가 없어질 경우에는 garbage collector가 객체를 지워준다.
	}
}
