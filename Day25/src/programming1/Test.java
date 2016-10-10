package programming1;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JFrame {
	MyPanel p;
	JButton b1, b2;
	public Test(){
		
		b1 = new JButton("카운터시작");
		b2 = new JButton("카운터중지");
		p = new MyPanel();
		p.setLayout(new BoxLayout(p, 1));
		p.add(b1);
		p.add(Box.createVerticalStrut(10));
		p.add(b2);
		add(p, BorderLayout.CENTER);
		
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Test t = new Test();
	}
}

class MyPanel extends JPanel{
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(200, 50, 50, 50);
	}
}
