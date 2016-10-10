package mission2_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
		setLayout(new BorderLayout());

		cnt.addActionListener(new CntListener());

		rs.addActionListener(new RsListener());

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

	class CntListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			lb.setText(String.valueOf(Integer.parseInt(lb.getText()) + 1));
		}
	}

	class RsListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			lb.setText("0");
		}
	}
}
