package chat_practice_p;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class NationServer {

	private static final String HOST = "192.168.200.11";
	private static final int CHAT_PORT = 7777;
	
	private Selector selector;
	private ServerSocketChannel ssc;
	private ServerSocket ss;
	
	private Set<SocketChannel> users = new LinkedHashSet<>();
	
	public NationServer() throws IOException {
		this.selector = Selector.open();
		this.ssc = ServerSocketChannel.open();
		this.ssc.configureBlocking(false);
		this.ss = ssc.socket();
		this.ss.bind(new InetSocketAddress(HOST,CHAT_PORT));
		ssc.register(selector, SelectionKey.OP_ACCEPT);
	}
	
	
	public void start() {
		System.out.println("[ 서버 시작 ]");
		
		try {
			while(this.ssc.isOpen()) {
				//이벤트 신호 감지 대기중
				selector.select();
				
				Iterator<SelectionKey> it = selector.selectedKeys().iterator();
				
				while(it.hasNext()) {
					SelectionKey key = it.next();
					it.remove();
					
					if(key.isAcceptable()) {
						accept(key);
					}
					if(key.isReadable()) {
						read(key);
					}
					
				}
				
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	private void accept(SelectionKey key) {
		ServerSocketChannel server = (ServerSocketChannel)key.channel();
		SocketChannel sc;
		try {
			sc = server.accept();
			if(sc != null) {
				sc.configureBlocking(false);
				sc.register(selector, SelectionKey.OP_READ);
				users.add(sc);
				System.out.println(sc+" 유저가 접속했습니다.");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	private void read (SelectionKey key) {
		SocketChannel sc = (SocketChannel)key.channel();
		ByteBuffer buf = ByteBuffer.allocateDirect(1024);
		
		try {
			int read = sc.read(buf);
			if(read == -1) {// 읽을게 없으면
				sc.socket().close();
				sc.close();
				users.remove(sc);
				System.out.println(sc.toString() + " 유저가 클라이언트 접속을 해제 했습니다.");
			}
			
		} catch (IOException e) {
			if(sc != null) {
				try {
					sc.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			users.remove(sc);
			System.out.println(sc.toString() + " 유저가 클라이언트 접속을 해제 했습니다.");
		}
		
		sendToAll(buf,sc);
		
		if(buf != null) {
			buf.clear();
			buf = null;
		}
	}
	
	
	private void sendToAll(ByteBuffer buf, SocketChannel sender) {
		buf.flip();
		
		for (SocketChannel sc : users) {
			try {
				if(sc != null && !sender.equals(sc)) {
					sc.write(buf);
					buf.rewind();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String [] args) {
		NationServer ns;
		try {
			ns = new NationServer();
			ns.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
