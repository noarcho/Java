package test04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class TCPChattingServer extends JFrame {
	private JTextArea txta1 = new JTextArea(20, 16);
	private JTextField txta2 = new JTextField(16);
	
	private BufferedReader br;
	private BufferedWriter bw;
	private String inputtext;

	public TCPChattingServer() {
		setLayout(new BorderLayout());
		txta1.setEditable(false);
		txta2.setBackground(Color.PINK);
		JScrollPane scrollbar = new JScrollPane(txta1);
		scrollbar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

		Container con = this.getContentPane();


		// add(txta1,BorderLayout.CENTER);
		txta2.addActionListener(new MyListener());
		
		add(scrollbar, BorderLayout.CENTER);
		add(txta2, BorderLayout.SOUTH);

		setTitle("���� ä�� ���α׷�");
		setSize(300, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		////////////////////////////////////////////////////////////////
		//��Ʈ��ũ ���� �ʱ�ȭ�۾�
		try {
			ServerSocket serverSocket = new ServerSocket(8888);
			txta1.setText("���� ��ٸ����� ...");
			Socket socket = serverSocket.accept();
			txta1.append("Ŭ���̾�Ʈ ������!" + socket.getInetAddress()+"\n");
			
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true){
				String receiveMsg = br.readLine();
				txta1.append("Ŭ���̾�Ʈ : " + receiveMsg + "\n");
				txta1.setCaretPosition(txta1.getText().length());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String writeMsg = txta2.getText();
			txta1.append("�� : " + writeMsg + "\n");
			txta2.setText("");
			
			if(bw!= null){
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
		TCPChattingServer f = new TCPChattingServer();
	}

}
