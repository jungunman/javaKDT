package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientSocketMain {

	public static void main(String[] args) {
		try {
			//서버접속
			Socket socket = new Socket("192.168.200.87", 7777);
			System.out.println("클라이언트 서버 접속 성공");
			OutputStream  os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			dos.writeUTF("자니?");
			
			System.out.println("클라이언트 받음:"+dis.readUTF());
			
			dos.writeUTF("왜안자?");
			
			dis.close();
			is.close();
			dos.close();
			os.close();
			
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
