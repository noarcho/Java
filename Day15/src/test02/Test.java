package test02;

public class Test {
	public static void main(String[] args) {
		Television tv = new Television();
		tv.turnOn();
//		tv.turnoff();
		
		Aircon aircon = new Aircon();
		aircon.turnOn();
//		aircon.turnoff();
		
		RemoteControl remocon = new Television();
		remocon.turnOn();
		System.out.println(remocon);
		
		remocon = new Aircon();
		remocon.turnOn();
		System.out.println(remocon);
	}
}
