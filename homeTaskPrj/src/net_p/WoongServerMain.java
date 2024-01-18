package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class WoongServer{
	Map<String, DataOutputStream> users = new HashMap<>();
	public WoongServer() {
		
		Collections.synchronizedMap(users);
	
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("[ 서버 ON ]");
			
			while(true) {
				Socket client = server.accept();
				new WoongReceiver(client).start();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void sendToOne(String sender ,String msg) {
		String [] split = msg.split("_");
		if(!users.containsKey(split[0])) {
			try {
				users.get(sender).writeUTF("[ "+split[0]+" ]은 없는 닉네임입니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return;
		}
		try {
			users.get(split[0]).writeUTF(sender+"==>"+split[1]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void sendToAll(String msg) {
		
		String [] split=msg.split(":");//아닐 경우 : 기준으로 스플릿 [0]보내는 이 [1] 채팅이 됨
		
		for (Map.Entry<String, DataOutputStream> user : users.entrySet()) {
			if(!user.getKey().equals(split[0])) { //Map의 Key값(닉네임)과 보내는 이가 같지 않으면! 아래 실행!
												// 보내는 이는 자기 자신의 말이니 받지 않는다				
				try {
					user.getValue().writeUTF(msg);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	class WoongReceiver extends Thread{
		String nick;
		DataOutputStream dos;
		DataInputStream dis;
		Scanner sc;//닉네임 및 채팅 입력
		Socket sock;
		
		public WoongReceiver(Socket client) {
			this.sock = client;
			try {
				this.dos = new DataOutputStream(sock.getOutputStream());
				this.dis = new DataInputStream(sock.getInputStream());
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		void checkNick() throws IOException {
			while(true) {
				String nn = dis.readUTF();
				
				if(users.containsKey(nn)) {
					dos.writeBoolean(false);
					continue;
				}
				dos.writeBoolean(true);
				this.nick = nn;
				break;
			}
			
			users.put(this.nick, dos); //중복이 아닐경우 OuterClass 의 Map에 저장!
			sendToAll("[ "+this.nick+"님이 입장 하셨습니다 ]");
			sendToAll("동시 접속자 : "+users.size()+"명");
			
		}
		
		@Override
		public void run() {
			try {
				checkNick();
				
				while(dis!=null) {
					String msg = dis.readUTF();
					
					if(msg.contains("_")) {
						sendToOne(nick,msg);
					}else {
						sendToAll(this.nick+":"+msg);						
					}
					
				}
			}catch(Exception e) {
				
			} finally {
				users.remove(this.nick);
				sendToAll(" [ "+this.nick+"퇴장 하셨습니다 ] ");
				sendToAll("접속자 수 : "+users.size());
			}
		}
	}
	
	
}

public class WoongServerMain {

	public static void main(String[] args) {
		new WoongServer();
	}

}
