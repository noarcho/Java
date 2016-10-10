package problem;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Server {
	public static void main(String[] args) {
		DatagramSocket receiveSo = null;
		DatagramPacket receivePa = null;

		try {
			receiveSo = new DatagramSocket(1111);
			String receiveString = null;
			byte[] receiveData = new byte[256];

			while (true) {
				System.out.println("��� ��...");
				receivePa = new DatagramPacket(receiveData, receiveData.length);

				receiveSo.receive(receivePa);
				receiveString = new String(receiveData, 0, receivePa.getLength());

				System.out.println("���� �޽��� > " + receiveString);
				if (receiveString.equals("bye")) {
					break;
				}
			}

		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			receiveSo.close();
		}
	}
}
