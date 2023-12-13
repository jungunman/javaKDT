package net_p;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(7777);
			
			while(true) {
				System.out.println("서버 대기중");
				Socket client = server.accept();
				
				System.out.println(client.getInetAddress()+ " 접 속 ");

				OutputStream os = client.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				
				dos.writeUTF("안녕하세요, 반갑습니다.");
				dos.close();
				os.close();
			}
			
		}catch(Exception e) {
			
		}finally {
			try {
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
			}
			
		}
		
	}

}