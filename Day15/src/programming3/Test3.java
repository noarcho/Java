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
				System.out.println("비디오 재생 시작");
			}
			public void stop(){
				System.out.println("비디오 재생 중지");
			}
			
		};
		
		rc.play();
		rc.stop();


	}
}
abstract class VideoPlayer implements Controllable{}