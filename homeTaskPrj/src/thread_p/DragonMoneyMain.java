package thread_p;

class Mom{
	int total = 100;
	
	synchronized boolean showMeTheMoney(int money) {
		
		boolean res = false;
		if(res = total >= money) {
		
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return res;
//		return total >= money;
	}
}

class SyChild extends Thread{
	Mom mom;
	int myMoney = 0;
	public SyChild(Mom mom, String name) {
		super(name);
		this.mom = mom;
	}
	
	@Override
	public void run() {
		while(mom.total > 0) {
			int money = (int)(Math.random()*40)+1;
			
			
			if(mom.showMeTheMoney(money)) {
				myMoney += money;
				mom.total -= money;
				System.out.println(getName()+":"+money+"("+myMoney+")");
				System.out.println("\t잔액 : "+mom.total);
			}
			
			
			try {
				sleep(10);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class DragonMoneyMain {

	public static void main(String[] args) {
		Mom mom = new Mom();
		SyChild son = new SyChild(mom, "아들");
		SyChild daughter = new SyChild(mom, "딸");
		son.start();
		daughter.start();
	}
	/*
	 페밀리 레스토랑을 구현하세요

음식 (조리시간): 
스테이크(5분) : 11000, 
파스타(3분)  7000, 
피자(7분)   9000,

주방장 - 3명

손님 - 5명 : 
식사 가능 시간 - 2시간
각 식사시간 10~30분 랜덤
최대 식사 갯수 : 4개
식사 후
손님 각각 결재금액 출력

식당 브레이크 타임
주방장 및 식당 결산
 
	 * */

}
