package chat_practice_p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class NationInputThread extends Thread{
	
	private SocketChannel sc;
	
	public NationInputThread(SocketChannel sc) {
		this.sc = sc;
	}
	
	@Override
	public void run() {
		ByteBuffer buf = ByteBuffer.allocateDirect(1024);
		try {
			while(!Thread.currentThread().isInterrupted()) {//현재 쓰레드에 오류가 나지 않았다면 계속 실행!
				buf.clear();//buffer 안 잔여물 제거
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String msg = br.readLine();
				
				if(msg.equals("exit")) {
					if( sc  != null){
						sc.socket().close();
						sc.close();
						System.exit(0);
					}
				}
				
				buf.put(msg.getBytes());
				buf.flip();
				
				sc.write(buf);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(buf != null){
				buf.clear();
				buf = null;
			}
		}
		
	}
	
	
}




