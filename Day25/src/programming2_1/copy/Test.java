package programming2_1.copy;

import java.util.Date;

public class Test implements Runnable {
	Date date;
	String str;

	public Test(String str) {
		this.str = str;
	}

	@Override
	public void run() {
		while (true) {
			date = new Date();
			System.out.println(date + " " + str);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Thread t = new Thread(new Test("안녕하세요?"));
		t.start();
	}
}
