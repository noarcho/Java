package test01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	private JButton btn = new JButton("��ư�Դϴ�.");
	
	public MyFrame() {
		setLayout(new FlowLayout());
		
	/*	MyListener listener = new MyListener();
		btn.addActionListener(listener);*/
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btn.setText("�������ϴ�!");
			}
		});	// ����Ŭ���� ����
		
		add(btn);
		
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
/*	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
//			System.out.println("��ư��!!");
//			System.out.println("������!!");
			btn.setText("�������ϴ�!");
		}

	}*/

	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
