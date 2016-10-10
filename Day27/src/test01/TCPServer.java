package test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) {

		try {
			// TCP 통신에서는 서버가 특정포트를 점유하고 먼저 실행되서 기다리고 있음.
			ServerSocket serverSocket = new ServerSocket(5555);
			// 5555번 서버소켓이 이미 사용중일경우 예외처리

			System.out.println("서버 대기중..");
			Socket socket = serverSocket.accept(); // 서버 대기중
			System.out.println("클라이언트 접속함!!");
			//////////////////////////////////////////////////////////////
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// 클라이언트가 보내는 문장 한줄을 수신대기
			
			while(true){
				String receiveMsg = br.readLine();
				System.out.println("받음 : " + receiveMsg);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("상대방 연결이 끊어졌습니다.");
			//e.printStackTrace();
		}
	}
}
