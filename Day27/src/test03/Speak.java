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
				
	}	// 말하는 스레드! 소켓이 연결됬는지는 고려하지 않는다!!!
	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);
		
		while(true){
			
			try {
				System.out.print("나 : ");
				String sendMsg = scan.nextLine();
				
				bw.write(sendMsg + "\n");
				bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("연결이 안되거나 상대방이 퇴장하였음.");
				e.printStackTrace();
			}
		}
	}
}
