package practice1;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	private JPanel panel = new JPanel();
	private JButton left = new JButton("���� ��ư");
	private JButton center = new JButton("�߾� ��ư");
	private JButton right = new JButton("���� ��ư");
	
	private JTextField f1 = new JTextField(10);
	
	private JTextArea a1 = new JTextArea("�ؽ�Ʈ�� �Է����ּ���");

	public MyFrame() {
		
		panel.setSize(150,150);
		panel.add(left);
		panel.add(center);
		panel.add(right);
		panel.add(f1);
		panel.add(a1);
		
		right.setEnabled(false);
		
		this.add(panel);
		 // JPanel�� ���� �� �г��� Frame�� ���̴� ��.
		
		/*
		add(left);
		add(center);
		add(right);
		*/ // JPanel ���� Frame�� ���� ���̴� ��.
		
		
		setResizable(false);
		setSize(800, 600);
		setTitle("���� ���α׷�");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
