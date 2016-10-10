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
	// ��� �۾��� �ݺ��� �ϴ� Thread�̴�!! ������ ����Ǿ������� ������� �ʴ´�!!
	@Override
	public void run() {
		while(true){
			try {
				String receiveMsg = br.readLine();
				System.out.println("����:" + receiveMsg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("���� ����");
				e.printStackTrace();
			}
		}
	}
}
