package test12;

public class SpeedTooSmallException extends Exception {
	public SpeedTooSmallException(){
		super("음수가 나올리가 없는데...");
	}
}
