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
			
			System.out.println("�����");
			Socket socket1 = socket.accept();
			System.out.println("������!");
			BufferedReader br = new BufferedReader(new InputStreamReader(socket1.getInputStream()));
			
			String brstring = br.readLine();
			
			System.out.println("���� ���� : " + brstring);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
