package test03;

public class Test03 {
	public static void main(String[] args) {
			Car c1 = new Car();
			Car c2;
			
			c2 = c1;
			
			c1.speed = 100;
			c1.model = "�ƿ��";
			System.out.println(c2.toString());
			
			//�ּҰ��� ���⶧���� �Ѵ� Ȯ�� ����
			
			c1 = null;
			c2 = null;
			
			// ����  ��ü�� �����ϰ� �ִ� ������ ������ ��쿡�� garbage collector�� ��ü�� �����ش�.
	}
}
