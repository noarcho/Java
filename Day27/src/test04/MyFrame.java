package test04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class MyFrame extends JFrame {
	private JTextArea txta1 = new JTextArea(20,16);
	private JTextField txta2 = new JTextField(16);
	
	JTextArea gettxta1(){
		return txta1;
	}

	public MyFrame() {
		setLayout(new BorderLayout());
		txta1.setEditable(false);
		txta2.setBackground(Color.PINK);
		JScrollPane scrollbar = new JScrollPane(txta1);
		scrollbar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		Container con = this.getContentPane();
		
		txta2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(!txta2.getText().equals(""))
				
				txta1.append(txta2.getText() + "\n");
				txta2.setText("");
			}
		});
		
			
		//add(txta1,BorderLayout.CENTER);
		add(scrollbar,BorderLayout.CENTER);
		add(txta2, BorderLayout.SOUTH);

		setSize(300, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		f.gettxta1().append("testtest" + "\n");;
	}

}
