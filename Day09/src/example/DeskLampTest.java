package example;

public class DeskLampTest {
	public static void main(String[] args) {
		DeskLamp lamp = new DeskLamp();
		
		lamp.turnOn();
		System.out.println(lamp);
		lamp.turnOff();
		System.out.println(lamp);
	}
}
