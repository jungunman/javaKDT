package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocketMain {

	public static void main(String[] args) {

		try {
			Socket sock = new Socket("192.168.200.94",7777);
			//Socket sock = new Socket("192.168.1.50",7777);
			System.out.println("클라이언트 서버 접속 성공");
			
			
			OutputStream os = sock.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			InputStream is = sock.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			
			dos.writeUTF("모르겠지요?");
			
			
			System.out.println("받음 : " + dis.readUTF());
			
			
			dos.close();
			os.close();
			sock.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
