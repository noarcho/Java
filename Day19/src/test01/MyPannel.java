package test01;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPannel extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);	// 비어있는 패널 판 그리기는 지우지 않음.
		
		g.drawLine(10, 10, 50, 50);
		g.drawRect(10, 70, 40, 30);
		g.drawOval(10, 120, 40, 30);
		
		g.setColor(Color.YELLOW);
		g.fillRect(10, 170, 40, 30);
		
		g.setColor(Color.BLUE);
		g.drawArc(100, 50, 80, 50, 60, 150);
	}
}
