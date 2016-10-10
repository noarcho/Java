package programming3;

interface Controllable {
	void play();

	void stop();
}

public class Test3 {
	public static void main(String[] args) {
		Controllable rc = new
				//Controllable()
				VideoPlayer()
		{
			public void play(){
				System.out.println("���� ��� ����");
			}
			public void stop(){
				System.out.println("���� ��� ����");
			}
			
		};
		
		rc.play();
		rc.stop();


	}
}
abstract class VideoPlayer implements Controllable{}