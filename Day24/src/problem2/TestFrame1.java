package problem2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class TestFrame1 extends JFrame{
	JPanel p, p2;
	JLabel number, check;
	JButton cnt, reset;
	
	BtnActionlistener BA = new BtnActionlistener();
	
	public TestFrame1() {
		p = new JPanel();
		p2 = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		p2.setLayout(new GridLayout());
		
		number = new JLabel("0");
		number.setFont(new Font("돋움", Font.BOLD, 180));
		check = new JLabel("짝수입니다.");
		check.setFont(new Font("돋움", Font.PLAIN, 15));
		
		cnt = new JButton("count");
		cnt.addActionListener(BA);
		reset = new JButton("reset");
		reset.addActionListener(BA);
		
		number.setAlignmentX(Component.CENTER_ALIGNMENT);
		check.setAlignmentX(Component.CENTER_ALIGNMENT);
		p.add(number, BorderLayout.CENTER);
		p.add(check, BorderLayout.SOUTH);
		
		p2.add(cnt);
		p2.add(reset);
		
		add(p, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		
		setTitle("카운트 그래픽 프로그램");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	class BtnActionlistener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == cnt)
				number.setText(String.valueOf(Integer.parseInt(number.getText()) + 1));
			else if(e.getSource() == reset)
				number.setText("0");
			if(Integer.parseInt(number.getText()) % 2 == 0)
				check.setText("짝수입니다.");
			else
				check.setText("홀수입니다.");
		}
	}
	
	public static void main(String[] args) {
		TestFrame1 t = new TestFrame1();
	}
}
