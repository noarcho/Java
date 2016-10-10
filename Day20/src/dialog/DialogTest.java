package dialog;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DialogTest extends JFrame implements ActionListener {
	JPanel p;
	JButton b1, b2;
	SimpleDialog aDiolog;

	DialogTest() {
		p = new JPanel();
		add(p, "Center");
		b1 = new JButton("대화상자 생성");
		b2 = new JButton("종료");
		b1.addActionListener(this);
		b2.addActionListener(this);
		p.add(b1);
		p.add(b2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			if (aDiolog == null) {
				aDiolog = new SimpleDialog(this, "Simple Dialog");
			}
			aDiolog.setVisible(true);
			b1.requestFocus();
		}
		if (e.getSource() == b2) {
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		DialogTest f = new DialogTest();
		f.setTitle("DialogTest");
		f.setSize(300, 100);
		f.setVisible(true);
	}
}

class SimpleDialog extends JDialog implements ActionListener {
	JPanel p1, p2;
	JLabel l;
	JButton okButton;
	JButton cancelButton;

	SimpleDialog(Frame parent, String str) {
		super(parent, str, true);
		p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		add(p1);
		
		l = new JLabel("간단한 대화 상자입니다.", JLabel.CENTER);
		p1.add(l,"Center");
		p2 = new JPanel();
		p1.add(p2, "South");
		
		okButton = new JButton("Ok");
		okButton.addActionListener(this);
		p2.add(okButton);
		cancelButton = new JButton("cancel");
		cancelButton.addActionListener(this);
		p2.add(cancelButton);
		
		setSize(300, 200);
		
		addWindowListener(new MyWinlistener());

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
		
	}
	
	class MyWinlistener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			dispose();
		}
	}

}