package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.regex.Pattern;

class SingleSender extends Thread{
	
	String name;
	DataOutputStream dos;
	
	String [] autos = {"가지가지한다","뭐라는건데","자동완성끄기","자동 완성 만든 새끼 나와","덤벼라 세상아 내가 간다","안녕하시렵니까?",
			"싫다굿!","아 자동완성 시뎌...","다치지 않는 게 최고","진짜 좋을까?","하지만 깡은 좋다","싸움은 잘하지 못하지","나는야 덤비기는 잘하는 사람",
			"힝뉴힝뉴 ㅠㅠ","아아아아아 이제 뭘 할 수 없는 몸이 되었다.","그저 쉬고싶어요...","화이팅!!","채팅 안만들고싶어요",
			"하지만 안만들면 뭘하겠어...","만들어야 산다!"
			};
	
	
	
	
	public SingleSender(Socket socket) {
		try {
			name = "["+InetAddress.getLocalHost()+"]";
			dos = new DataOutputStream(socket.getOutputStream());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		name = "["+sc.nextLine()+"]";
		
		
		
		try {
			while(dos!=null) {
				String str = sc.nextLine();
				boolean same = true;
				for (String auto : autos) {
					if(auto.contains(str)) {
						dos.writeUTF(name+" : "+auto);
						same = false;
						break;
					}
				}			
				
				if(same) {
					dos.writeUTF(name+" : "+str);
				}
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class SingleReceiver extends Thread{
	DataInputStream dis;
	public SingleReceiver(Socket socket) {
		try {
			dis = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
			// TODO: handle exception
		}finally {
			try {
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class SingleServerMain {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("서버대기");
			
			Socket client = server.accept();
			System.out.println(client.getInetAddress() + "접속");
			new SingleSender(client).start();
			new SingleReceiver(client).start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
