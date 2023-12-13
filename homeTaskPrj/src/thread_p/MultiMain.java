package thread_p;


class Single{
	
	String name;
	
	public Single(String name) {
		this.name = name;
	}


	public void run() {
		for (int i = 0; i <50; i++) {
			System.out.print(name);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class FirstTh extends Thread{
	public FirstTh(String nn) {
		super(nn);  //getName()
	}
	
	@Override
	public void run() {
		for (int i = 0; i <100; i++) {
			System.out.print(getName());
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultiMain {

	public static void main(String[] args) {
		Single ss1 = new Single("!");
		Single ss2 = new Single("@");
		Single ss3 = new Single("#");
		
		ss1.run();
		ss2.run();
		ss3.run();
		
		System.out.println("\n-------------------");
		FirstTh f1 = new FirstTh("$");
		FirstTh f2 = new FirstTh("^");
		FirstTh f3 = new FirstTh("%");
		
//		f1.run();
//		f2.run();
//		f3.run();
		f1.start();
		f2.start();
		f3.start();
		
		System.out.println("\n activeCount():"+Thread.activeCount());
		System.out.println("\n currentThread():"+Thread.currentThread());
		// [main,5,main]  쓰레드이름, 우선순위, 쓰레드 그룹
		
		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n activeCount():"+Thread.activeCount());
	}

}
