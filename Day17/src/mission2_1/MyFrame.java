package mission2_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MyFrame extends JFrame {
	private JButton cnt = new JButton("Count");
	private JButton rs = new JButton("Reset");
	private JPanel p = new JPanel();
	private JPanel p1 = new JPanel();
	private JLabel lb = new JLabel("0");
	
	
	public MyFrame() {
		lb.setFont(new Font("±¼¸²", Font.BOLD, 100));
		setLayout(new BorderLayout());

		//p.setLayout(new GridLayout());
		
		cnt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lb.setText(String.valueOf(Integer.parseInt(lb.getText()) + 1));
			}
		});
		
		rs.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lb.setText("0");
			}
		});
		
		p.add(cnt);
		p.add(rs);
		
		p1.add(lb);
				
		add(p, BorderLayout.SOUTH);
		add(p1, BorderLayout.CENTER);
		
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
