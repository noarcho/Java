package test04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class TCPChattingClient extends JFrame {
	private JTextArea txta1 = new JTextArea(20, 16);
	private JTextField txta2 = new JTextField(16);

	private BufferedReader br;
	private BufferedWriter bw;

	public TCPChattingClient() {
		setLayout(new BorderLayout());
		txta1.setEditable(false);
		txta2.setBackground(Color.PINK);
		JScrollPane scrollbar = new JScrollPane(txta1);
		scrollbar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

		Container con = this.getContentPane();

		txta2.addActionListener(new Mylistener());
		
		// add(txta1,BorderLayout.CENTER);
		add(scrollbar, BorderLayout.CENTER);
		add(txta2, BorderLayout.SOUTH);

		
		setTitle("클라이언트 채팅 프로그램");
		setSize(300, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		//////////////////////////////////////////////////////
		// 네트워크 설정
		try {
			//Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 8888);
			Socket socket = new Socket(InetAddress.getByName("70.12.109.123"), 2222);

			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			while (true) {
				String receiveMsg = br.readLine();
				txta1.append("서버 : " + receiveMsg + "\n");
				txta1.setCaretPosition(txta1.getText().length());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	class Mylistener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String writeMsg = txta2.getText();
			txta1.append("나 : " + writeMsg + "\n");
			txta2.setText("");

			if (bw != null) {
				try {
					bw.write(writeMsg + "\n");
					bw.flush();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			txta1.setCaretPosition(txta1.getText().length());
		}

	}

	public static void main(String[] args) {
		TCPChattingClient f = new TCPChattingClient();
	}

}
