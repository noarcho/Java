package problem;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		DatagramSocket sendSo = null;
		DatagramPacket sendPa = null;

		try {
			Scanner scan = new Scanner(System.in);
			sendSo = new DatagramSocket();

			while (true) {
				System.out.print("보낼 메시지 > ");
				String input = scan.nextLine();
				byte[] sendData = input.getBytes();

				sendPa = new DatagramPacket(sendData, sendData.length, InetAddress.getByName("127.0.0.1"), 1111);
				System.out.println(sendData.length);

				sendSo.send(sendPa);

				System.out.println("전송완료!");
				if (input.equals("end"))
					break;
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
			sendSo.close();

		}
	}
}
