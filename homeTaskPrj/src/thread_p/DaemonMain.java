package thread_p;


class ThWork extends Thread{
	@Override
	public void run() {
		
		for (int i = 0; i <=10; i++) {
			System.out.println(i+" 쉬어요");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class DaemonOp extends Thread{
	@Override
	public void run() {
		while(true) {
			try {
				sleep(3000);
				System.out.println("또 쉬냐?");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class DaemonMain {

	public static void main(String[] args) {
		DaemonOp dop = new DaemonOp();
		ThWork th = new ThWork();
		dop.setDaemon(true);
		th.start();
		dop.start();
		
		//dop.setDaemon(true);  start() 이후에 설정불가
		/*
		
		헬스장을 구현하세요
		회원 3명을 구현할 것
		운동 종류 - 벤치머신, 런닝머신, 자전머신, 천국의계단, 댄스머신
		운동기구를 렌덤으로 횟수도 렌덤으로 실행할 것
		
		트레이너가 코치할 것
		모든 회원이 나가면 트레이너도 퇴근할 것
		 * */

	}

}
