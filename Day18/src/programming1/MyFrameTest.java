package programming1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame extends JFrame {
	JPanel[] p = new JPanel[3];
	JLabel lb = new JLabel("�Ÿ��� ���� ������ �Է��Ͻÿ�");
	JTextField[] t = new JTextField[2];
	JButton b = new JButton("��ȯ");
	
	

	public MyFrame() {

		for (int i = 0; i < 3; i++)
			p[i] = new JPanel();
		t[0] = new JTextField(3);
		t[0].setText("1");
		t[1] = new JTextField(15);
		t[1].setText("1 ������ 1.6 ų�ι����Դϴ�.");
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				t[1].setText(t[0].getText() + " ������ "+ (Integer.parseInt(t[0].getText()) * 16)/10.0 + " ų�ι����Դϴ�.");
				
			}
		});
		
		p[0].add(lb);
		p[0].add(t[0]);
		p[1].add(b);
		p[2].add(t[1]);

		for (int i = 0; i < 3; i++)
			add(p[i]);

		setSize(300, 150);
		setTitle("������ ų�ι��ͷ� ��ȯ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}

public class MyFrameTest {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
