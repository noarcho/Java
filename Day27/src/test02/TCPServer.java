package test02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

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
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// Ŭ���̾�Ʈ�� ������ ���� ������ ���Ŵ��
			Scanner scan = new Scanner(System.in);

			
			while(true){
				String receiveMsg = br.readLine();
				System.out.println("���� : " + receiveMsg);
				
				System.out.print("Ŭ���̾�Ʈ�� ������ �޼��� �Է� >> ");
				String sendMsg = scan.nextLine();
				
				bw.write(sendMsg + "\n");
				bw.flush();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("���� ������ ���������ϴ�.");
			//e.printStackTrace();
		}
	}
}
