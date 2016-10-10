package lab;

public class BoxTest {
	public static void main(String[] args) {
		Box box1 = new Box();
		
		box1.setWidth(100);
		box1.setLength(100);
		box1.setHeight(100);
		
		System.out.println(box1.getVolume());
		// 1000000 반환
		Box box2 = new Box();
		
		box2.setWidth(200);
		box2.setLength(200);
		box2.setHeight(200);
		
		box1 = box2;
		// box1이 가르키고 있는 주소값이 box2가 가르키는 주소값으로 바뀌었다.
		box1.print();
		}
}
