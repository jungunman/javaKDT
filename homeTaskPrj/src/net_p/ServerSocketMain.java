package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
				
				//텍스트 관련
				OutputStream os = client.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				InputStream is = client.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				
				//파일 관련
				FileInputStream fis = new FileInputStream("fff/Hello.jpg");
				File file = new File("fff/아이귀요워.jpg");
				
				
				dos.writeUTF(file.getName());
//				dos.writeInt(fis.available());
				dos.writeInt(fis.available());
				
				
				
				
				byte [] buf = new byte [1024];
				
				int data;
				
				while( fis.available() > 0) {
					dos.write(buf,0,fis.read(buf));
					System.out.println("데이터 가져가는 중 : "+fis.available());
					Thread.sleep(2);
				}
				
				
				
				
				
				fis.close();
				dis.close();
				is.close();
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
