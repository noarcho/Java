package lab1;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame {
	JPanel p1;
	public MyFrame() {
		setSize(300, 200);
		setTitle("My Frame");
		p1 = new JPanel();
		p1.setLayout(new GridLayout(0,4));
		for(int i = 0; i < 10 ; i++)
			p1.add(new JButton("Button" + i));
		add(p1);
		setVisible(true);
	}

}

public class MyFrameTest {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
