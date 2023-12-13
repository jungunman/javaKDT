package thread_p;


class PriorityTh extends Thread{
	PriorityTh(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i <100; i++) {
			System.out.print(getName());
		}
	}
}

public class PriorityMain {

	public static void main(String[] args) {
		PriorityTh p1 = new PriorityTh("@");
		PriorityTh p2 = new PriorityTh("#");
		PriorityTh p3 = new PriorityTh("$");
		
		//초기값 : 5
		System.out.println(p1.getPriority()+","+p2.getPriority()+","+p3.getPriority());
		p1.setPriority(1);
		p2.setPriority(5);
		p3.setPriority(10);
		System.out.println(p1.getPriority()+","+p2.getPriority()+","+p3.getPriority());
		
		p1.start();
		p2.start();
		p3.start();

	}

}
