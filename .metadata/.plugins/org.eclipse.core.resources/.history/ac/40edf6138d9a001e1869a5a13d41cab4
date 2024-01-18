package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;

public class MultiServerMain {

	ArrayList<DataOutputStream> list = new ArrayList<DataOutputStream>();
	public MultiServerMain() {
		//쓰레드 충돌을 차단
		Collections.synchronizedList(list);
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("서버시작");
			
			while(true) {
				Socket client = server.accept();
				new MulReceiver(client).start();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	class MulReceiver extends Thread{
		String name;
		DataOutputStream dos;
		DataInputStream dis;
		
		public MulReceiver(Socket client) {
			try {
				name = "["+client.getInetAddress()+"]";
				dos = new DataOutputStream(client.getOutputStream());
				dis = new DataInputStream(client.getInputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			try {
				sendToAll(name+"입장");
				list.add(dos);
				sendToAll("접속자 수:"+list.size());
				while(dis!=null) {
					sendToAll(name+dis.readUTF());
				}
			}catch(Exception e) {
				
			} finally {
				list.remove(dos);
				sendToAll(name+"퇴장");
				sendToAll("접속자 수:"+list.size());
			}
		}
	}
	
	//모든 접속자에게 메세지 보내기
	void sendToAll(String msg) {
		for (DataOutputStream dd : list) {
			try {
				dd.writeUTF(msg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		new MultiServerMain();
	}

}
