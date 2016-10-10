package test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Listen extends Thread {
	private BufferedReader br;
	
	public Listen(Socket socket) {
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Buffered Reader Fail");
			e.printStackTrace();
		}
	}
	// 듣는 작업만 반복을 하는 Thread이다!! 소켓이 연결되었는지는 고려하지 않는다!!
	@Override
	public void run() {
		while(true){
			try {
				String receiveMsg = br.readLine();
				System.out.println("상대방:" + receiveMsg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("상대방 퇴장");
				e.printStackTrace();
			}
		}
	}
}
