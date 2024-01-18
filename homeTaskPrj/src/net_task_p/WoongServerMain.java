package net_task_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
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
	
	
	
	void sendToAll(String msg) {
		String [] split = null; // 양식 ) 보내는이_귓속말 받을 유저이름_채팅내용 
								//===>[0]귓속말 받을 대상, [1]보내는 이, [2] 채팅내용 
		boolean whisper = false;
		if(msg.contains("_")) { // 채팅에 _ 가 포함되어 있으면
			split = msg.split("[:_]");//:와 _ 기준으로 잘라서
			whisper = true; //귓속말 상태임을 알린다.
		}
		if(whisper) { //귓속말 상태면
			try {
				users.get(split[1]).writeUTF(split[0]+" : "+split[2]);//보낼 대상에게 내이름과 채팅내용을 보낸다
				return;//그리고 아래로 가지 못하게 retrun으로 메소드 종료.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		split=msg.split(":");//아닐 경우 : 기준으로 스플릿 [0]보내는 이 [1] 채팅이 됨
		
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
				this.nick = dis.readUTF();
				
				if(joinUser()) { //그럼 이게 실행됨!
					stop();//쓰레드 중지 
					dos.writeUTF("닉네임 중복임 빠이!");//나 자신에게 쓰는 편지...
												//throw Exception으로 하려고 했으나... server에만 뜨더이다!
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public boolean joinUser() {
			if(users.containsKey(this.nick)) { // users의 키중 닉네임이 있을경우 그냥 return true로 retrun;
				return true;
			}			
			
			sendToAll("[ "+this.nick+"님이 입장 하셨습니다 ]");
			users.put(this.nick, dos); //중복이 아닐경우 OuterClass 의 Map에 저장!
			sendToAll("동시 접속자 : "+users.size()+"명");
			return false;
		}
		
		@Override
		public void run() {
			try {
				while(dis!=null) {
					sendToAll(this.nick+":"+dis.readUTF());
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
