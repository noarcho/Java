package test02;

public class Test {
	public static void main(String[] args) {
		Car c = new Car();
		
		// c.speed = 80; // ���ٺҰ�
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		
		System.out.println(c.toString());
		
		// c.color = "REd"; // ����Ұ� , ���� �����ʰ� �޼ҵ带 �����Ͽ� �� �޼ҵ带 ���Ͽ� ����
		c.setColor("YELLOW");
		
		System.out.println(c.toString());
		
		//System.out.println("c ��ü�� ����:" + c.color);
		// private�� �Ǿ��ֱ� ������ �ܵ����� �����ؼ� ��� �� �� ����. ���� getColor �޼ҵ带 ����� ��ȯ���ش�
		System.out.println("c ��ü�� ����:" + c.getColor());
		System.out.println("c ��ü�� ��:" + c.getModel());
		System.out.println("c ��ü�� �ӵ�:" + c.getSpeed());
		
		
	}
}
