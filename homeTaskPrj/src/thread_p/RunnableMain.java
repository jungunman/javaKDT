package thread_p;

class ClaRR implements Runnable{
	
	String name;
		
	public ClaRR(String name) {

		this.name = name;
	}



	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println(name);
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class RunnableMain {

	public static void main(String[] args) {
		ClaRR c1 = new ClaRR("@");
		ClaRR c2 = new ClaRR("#");
		ClaRR c3 = new ClaRR("$");
		
		//c1.run();
		//c2.run();
		//c3.run();
		//c1.start();
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		Thread t3 = new Thread(c3);
		t1.start();
		t2.start();
		t3.start();

	}

}
