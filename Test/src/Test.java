
class Job extends Thread{
	String name;
	public Job(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		byte n = 0;
		while(true){
			System.out.println(name + n++);
		}
	}
}
public class Test {
	public static void main(String[] args) {
		Thread t = new Job("1번 스레드");
		Thread t1 = new Job("2번 스레드");
		t.start();
		t1.start();
	}
	
}
