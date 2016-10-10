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
	JLabel lb = new JLabel("거리를 마일 단위로 입력하시오");
	JTextField[] t = new JTextField[2];
	JButton b = new JButton("변환");
	
	

	public MyFrame() {

		for (int i = 0; i < 3; i++)
			p[i] = new JPanel();
		t[0] = new JTextField(3);
		t[0].setText("1");
		t[1] = new JTextField(15);
		t[1].setText("1 마일은 1.6 킬로미터입니다.");
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				t[1].setText(t[0].getText() + " 마일은 "+ (Integer.parseInt(t[0].getText()) * 16)/10.0 + " 킬로미터입니다.");
				
			}
		});
		
		p[0].add(lb);
		p[0].add(t[0]);
		p[1].add(b);
		p[2].add(t[1]);

		for (int i = 0; i < 3; i++)
			add(p[i]);

		setSize(300, 150);
		setTitle("마일을 킬로미터로 변환");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}

public class MyFrameTest {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
