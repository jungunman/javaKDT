package net_p;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

class MultiChatServer extends Thread{
	
	List<OutputStream> os = new ArrayList<OutputStream>();
	
	
	public MultiChatServer(Socket socket){
		try {
			os.add(socket.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void run() {
		
	
	
	
	
	
	
	}
	
	
}



public class MultiChatServerMain {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("서버입장");
			
			
			while(true) {
				Socket socket = server.accept();
				
			}
			
			
			
			
			
		
		}catch(Exception e) {
			
		}finally {
			
		}
		
		
	}

}
