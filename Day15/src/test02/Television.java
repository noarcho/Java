package test02;

public class Television implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("TV ÄÑÁü~");
		
	}
	@Override
	public void turnOff() {
		System.out.println("TV ²¨Áü~");
	}
}
