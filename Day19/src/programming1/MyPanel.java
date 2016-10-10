package programming1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.StyleConstants.FontConstants;

public class MyPanel extends JPanel {
	Font f1, f2, f3, f4, f5;
	
	public MyPanel() {
		f1 = new Font("Serif", Font.PLAIN, 20);
		f2 = new Font("Serif", Font.PLAIN, 20);
		f3 = new Font("Serif", Font.PLAIN, 20);
		f4 = new Font("Serif", Font.PLAIN, 20);
		f5 = new Font("Serif", Font.PLAIN, 20);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setFont(f1);
		g.setColor(new Color((int)( Math.random() * (256)), (int)( Math.random() * (256)), (int)( Math.random() * (256))));
		g.drawString("Hello World!", 10, 50);
		g.setFont(f2);
		g.setColor(new Color((int)( Math.random() * (256)), (int)( Math.random() * (256)), (int)( Math.random() * (256))));
		g.drawString("Hello World!", 10, 70);
		g.setFont(f3);
		g.setColor(new Color((int)( Math.random() * (256)), (int)( Math.random() * (256)), (int)( Math.random() * (256))));
		g.drawString("Hello World!", 10, 90);
		g.setFont(f4);
		g.setColor(new Color((int)( Math.random() * (256)), (int)( Math.random() * (256)), (int)( Math.random() * (256))));
		g.drawString("Hello World!", 10, 110);
		g.setFont(f5);
		g.setColor(new Color((int)( Math.random() * (256)), (int)( Math.random() * (256)), (int)( Math.random() * (256))));
		g.drawString("Hello World!", 10, 130);
	}
}
