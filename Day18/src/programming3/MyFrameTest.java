package programming3;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame extends JFrame {
	JPanel[] p = new JPanel[6];
	JTextField t = new JTextField();
	JButton[] b = new JButton[17];
	int result = 0; // 결과값
	int input = 0; // 입력값2
	boolean sum = false;
	boolean sub = false;
	boolean mlt = false;
	boolean div = false;

	boolean chk1 = false; // 1차 입력값 확인용
	boolean chk2 = false; // 2차 입력값 확인용
	boolean chk3 = false;

	public MyFrame() {

		for (int i = 0; i < 6; i++) {
			p[i] = new JPanel();
			p[i].setLayout(new FlowLayout(FlowLayout.LEADING));
		}

		for (int i = 0; i < 17; i++) {
			if (i < 10 == true)
				b[i] = new JButton(Integer.toString(i));
			else
				b[i] = new JButton("");
			b[i].setPreferredSize(new Dimension(50, 30));
			b[i].addActionListener(new CalcListener());
		}
		t = new JTextField(19);
		t.setText("0");
		t.setEditable(false);
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
		b[13].setText("-");
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
		setTitle("계산기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	class CalcListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String str = new String(e.getActionCommand());
			switch (str) {
			case "0":
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				if (chk1 && (sum | sub | mlt | div)) {
					// input1 = Integer.parseInt(t.getText());
					result = Integer.parseInt(t.getText());
					t.setText(null);
					chk1 = false;
					chk2 = true;
				}
				// if(chk2){
				// t.setText(String.valueOf(result));
				// }

				if (t.getText().equals("0") == true)
					t.setText(e.getActionCommand());
				else
					t.setText(t.getText() + e.getActionCommand());
				break;
			case "C":
				result = 0;
				// input1 = 0;
				input = 0;
				sum = false;
				sub = false;
				mlt = false;
				div = false;

				chk1 = false;
				chk2 = false;
				t.setText("0");
				break;
			case "+/-":

				if (t.getText().equals("0") == false)
					if (t.getText().charAt(0) == '-')
						t.setText(t.getText().substring(1));
					else
						t.setText("-" + t.getText());
				break;
			case "=":
				if (chk2) {
					input = Integer.parseInt(t.getText());
					if (sum) {
						result = result + input;
						t.setText(String.valueOf(result));
					} else if (sub) {
						result = result - input;
						t.setText(String.valueOf(result));
					} else if (mlt) {
						result = result * input;
						t.setText(String.valueOf(result));
					} else if (div) {
						if (input != 0)
							result = result / input;
						t.setText(String.valueOf(result));
					}
				} else
					t.setText(t.getText());
				result = 0;
				// input1 = 0;
				input = 0;
				sum = false;
				sub = false;
				mlt = false;
				div = false;
				
				chk1 = false;
				chk2 = false;
				chk3 = false;
				break;
			case "+":
				chk3 = false;
				if (sub | mlt | div) {
					sub = false;
					mlt = false;
					div = false;
					chk3 = true;
				}
				sum = true;
				chk1 = true;
				if (chk2 && !chk3) {
					input = Integer.parseInt(t.getText());
					if (sum) {
						result = result + input;
						t.setText(String.valueOf(result));
					} else if (sub) {
						result = result - input;
						t.setText(String.valueOf(result));
					} else if (mlt) {
						result = result * input;
						t.setText(String.valueOf(result));
					} else if (div) {
						if (input != 0)
							result = result / input;
						t.setText(String.valueOf(result));
					}
				}
				chk2 = false;
				break;
			case "-":
				chk3 = false;
				if (sum | mlt | div) {
					////
					input = Integer.parseInt(t.getText());
					result = result + input;
					t.setText(String.valueOf(result));
					////
					sum = false;
					mlt = false;
					div = false;
					chk3 = true;
				}
				sub = true;
				chk1 = true;
				if (chk2 && !chk3) {
					input = Integer.parseInt(t.getText());
					if (sum) {
						result = result + input;
						t.setText(String.valueOf(result));
					} else if (sub) {
						result = result - input;
						t.setText(String.valueOf(result));
					} else if (mlt) {
						result = result * input;
						t.setText(String.valueOf(result));
					} else if (div) {
						if (input != 0)
							result = result / input;
						t.setText(String.valueOf(result));
					}
				}
				chk2 = false;
				break;
			case "*":
				chk3 = false;
				if (sum | sub | div) {
					sum = false;
					sub = false;
					div = false;
					chk3 = true;
				}
				mlt = true;
				chk1 = true;
				if (chk2 && !chk3) {
					input = Integer.parseInt(t.getText());
					if (sum) {
						result = result + input;
						t.setText(String.valueOf(result));
					} else if (sub) {
						result = result - input;
						t.setText(String.valueOf(result));
					} else if (mlt) {
						result = result * input;
						t.setText(String.valueOf(result));
					} else if (div) {
						if (input != 0)
							result = result / input;
						t.setText(String.valueOf(result));
					}
				}
				chk2 = false;
				break;
			case "/":
				chk3 = false;
				if (sum | sub | mlt) {
					sum = false;
					sub = false;
					mlt = false;
					chk3 = true;
				}
				div = true;
				chk1 = true;
				if (chk2 && !chk3) {
					input = Integer.parseInt(t.getText());
					if (sum) {
						result = result + input;
						t.setText(String.valueOf(result));
					} else if (sub) {
						result = result - input;
						t.setText(String.valueOf(result));
					} else if (mlt) {
						result = result * input;
						t.setText(String.valueOf(result));
					} else if (div) {
						if (input != 0)
							result = result / input;
						t.setText(String.valueOf(result));
					}
				}
				chk2 = false;
				break;
			}

		}
	}

}

public class MyFrameTest {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
