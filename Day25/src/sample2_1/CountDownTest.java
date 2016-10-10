package sample2_1;

import java.awt.Font;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest extends JFrame {
	private JLabel label;
	
	class MyThread extends Thread{
		@Override
		public void run() {
			for(int i = 10 ; i >= 0; i--){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				label.setText(i + "");
			}
		}
	}
	
	public CountDownTest(){
		setTitle("카운트 다운");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		label = new JLabel("Start");
		label.setFont(new Font("Serif", Font.BOLD, 100));
		add(label);
		
		(new MyThread()).start();
		setVisible(true);
	}

	public static void main(String[] args) {
		CountDownTest t = new CountDownTest();
	}

}
