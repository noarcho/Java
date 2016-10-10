package test06;

public class MyThread extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				System.out.println(i);
			}
		} catch (InterruptedException e) {
			System.out.println("9까지 세야하는데..방해받음...");
		}
	};
}
