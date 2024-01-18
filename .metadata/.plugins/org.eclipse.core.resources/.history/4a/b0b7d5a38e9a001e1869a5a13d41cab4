package net_p;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


class MultiSender extends Thread{
	
	
	DataOutputStream dos;
	
	public MultiSender(Socket socket) {
		try {
		
			dos = new DataOutputStream(socket.getOutputStream());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		
			
		try {
			while(dos!=null) {
				String str = sc.nextLine();
				dos.writeUTF(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class SingleClientMain {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.200.87", 7777);
			System.out.println("클라이언트 서버 접속");
			
			
			//new SingleSender(socket).start();
			new MultiSender(socket).start();
			new SingleReceiver(socket).start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//1. 대화명을 지정하여 넣으세요
		//2. 자동완성을 실행해 주세요
	}

}
