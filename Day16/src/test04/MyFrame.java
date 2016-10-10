package test04;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JPanel panel = new JPanel();
	private JButton btn = new JButton("버튼");
	private JButton btn2 = new JButton("버튼2");
	private JButton btn3 = new JButton("버튼3");
	private JLabel lb = new JLabel("레이블 입니다.");
	
	public MyFrame() {
		setLayout(new FlowLayout());
		
		panel.setSize(150,150);
		panel.setBackground(Color.YELLOW);
		panel.add(btn);	// panel에 버튼을 붙인다.
		panel.add(btn2);
		panel.add(btn3);
		panel.add(lb);
		
		btn3.setEnabled(false);
		
		this.add(panel); // Frame에 panel을 붙인다.
		
		
		setResizable(false);
		setSize(300, 200);
		setTitle("네번째 제목");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
