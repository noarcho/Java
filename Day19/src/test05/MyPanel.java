package test05;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private int x = 10, y = 10, size = 50;

	public MyPanel() {
		addKeyListener(new MyPanelKeyListener());
		addMouseMotionListener(new MyPanelMouseListener());

		requestFocus();
		setFocusable(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(new Color(100, 150, 250));
		g.fillRect(x, y, size, size);
	}

	class MyPanelKeyListener implements KeyListener {
		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				y -= 2;
				break;
			case KeyEvent.VK_DOWN:
				y += 2;
				break;
			case KeyEvent.VK_LEFT:
				x -= 2;
				break;
			case KeyEvent.VK_RIGHT:
				x += 2;
				break;
			}

			switch (e.getKeyChar()) {
			case 'b':
				size += 10;
				break;
			case 's':
				size -= 10;
				break;
			}

			repaint();
		}

		@Override
		public void keyReleased(KeyEvent e) {
		}

		@Override
		public void keyTyped(KeyEvent e) {
		}
	}

	class MyPanelMouseListener implements MouseListener, MouseMotionListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			int mouseX = e.getX();
			int mouseY = e.getY();

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub
			x = (int) getMousePosition().getX() - size / 2;
			y = (int) getMousePosition().getY() - size / 2;

			repaint();

		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub

			/*
			 * x = (int)getMousePosition().getX()-size/2; y =
			 * (int)getMousePosition().getY()-size/2;
			 * 
			 * repaint();
			 */
		}

	}

}
