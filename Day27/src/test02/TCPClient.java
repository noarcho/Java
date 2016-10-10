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
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 5555); // �� ��ǻ��
			//Socket socket = new Socket(InetAddress.getByName("70.12.109.96"), 5555); // ���ڸ� ��ǻ��
			//Socket socket = new Socket(InetAddress.getByName("70.12.109.123"), 5555); // �� ��ǻ��
			////////////////////////////////////////////////////////////////////////////
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			Scanner scan = new Scanner(System.in);
			
			while(true){
			System.out.print("������ ������ �޼��� �Է� >> ");
			String sendMsg = scan.nextLine();
			
			bw.write(sendMsg + "\n");
			bw.flush();
			
			String receiveMsg = br.readLine();
			System.out.println("���� : " + receiveMsg);
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("���� ������ ���������ϴ�.");
			//e.printStackTrace();
		}
	}
}
