package programming2;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame extends JFrame {
	JPanel[] p = new JPanel[4];
	JLabel[] lb = new JLabel[2];
	JTextField[] t = new JTextField[3];
	JButton b = new JButton("��ȯ");
	
	

	public MyFrame() {

		for (int i = 0; i < 4; i++)
			p[i] = new JPanel();
		for (int i = 0; i < 2; i++)
			lb[i] = new JLabel();
		t[0] = new JTextField(3);
		t[0].setText("1000");
		t[1] = new JTextField(3);
		t[1].setText("7.5");
		t[2] = new JTextField(15);
		t[2].setText("���ڴ� �� 75���� �Դϴ�.");
		lb[0].setText("������ �Է��Ͻÿ�");
		lb[1].setText("������ �Է��Ͻÿ�");
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		p[0].add(lb[0]);
		p[0].add(t[0]);
		p[1].add(lb[1]);
		p[1].add(t[1]);
		p[2].add(b);
		p[3].add(t[2]);

		for (int i = 0; i < 4; i++)
			add(p[i]);

		setSize(300, 200);
		setTitle("���� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}

public class MyFrameTest {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
