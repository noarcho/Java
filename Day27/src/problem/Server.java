package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;


public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket socket = new ServerSocket(5555);
			
			System.out.println("대기중");
			Socket socket1 = socket.accept();
			System.out.println("접속함!");
			BufferedReader br = new BufferedReader(new InputStreamReader(socket1.getInputStream()));
			
			String brstring = br.readLine();
			
			System.out.println("받은 내용 : " + brstring);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
