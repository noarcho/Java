package multichatting2;

import java.awt.BorderLayout;
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

public class Client extends JFrame {
	private JPanel inputPanel = new JPanel();
	private JPanel chattingPanel = new JPanel();
	private JTextArea txta = new JTextArea();
	private JTextField txtf = new JTextField();
	private JButton btn = new JButton("전송");

	private BufferedReader br;
	private BufferedWriter bw;

	public Client() {

		setLayout(new BorderLayout());

		SpeakListener listener = new SpeakListener();
		txtf.addActionListener(listener);
		btn.addActionListener(listener);

		inputPanel.setLayout(new BorderLayout());
		inputPanel.add(txtf);
		inputPanel.add(btn, BorderLayout.EAST);
		
		chattingPanel.setLayout(new BorderLayout());
		chattingPanel.add(new JScrollPane(txta));

		add(chattingPanel, BorderLayout.CENTER);
		add(inputPanel, BorderLayout.SOUTH);

		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		////////////////////////////////////////////////////////

		try {
			//Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
			Socket socket = new Socket(InetAddress.getByName("70.12.109.123"), 1234);

			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String nickname = JOptionPane.showInputDialog(this, "이름을 입력하세요.", JOptionPane.INFORMATION_MESSAGE);

			bw.write(nickname + "\n");
			bw.flush();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ListenThread t = new ListenThread();
		t.start();
	}


	class SpeakListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String inputMsg = txtf.getText();
			System.out.println(inputMsg);
			try {
				bw.write(inputMsg + "\n");
				bw.flush();
				txtf.setText("");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

	class ListenThread extends Thread {

		@Override
		public void run() {
			try {
				while (true) {
					String ListenMsg = br.readLine();
					System.out.println("Thread receive msg" + ListenMsg);
					txta.append(ListenMsg + "\n");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Client c = new Client();
	}

}
