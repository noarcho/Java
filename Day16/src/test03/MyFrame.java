package test03;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private JButton btn = new JButton("��ư�Դϴ�.");
	
	public MyFrame() {
		setLayout(new FlowLayout());	// FlowLayout : ������ ��ġ���Ѷ�
		
		add(btn);
		
		setSize(300, 200);
		setTitle("����° ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);	// �ʿ��� ���� ���س���
							// �������� �����ֱ� ����
		                    // setVisible�� ���� ����������
	}
}
