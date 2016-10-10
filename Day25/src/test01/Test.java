package test01;

public class Test {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		//t.run(); // run을 실행시키면 안됨!
		t.start();
		
		for(int i = 0; i< 100000; i++){
			System.out.println("main i :" + i++);
		}
	}
}
