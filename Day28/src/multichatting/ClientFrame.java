package multichatting;

import java.awt.BorderLayout;
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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientFrame extends JFrame {
	// GUI 멤버
	private JPanel panelArea;
	private JPanel panelInput;
	private JTextArea chatArea;
	private JTextField chatField;
	private JButton btnSend;

	// TCP 통신 멤버
	private BufferedReader br;
	private BufferedWriter bw;

	public ClientFrame() {

		panelArea = new JPanel();
		panelInput = new JPanel();
		chatArea = new JTextArea();
		chatField = new JTextField();
		btnSend = new JButton("전송");

		ChattingListener listener = new ChattingListener();
		chatField.addActionListener(listener);
		btnSend.addActionListener(listener);

		panelArea.setLayout(new BorderLayout());
		panelArea.add(new JScrollPane(chatArea));

		panelInput.setLayout(new BorderLayout());
		panelInput.add(chatField);
		panelInput.add(btnSend, BorderLayout.EAST);

		add(panelArea, BorderLayout.CENTER);
		add(panelInput, BorderLayout.SOUTH);

		setTitle("다중 채팅 클라이언트 프레임");
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		////////////////////////////////////////////////////////////////////////
		// 네트워크 셋팅

		try {
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 1234);
			//Socket socket = new Socket(InetAddress.getByName("70.12.109.123"), 1234);

			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String nickname = JOptionPane.showInputDialog(this, "이름을 입력하세요.", JOptionPane.INFORMATION_MESSAGE);
			
			//
			System.out.println(nickname);
			//
			bw.write(nickname + "\n");
			bw.flush();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			chatArea.append("서버에 접속할 수 없습니다.");
			e.printStackTrace();
		} 
		
		ListenThread t = new ListenThread();
		t.start();
	}

	// 이벤트 처리 클래스(채팅 내용 서버에게 보내는 내부 클래스!)

	class ChattingListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String msg = chatField.getText();
			//
			System.out.println("Chat listener : " + msg);
			//

			try {
				bw.write(msg + "\n");
				bw.flush();
				chatField.setText("");
			} catch (IOException e1) {
				e1.printStackTrace();
				chatArea.append("메시지를 보낼 수 없습니다." + "\n");
			}

		}

	}

	// 서버로부터 메시지를 받는 내부 쓰레드 클래스
	class ListenThread extends Thread {
		@Override
		public void run() {

			try {
				while (true) {
					String receiveMsg = br.readLine();
					//
					System.out.println("Thread receive msg : " + receiveMsg);
					//
					chatArea.append(receiveMsg + "\n");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ClientFrame f = new ClientFrame();
	}
}
