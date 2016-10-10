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
		// ��ġ�����ڸ� �������� �ʾ��� �� JFrame�� BorderLayout �⺻
		// JPanel�� FlowLayout �⺻��.
		
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
		
		add(panel, BorderLayout.CENTER);	// �г��� ���� �ݵ�� �����ӿ� �г��� �߰��ϴ� �۾��� ������Ѵ�.
		add(panel2, BorderLayout.SOUTH);
		//add(panel2);
		
		setSize(300, 200);
		setTitle("�׹�° ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
