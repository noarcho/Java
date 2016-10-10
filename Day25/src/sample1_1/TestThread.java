package sample1_1;

class MyRunnable implements Runnable {
	String myName;

	public MyRunnable(String myName) {
		this.myName = myName;
	}

	@Override
	public void run() {
		for (int i = 10; i >= 0; i--)
			System.out.println(myName + i + " ");
	}
}

public class TestThread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable("A"));
		Thread t2 = new Thread(new MyRunnable("B"));
		t1.start();
		t2.start();
		//System.out.println(" ");
	}
}