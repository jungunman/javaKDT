package thread_p;

class JoInt extends Thread{
	public JoInt(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i <100; i++) {
			System.out.print(getName());
			try {
				sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("["+getName()+" 인터럽트 요청:"+i+"]");
			}
		}
	}
}
public class JoinInterruptMain {

	public static void main(String[] args) throws Exception {
		JoInt j1 = new JoInt("@");
		JoInt j2 = new JoInt("#");
		JoInt j3 = new JoInt("$");
		
		j1.start();
		j1.join();	//자신의 쓰레드만 실행되고 다른 쓰레드는 실행하지 못함
		j2.start();
		j2.join(2000);  //2초 동안만 holding
		
		j3.start();
		//System.out.println("\n 메인 sleep 시작");
		//Thread.sleep(1000);
		//System.out.println("\n 메인 sleep 끝");
		j3.interrupt(); //--sleep 이나 join 으로 제약을 받을때 try~catch의 catch 구간으로 진입
		//j1.join();  start() 이후에는 의미 없음

	}

}
