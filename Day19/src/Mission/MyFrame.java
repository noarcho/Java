package Mission;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	private MyPannel p = new MyPannel();
	public MyFrame() {
		
		add(p);
		
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
