package test09;

public class Test {
	public static void main(String[] args) {
		try {
			countDown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("예외처리를 countDown이 위임(던짐");
			e.printStackTrace();
		}
	}

	public static void countDown() throws InterruptedException {
		for (int i = 10; i > 0; i--) {
			System.out.println("카운트:" + i);
			Thread.sleep(1000);

		}
		System.out.println("발사!!");
	}
}
