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
	// GUI ���
	private JPanel panelArea;
	private JPanel panelInput;
	private JTextArea chatArea;
	private JTextField chatField;
	private JButton btnSend;

	// TCP ��� ���
	private BufferedReader br;
	private BufferedWriter bw;

	public ClientFrame() {

		panelArea = new JPanel();
		panelInput = new JPanel();
		chatArea = new JTextArea();
		chatField = new JTextField();
		btnSend = new JButton("����");

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

		setTitle("���� ä�� Ŭ���̾�Ʈ ������");
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		////////////////////////////////////////////////////////////////////////
		// ��Ʈ��ũ ����

		try {
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 1234);
			//Socket socket = new Socket(InetAddress.getByName("70.12.109.123"), 1234);

			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String nickname = JOptionPane.showInputDialog(this, "�̸��� �Է��ϼ���.", JOptionPane.INFORMATION_MESSAGE);
			
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
			chatArea.append("������ ������ �� �����ϴ�.");
			e.printStackTrace();
		} 
		
		ListenThread t = new ListenThread();
		t.start();
	}

	// �̺�Ʈ ó�� Ŭ����(ä�� ���� �������� ������ ���� Ŭ����!)

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
				chatArea.append("�޽����� ���� �� �����ϴ�." + "\n");
			}

		}

	}

	// �����κ��� �޽����� �޴� ���� ������ Ŭ����
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
