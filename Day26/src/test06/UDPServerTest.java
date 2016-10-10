package test06;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class UDPServerTest {
	public static void main(String[] args) {
		DatagramSocket receiveSocket = null;
		DatagramSocket sendSocket = null;
		try {
			sendSocket = new DatagramSocket();
			receiveSocket = new DatagramSocket(1111);
			// 1111번 포트 점유하는 소켓 생성 ※ 이미 사용중인데 또 실행했을 경우 에러가 발생한다!
			byte[] receiveData = new byte[256];
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			// 빈 패킷 생성후 데이터가 도착하면 담기도록 함.
			
			System.out.println("기다리는 중...");
			receiveSocket.receive(receivePacket);
			
			System.out.println("받았다!!");
			System.out.println("클라이언트:" + new String(receiveData));
			System.out.println("클라이언트 주소 : " + receivePacket.getAddress());
			
			Scanner scan = new Scanner(System.in);
			System.out.print("서버답장>>");
			String sendMsg = scan.nextLine();
			byte[] sendData = sendMsg.getBytes();
			// 서버는 이미 패킷을 받은 적이 있는데 거기에 클라이언트의 답장이 적혀있다.
			// 그 주소로 답장을 한다.
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receivePacket.getAddress(), 2222);
			sendSocket.send(sendPacket);
			System.out.println("전송완료");
			
			
			
		} catch (SocketException e) {
			// 해당 포트 사용중일때 예외발생
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(receiveSocket != null)
				// 소켓을 닫음
				receiveSocket.close();
		}
	}
}
