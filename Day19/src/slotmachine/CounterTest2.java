package slotmachine;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyCounter extends JFrame implements ActionListener{
	private JLabel[] labels;
	private JButton button;
	private int[] numbers;
	
	public MyCounter() {
		setSize(500, 300);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		labels = new JLabel[3];
		numbers = new int[3];
		
		for(int i = 0 ; i < 3 ; i++){
			labels[i] = new JLabel("" + numbers[i]);
			labels[i].setFont(new Font("serif", Font.BOLD | Font.ITALIC, 100));
			labels[i].setSize(100, 100);
			labels[i].setLocation(100 + 100 * i, 20);
			panel.add(labels[i]);
		}
		
		button = new JButton("����");
		button.setSize(250, 50);
		button.setLocation(100, 150);
		panel.add(button);
		button.addActionListener(this);
		
		add(panel);
		setTitle("My Game");
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		for(int i = 0 ; i < 3  ; i++){
			numbers[i] = (int) (Math.random() * 10);
			labels[i].setText("" + numbers[i]);
		}
		if(numbers[0] == numbers[1])
			if(numbers[1] == numbers[2])
				System.out.println("����");
		
	}
}

public class CounterTest2 {
	public static void main(String[] args) {
		new MyCounter();
	}
}

