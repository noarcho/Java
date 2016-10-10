package test02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 5555); // 내 컴퓨터
			//Socket socket = new Socket(InetAddress.getByName("70.12.109.96"), 5555); // 옆자리 컴퓨터
			//Socket socket = new Socket(InetAddress.getByName("70.12.109.123"), 5555); // 쌤 컴퓨터
			////////////////////////////////////////////////////////////////////////////
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			Scanner scan = new Scanner(System.in);
			
			while(true){
			System.out.print("서버에 전달할 메세지 입력 >> ");
			String sendMsg = scan.nextLine();
			
			bw.write(sendMsg + "\n");
			bw.flush();
			
			String receiveMsg = br.readLine();
			System.out.println("받음 : " + receiveMsg);
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("상대방 연결이 끊어졌습니다.");
			//e.printStackTrace();
		}
	}
}
