package test05;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private JButton btn01 = new JButton("button1");
	private JButton btn02 = new JButton("b2");
	private JButton btn03 = new JButton("btn3");
	private JButton btn04 = new JButton("button04");
	private JButton btn05 = new JButton("button00000000005");
	
	public MyFrame() {
		// ��ġ�����ڸ� �������� �ʾ��� �� JFrame�� BorderLayout �⺻
		// JPanel�� FlowLayout �⺻��.
		add(btn01, BorderLayout.NORTH);
		add(btn02, BorderLayout.EAST);
		add(btn03, BorderLayout.WEST);
		add(btn04, BorderLayout.CENTER);
		add(btn05, BorderLayout.SOUTH);
		
		setSize(300, 200);
		setTitle("�׹�° ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
