package problem1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFrame extends JFrame {
	DrawPanel p;
	public TestFrame() {
		p = new DrawPanel();
		add(p);
		
		setTitle("Draw Face");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		TestFrame t = new TestFrame();
	}
}

class DrawPanel extends JPanel {
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(25, 25, 200, 200);
		
		g.setColor(Color.BLACK);
		g.drawArc(140, 75, 50, 50, 0, 180);
		g.drawArc(60, 75, 50, 50, 0, 180);
		
		g.drawArc(80, 130, 85, 50, 180, 180);
	}
}
