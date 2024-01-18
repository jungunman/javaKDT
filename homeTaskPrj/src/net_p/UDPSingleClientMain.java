package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

class UDPSingleClient extends Thread{
	DatagramPacket data;
	DatagramSocket dSocket;
	InetAddress addr;
	
	public UDPSingleClient() throws SocketException, UnknownHostException {
		
		addr = InetAddress.getByName("192.168.200.11");
		dSocket = new DatagramSocket();
		new UDPSingleClientReciver(dSocket).start();
		
	}

	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		try {
			while(true) {
				System.out.print("남길 메세지 입력 : ");
				String msg = sc.nextLine();
				data = new DatagramPacket(
						msg.getBytes(), 
						msg.getBytes().length,
						addr, 
						7777);
				
				dSocket.send(data);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dSocket.close();
		}
	}
	
}

class UDPSingleClientReciver extends Thread{
	byte [] buf;
	DatagramPacket data;
	DatagramSocket dSocket;
	
	
	public UDPSingleClientReciver(DatagramSocket dSocket) throws SocketException {
		buf = new byte[1024];
		data = new DatagramPacket(buf, buf.length);
		this.dSocket = dSocket;
	}

	
	@Override
	public void run() {

		try {
			System.out.println("[ 클라이언트 ]");
			while(true) {
				dSocket.receive(data);
				System.out.println(data.getAddress() + " : " + new String(buf));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dSocket.close();
		}
	}
	
	
}


public class UDPSingleClientMain {

	public static void main(String[] args) {

		try {
			new UDPSingleClient().start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
