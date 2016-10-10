package sample1_2;

class MyThread extends Thread {
	String myName;

	public MyThread(String myName) {
		this.myName = myName;
	}

	@Override
	public void run() {
		for (int i = 10; i >= 0; i--)
			System.out.println(myName + i + " ");
	}
}

public class TestThread2 {
	public static void main(String[] args) {
		Thread t1 = new MyThread("A");
		Thread t2 = new MyThread("B");
		t1.start();
		t2.start();
		//System.out.println(" ");
	}
}