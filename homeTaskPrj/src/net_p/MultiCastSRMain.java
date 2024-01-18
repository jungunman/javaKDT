package net_p;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

class MultiCastSender extends Thread{
	MulticastSocket ms = null;
	
	public MultiCastSender() throws Exception {
		ms = new MulticastSocket();
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		try {
			while(true) {
				String msg = sc.nextLine();
				InetAddress ia = InetAddress.getByName("230.0.0.1");
				DatagramPacket data = new DatagramPacket(
						msg.getBytes(),
						msg.getBytes().length, 
						ia, 
						7777);
				ms.send(data);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			ms.close();
		}
	
	}
	
}


class MultiCastReciver extends Thread{
	
	MulticastSocket ms = null;
	InetAddress ia = null;
	DatagramPacket data;
	
	public MultiCastReciver() throws Exception {
		ms = new MulticastSocket(7777);
		ia = InetAddress.getByName("230.0.0.1");
		ms.joinGroup(ia);
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		try {
			while(true) {
				byte [] arr = new byte[1024];
				DatagramPacket data = new DatagramPacket(arr, arr.length);
				ms.receive(data);
				System.out.println(new String(arr));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				ms.leaveGroup(ia);
				ms.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	

	
	
	
}

public class MultiCastSRMain {

	public static void main(String[] args) {
		try {
			new MultiCastReciver().start();
			new MultiCastSender().start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
