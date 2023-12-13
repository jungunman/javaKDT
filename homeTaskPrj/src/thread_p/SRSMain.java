package thread_p;

class SRS extends Thread{
	public SRS(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println(getName());
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class SRSMain {

	public static void main(String[] args) throws Exception {
		SRS s1 = new SRS("*");
		SRS s2 = new SRS("**");
		SRS s3 = new SRS("***");
		
		System.out.println("start 전 : "+Thread.activeCount());
		s1.start();
		s2.start();
		s3.start();
		
		System.out.println("start 후 : "+Thread.activeCount());
		System.out.println("s1 : "+s1.isAlive()+" , "+Thread.activeCount());
		Thread.sleep(2000);
		s1.suspend();//일시정지
		System.out.println("s1.suspend() : "+s1.isAlive()+" , "+Thread.activeCount());
		Thread.sleep(2000);
		s2.suspend();//일시정지
		System.out.println("s2.suspend() : "+s1.isAlive()+" , "+Thread.activeCount());
		Thread.sleep(2000);
		s1.resume();//일시정지 해제
		System.out.println("s1.resume() : "+s1.isAlive()+" , "+Thread.activeCount());
		Thread.sleep(2000);
		s1.stop(); //정지
		System.out.println("s1.stop() : "+s1.isAlive()+" , "+Thread.activeCount());
		Thread.sleep(2000);
		s2.stop(); //정지
		System.out.println("s2.stop() : "+s1.isAlive()+" , "+Thread.activeCount());
		Thread.sleep(2000);
		s3.stop(); //정지
		System.out.println("s3.stop() : "+s1.isAlive()+" , "+Thread.activeCount());
		//s1.start(); 다시 start() 불가 
		s1.resume(); //해제 불가
		
		
		//동영상 플레이어를 구현하세요
		//뒤로재생, 재생(정지취소), 일시정지, 정지(MP3 아웃)
		//재생중 - 자막 출력
	}

}
