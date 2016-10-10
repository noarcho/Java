package programming4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JFrame {
	MyPanel p;

	public Test() {

		p = new MyPanel();
		p.setLayout(new BoxLayout(p, 1));
		add(p);

		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("");
		setVisible(true);
	}

	public static void main(String[] args) {
		Test t = new Test();
	}
}

class MyPanel extends JPanel {
	int x = 20, y = 50;
	int width = 100, height = 100;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.ORANGE);
		g.fillRect(x, y, width, height);
		if(width <= 0){
			width += 10;
		}
		if(width >= 200){
			width -= 10;
		}
	}

	public MyPanel() {
		this.requestFocus();
		setFocusable(true);
		class MyThread extends Thread{
			public void run(){
				while(true){
					repaint();
					try { Thread.sleep(50); }
					catch (InterruptedException e) {}
				}
			}
		}
	}
}
