package chat_practice_p;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;

public class NationClient {
	private static final String HOST = "192.168.200.11";
	private static final int CHAT_PORT = 7777;
	
	private Selector selector;
	private SocketChannel sc;
	private final CharsetDecoder decoder = StandardCharsets.UTF_8.newDecoder();
	
	public NationClient() {
		try {
			this.selector = Selector.open();
			sc = SocketChannel.open(new InetSocketAddress(HOST,CHAT_PORT));
			sc.configureBlocking(false);
			sc.register(selector, SelectionKey.OP_READ);
			startWrite();
			startRead();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void startWrite() {
		System.out.println(" [==== 채팅 쓰기 ====] ");
		new NationInputThread(sc).start();
	}
	
	
	private void startRead() {
		System.out.println(" [==== 채팅 읽기 ====] ");
		try {
			while(true) {
				selector.select();
				Iterator<SelectionKey> it = selector.selectedKeys().iterator();
				
				while(it.hasNext()) {
					SelectionKey key = it.next();
					
					if(key.isReadable()) {
						read(key);
					}
					
					it.remove();
				}
			}
		}catch (Exception e) {
		}
	}
	
	private void read(SelectionKey key) {
		SocketChannel sc = (SocketChannel) key.channel();
		ByteBuffer buf = ByteBuffer.allocateDirect(1024);
		int read = 0;
		try {
			read = sc.read(buf);
			System.out.println(read+" Byte ====> 읽음]");
		}catch (IOException e) {
			try {
				if(sc != null) {
					sc.close();
				}
			}catch (IOException e1) {
			}
		}
		
		buf.flip();
		
		String data = "";
		
		try {
			data = decoder.decode(buf).toString();
		
			System.out.println("받은 메세지 "+data);
			
			if(buf != null) {
				buf.clear();
				buf = null;
			}
		} catch (CharacterCodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		NationClient nc = new NationClient();
	}
	
	
}
