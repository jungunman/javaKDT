package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocketMain {

	public static void main(String[] args) {

		try {
			Socket sock = new Socket("192.168.200.96",7777);
			//Socket sock = new Socket("192.168.1.50",7777);
			System.out.println("클라이언트 서버 접속 성공");
			
			
			OutputStream os = sock.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			InputStream is = sock.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			String fileName = dis.readUTF();
			int size = dis.readInt();
			
			FileOutputStream fos = new FileOutputStream("fff/"+fileName);
			
			int data;
			
			byte [] buf = new byte[1024];
			
			while((data = dis.read(buf)) != -1){
				System.out.println("client : " +data);
				fos.write(buf,0,data);
			}
			
			
			
			
			System.out.println("파일 받음 ");
			
			
			
			fos.close();
			dis.close();
			dos.close();
			os.close();
			sock.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
