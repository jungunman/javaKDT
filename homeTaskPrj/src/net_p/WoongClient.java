package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


class UserSender extends Thread{
	
	DataOutputStream dos;
	DataInputStream dis;
	Socket socket;
	public UserSender(Socket socket) {
		try {
			this.socket = socket;
			dos = new DataOutputStream(socket.getOutputStream());
			dis = new DataInputStream(socket.getInputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	void checkNick(Scanner sc) throws IOException {
		while(true) {
			System.out.print("닉네임 입력 : ");
			String nick =sc.nextLine();
			dos.writeUTF(nick);
			if(dis.readBoolean()) {
				System.out.println("[ 입장 완료 ]");
				new UserReceiver(socket).start();
				break;
			}
			System.out.println("[ 이름 중복 다시 입력하세요 ]");
		}
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
			
		try {
			
			checkNick(sc);
			
			while(dos!=null) {
				String str = sc.nextLine();
				dos.writeUTF(str);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}


class UserReceiver extends Thread{
	DataInputStream dis;
	
	public UserReceiver(Socket socket) {
		try {
			dis = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		try {
			while(dis!=null) {
				System.out.println(dis.readUTF());
			}
		} catch (Exception e) {
		}finally {
			try {
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

public class WoongClient {

	public static void main(String[] args) {
		try {
			
			Socket socket = new Socket("192.168.200.11", 7777);
			System.out.println("클라이언트 서버 접속");
			new UserSender(socket).start();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
