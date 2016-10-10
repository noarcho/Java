package test03;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Speak extends Thread {
	private BufferedWriter bw;
	
	public Speak(Socket socket) {
		try {
			bw = new BufferedWriter(
					new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("BufferedWriter Fail");
			e.printStackTrace();
		}
				
	}	// ���ϴ� ������! ������ ���������� ������� �ʴ´�!!!
	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);
		
		while(true){
			
			try {
				System.out.print("�� : ");
				String sendMsg = scan.nextLine();
				
				bw.write(sendMsg + "\n");
				bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("������ �ȵǰų� ������ �����Ͽ���.");
				e.printStackTrace();
			}
		}
	}
}
