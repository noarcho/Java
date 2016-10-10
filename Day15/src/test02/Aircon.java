package test02;

public class Aircon implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("¿¡¾îÄÁÀÌ ÄÑÁü~");
		
	}
	@Override
	public void turnOff() {
		System.out.println("¿¡¾îÄÁÀÌ ²¨Áü~");
	}
}
