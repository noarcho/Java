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
			// 1111�� ��Ʈ �����ϴ� ���� ���� �� �̹� ������ε� �� �������� ��� ������ �߻��Ѵ�!
			byte[] receiveData = new byte[256];
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			// �� ��Ŷ ������ �����Ͱ� �����ϸ� ��⵵�� ��.
			
			System.out.println("��ٸ��� ��...");
			receiveSocket.receive(receivePacket);
			
			System.out.println("�޾Ҵ�!!");
			System.out.println("Ŭ���̾�Ʈ:" + new String(receiveData));
			System.out.println("Ŭ���̾�Ʈ �ּ� : " + receivePacket.getAddress());
			
			Scanner scan = new Scanner(System.in);
			System.out.print("��������>>");
			String sendMsg = scan.nextLine();
			byte[] sendData = sendMsg.getBytes();
			// ������ �̹� ��Ŷ�� ���� ���� �ִµ� �ű⿡ Ŭ���̾�Ʈ�� ������ �����ִ�.
			// �� �ּҷ� ������ �Ѵ�.
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receivePacket.getAddress(), 2222);
			sendSocket.send(sendPacket);
			System.out.println("���ۿϷ�");
			
			
			
		} catch (SocketException e) {
			// �ش� ��Ʈ ������϶� ���ܹ߻�
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(receiveSocket != null)
				// ������ ����
				receiveSocket.close();
		}
	}
}
