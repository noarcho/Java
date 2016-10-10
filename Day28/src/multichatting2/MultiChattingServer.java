package multichatting2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

// ������ Ŭ���̾�Ʈ�� ����ŭ �����带 ����Ʈ�� �����ϰ�
// Ŭ���̾�Ʈ�� �߰� �ɶ����� ������ �����Ͽ� �����忡�� ������.

public class MultiChattingServer {
	private ServerSocket serverSocket;
	private List<ChattingThread> threadList;

	// ���� ������
	public MultiChattingServer() {
		threadList = new ArrayList<>();
		try {
			serverSocket = new ServerSocket(9999);
			System.out.println("Ŭ���̾�Ʈ�� ��ٸ��� ��..");
			while (true) {
				Socket socket = serverSocket.accept();
				System.out.println("������ : " + socket.getInetAddress());
				
				ChattingThread t = new ChattingThread(socket);
				threadList.add(t);
				t.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// ������ ����Ʈ�� �ִ� ��� �����忡�� �޼��� �߼� ����ؼ�
	// ��� Ŭ���̾�Ʈ���� �޼��� ����ϱ� �޼ҵ�

	public void broadcast(String msg) {
		for (ChattingThread t : threadList) {
			t.speak(msg);
		}
	}
	
	public void removeThread(ChattingThread t){
		threadList.remove(t);
	}
	

	// �ϳ��� Ŭ���̾�Ʈ�� �������� �� ��� ������ Ŭ����
	class ChattingThread extends Thread {
		private String nickname;
		private BufferedReader br;
		private BufferedWriter bw;

		public ChattingThread(Socket socket) {
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				nickname = br.readLine();
				//
				System.out.println(nickname);
				//
				broadcast("[" + nickname + "]���� �����ϼ̽��ϴ�.");

				while (true) {
					String msg;
					msg = br.readLine();
					broadcast(nickname + ":" + msg);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				removeThread(this);
				broadcast("[" + nickname + "]���� �����ϼ̽��ϴ�.");
				e.printStackTrace();
			}
		}
		// ���� �����尡 ����ϴ� Ŭ���̾�Ʈ���� �޼��� ������
		public void speak(String msg) {
			try {
				bw.write(msg + "\n");
				//
				System.out.println(msg);
				//
				bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MultiChattingServer server = new MultiChattingServer();
	}
}
