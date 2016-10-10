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

// 서버는 클라이언트의 수만큼 쓰레드를 리스트에 유지하고
// 클라이언트가 추가 될때마다 소켓을 생성하여 쓰레드에게 전달함.

public class MultiChattingServer {
	private ServerSocket serverSocket;
	private List<ChattingThread> threadList;

	// 서버 생성자
	public MultiChattingServer() {
		threadList = new ArrayList<>();
		try {
			serverSocket = new ServerSocket(9999);
			System.out.println("클라이언트를 기다리는 중..");
			while (true) {
				Socket socket = serverSocket.accept();
				System.out.println("접속함 : " + socket.getInetAddress());
				
				ChattingThread t = new ChattingThread(socket);
				threadList.add(t);
				t.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 서버의 리스트에 있는 모든 쓰레드에게 메세지 발송 명령해서
	// 모든 클라이언트에게 메세지 방송하기 메소드

	public void broadcast(String msg) {
		for (ChattingThread t : threadList) {
			t.speak(msg);
		}
	}
	
	public void removeThread(ChattingThread t){
		threadList.remove(t);
	}
	

	// 하나의 클라이언트가 접속했을 때 담당 쓰레드 클래스
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
				broadcast("[" + nickname + "]님이 입장하셨습니다.");

				while (true) {
					String msg;
					msg = br.readLine();
					broadcast(nickname + ":" + msg);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				removeThread(this);
				broadcast("[" + nickname + "]님이 퇴장하셨습니다.");
				e.printStackTrace();
			}
		}
		// 현재 쓰레드가 담당하는 클라이언트에게 메세지 보내기
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
