package test02;

import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	private JTextField tf = new JTextField(10);

	public MyFrame() {
		 setLayout(new FlowLayout());
//		setLayout(null);
//		tf.setBounds(50, 20, 100, 100);
		add(tf);
		
		tf.addKeyListener(new MyKeyListener());


		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

	class MyKeyListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent ev) {
			System.out.println("´­·¶À½:" + ev.getKeyCode() + "/" + ev.getKeyChar() + "/" + ev.isControlDown());
			System.out.println(ev.getKeyText(ev.getKeyCode()));
//			if (ev.getKeyCode() == 38) {//À§
//				tf.setBounds((int)tf.getBounds().getX(), (int)tf.getBounds().getY()-10, 100, 100);
//				
//
//			} else if (ev.getKeyCode() == 40) {//¾Æ·¡
//				tf.setBounds((int)tf.getBounds().getX(), (int)tf.getBounds().getY()+10, 100, 100);
//
//			} else if (ev.getKeyCode() == 37) {//ÁÂ
//				tf.setBounds((int)tf.getBounds().getX()-10, (int)tf.getBounds().getY(), 100, 100);
//
//			} else if (ev.getKeyCode() == 39) {//¿ì
//				tf.setBounds((int)tf.getBounds().getX()+10, (int)tf.getBounds().getY(), 100, 100);
//
//			}
		}

		@Override
		public void keyReleased(KeyEvent ev) {
			// System.out.println("ÇØÁ¦µÊ:"
			// +ev.getKeyCode()+"/"
			// +ev.getKeyChar()+"/"
			// +ev.isControlDown());

		}

		@Override
		public void keyTyped(KeyEvent ev) {
			// System.out.println("ÀÔ·ÂµÊ:"
			// +ev.getKeyCode()+"/"
			// +ev.getKeyChar()+"/"
			// +ev.isControlDown());

		}

	}


}
