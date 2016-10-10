package test03;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPChattingClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 8888);
			//Socket socket = new Socket(InetAddress.getByName("70.12.109.96"), 9999);
			//Socket socket = new Socket(InetAddress.getByName("70.12.109.123"), 9999);
			System.out.println("chatting start");
			
			new Speak(socket).start();
			new Listen(socket).start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
