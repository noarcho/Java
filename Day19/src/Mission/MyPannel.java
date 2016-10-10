package Mission;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPannel extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		g.setColor(Color.YELLOW);
		g.fillOval(30, 30, 200, 200);
		
		g.setColor(Color.BLUE);
		g.drawArc(70, 80, 50, 50, 0, 180);
		g.drawArc(150, 80, 50, 50, 0, 180);
		g.drawArc(80, 140, 100, 50, 180, 180);
	}

}
