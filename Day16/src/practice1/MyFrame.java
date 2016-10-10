package practice1;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	private JPanel panel = new JPanel();
	private JButton left = new JButton("왼쪽 버튼");
	private JButton center = new JButton("중앙 버튼");
	private JButton right = new JButton("우측 버튼");
	
	private JTextField f1 = new JTextField(10);
	
	private JTextArea a1 = new JTextArea("텍스트를 입력해주세요");

	public MyFrame() {
		
		panel.setSize(150,150);
		panel.add(left);
		panel.add(center);
		panel.add(right);
		panel.add(f1);
		panel.add(a1);
		
		right.setEnabled(false);
		
		this.add(panel);
		 // JPanel에 부착 후 패널을 Frame에 붙이는 것.
		
		/*
		add(left);
		add(center);
		add(right);
		*/ // JPanel 말고 Frame에 직접 붙이는 것.
		
		
		setResizable(false);
		setSize(800, 600);
		setTitle("연습 프로그램");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
