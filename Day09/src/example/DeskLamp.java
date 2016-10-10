package example;

import org.omg.Messaging.SyncScopeHelper;

public class DeskLamp {
	private boolean isOn = false;
	
	public void turnOn(){
		isOn = true;
	}
	
	public void turnOff(){
		isOn = false;
	}
	
	public String toString(){
		return "ÇöÀç »óÅÂ´Â " + (isOn == true ? "ÄÑÁü" : "²¨Áü") + "ÀÔ´Ï´Ù.";
	}

}
