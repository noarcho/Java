package test04;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JPanel panel = new JPanel();
	private JButton btn = new JButton("��ư");
	private JButton btn2 = new JButton("��ư2");
	private JButton btn3 = new JButton("��ư3");
	private JLabel lb = new JLabel("���̺� �Դϴ�.");
	
	public MyFrame() {
		setLayout(new FlowLayout());
		
		panel.setSize(150,150);
		panel.setBackground(Color.YELLOW);
		panel.add(btn);	// panel�� ��ư�� ���δ�.
		panel.add(btn2);
		panel.add(btn3);
		panel.add(lb);
		
		btn3.setEnabled(false);
		
		this.add(panel); // Frame�� panel�� ���δ�.
		
		
		setResizable(false);
		setSize(300, 200);
		setTitle("�׹�° ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
