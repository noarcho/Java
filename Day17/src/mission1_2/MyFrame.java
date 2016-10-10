package mission1_2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	private JButton redbtn = new JButton("»¡°­");
	private JButton blubtn = new JButton("ÆÄ¶û");
	private JPanel p = new JPanel();

	public MyFrame() {
		redbtn.addActionListener(new RedListener());
		
		blubtn.addActionListener(new BluListener());

		p.add(redbtn);
		p.add(blubtn);
		
		add(p);
		
		

		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	class RedListener  implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			p.setBackground(Color.RED);
		}
	}
	
	class BluListener  implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			p.setBackground(Color.BLUE);
		}
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
