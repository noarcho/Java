package test02;

public class MyThread implements Runnable {
	@Override
	public void run() {
		for(int i = 0 ; i < 100000 ; i++){
			System.out.println("Thread i : " + i);
		}
	}
}
