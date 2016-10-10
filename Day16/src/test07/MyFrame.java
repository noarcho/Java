package test07;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyFrame extends JFrame {
	private JButton btn01 = new JButton("button1");
	private JButton btn02 = new JButton("b2");
	private JButton btn03 = new JButton("btn3");
	private JButton btn04 = new JButton("button04");
	private JButton btn05 = new JButton("button00000000005");
	
	private JPanel panel = new JPanel();
	private JPanel panel2 = new JPanel();
	
	public MyFrame() {
		// 배치관리자를 설정하지 않았을 때 JFrame은 BorderLayout 기본
		// JPanel은 FlowLayout 기본임.
		
		//setLayout(new GridLayout(0, 3));
		panel.setLayout(new GridLayout(0, 5));
		
		panel.add(btn01);
		panel.add(btn02);
		panel.add(btn03);
		panel.add(btn04);
		panel.add(btn05);
		
		panel.setBackground(Color.YELLOW);
		panel2.setBackground(Color.RED);
		//panel2.setBackground(Color.RED);
		
		add(panel, BorderLayout.CENTER);	// 패널을 사용시 반드시 프레임에 패널을 추가하는 작업을 해줘야한다.
		add(panel2, BorderLayout.SOUTH);
		//add(panel2);
		
		setSize(300, 200);
		setTitle("네번째 제목");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
