package test09;

public class Test {
	public static void main(String[] args) {
		try {
			countDown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("����ó���� countDown�� ����(����");
			e.printStackTrace();
		}
	}

	public static void countDown() throws InterruptedException {
		for (int i = 10; i > 0; i--) {
			System.out.println("ī��Ʈ:" + i);
			Thread.sleep(1000);

		}
		System.out.println("�߻�!!");
	}
}
