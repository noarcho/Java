package test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) {

		try {
			// TCP ��ſ����� ������ Ư����Ʈ�� �����ϰ� ���� ����Ǽ� ��ٸ��� ����.
			ServerSocket serverSocket = new ServerSocket(5555);
			// 5555�� ���������� �̹� ������ϰ�� ����ó��

			System.out.println("���� �����..");
			Socket socket = serverSocket.accept(); // ���� �����
			System.out.println("Ŭ���̾�Ʈ ������!!");
			//////////////////////////////////////////////////////////////
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// Ŭ���̾�Ʈ�� ������ ���� ������ ���Ŵ��
			
			while(true){
				String receiveMsg = br.readLine();
				System.out.println("���� : " + receiveMsg);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("���� ������ ���������ϴ�.");
			//e.printStackTrace();
		}
	}
}
