package programming3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame extends JFrame {
	JPanel[] p = new JPanel[6];
	JTextField t = new JTextField();
	JButton[] b = new JButton[17];

	public MyFrame() {

		for (int i = 0; i < 6; i++) {
			p[i] = new JPanel();
			p[i].setLayout(new FlowLayout(FlowLayout.LEADING));
			// p[i].setLayout(new BorderLayout());
		}

		for (int i = 0; i < 17; i++) {
			if (i < 10 == true)
				b[i] = new JButton(Integer.toString(i));
			else
				b[i] = new JButton("");
			b[i].setPreferredSize(new Dimension(50, 30));
		}
		t = new JTextField(19);
		t.setText("23");
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

		p[0].add(t);
		b[10].setText("C");

		p[1].add(b[10]);

		for (int i = 7; i <= 9; i++)
			p[2].add(b[i]);
		b[11].setText("/");
		p[2].add(b[11]);

		for (int i = 4; i <= 6; i++)
			p[3].add(b[i]);
		b[12].setText("*");
		p[3].add(b[12]);

		for (int i = 1; i <= 3; i++)
			p[4].add(b[i]);
		b[13].setText("*");
		p[4].add(b[13]);

		p[5].add(b[0]);
		b[14].setText("+/-");
		p[5].add(b[14]);
		b[15].setText("=");
		p[5].add(b[15]);
		b[16].setText("+");
		p[5].add(b[16]);

		for (int i = 0; i < 6; i++)
			add(p[i]);

		setSize(230, 270);
		setResizable(false);
		setTitle("°è»ê±â");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}

public class MyFrameTest {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
