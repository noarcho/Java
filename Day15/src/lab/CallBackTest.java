package lab;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class CallBackTest {
	public static void main(String[] args) {
		ActionListener listner = new MyClass();
		Timer t = new Timer(1000, listner);
		t.start();
		for(int i=0; i< 1000 ; i++){
			try {Thread.sleep(1000);}
			catch (InterruptedException e){ }
		}
	}
}

class MyClass implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println("beep");
	}
}