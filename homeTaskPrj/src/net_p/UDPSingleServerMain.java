package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

class UDPSingleServer extends Thread{
	byte [] buf;
	DatagramPacket data;
	DatagramSocket dSocket;
	
	
	public UDPSingleServer() throws SocketException, UnknownHostException {
		buf = new byte[1024];
		dSocket = new DatagramSocket(7777);
		new UDPSingleServerSender(dSocket).start();
	}

	
	@Override
	public void run() {

		try {
			System.out.println("[ 서버 온 ]");
			while(true) {
				data = new DatagramPacket(buf, buf.length);
				dSocket.receive(data);
				System.out.println(data.getAddress() + " : " + new String(buf));
				buf = new byte[1024];
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dSocket.close();
		}
	}
	
	//88번 혜린
}


class UDPSingleServerSender extends Thread{
	DatagramPacket data;
	DatagramSocket dSocket;
	InetAddress addr;
	
	public UDPSingleServerSender(DatagramSocket dSocket) throws SocketException, UnknownHostException {
		
		addr = InetAddress.getByName("192.168.200.255");
		this.dSocket = dSocket;
		
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




public class UDPSingleServerMain {

	public static void main(String[] args) {

		try {
			new UDPSingleServer().start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
