package test08;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private JButton btn01 = new JButton("button1");
	private JButton btn02 = new JButton("b2");
	private JButton btn03 = new JButton("btn3");
	
	public MyFrame() {
		setLayout(null); // 절대 배치
		
		add(btn01);
		add(btn02);
		add(btn03);
		
		btn01.setBounds(0, 0, 100, 50);
		btn02.setBounds(0, 200, 100, 100);
		btn03.setBounds(0, 0, 50, 100);

		setSize(300, 200);
		setTitle("네번째 제목");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
