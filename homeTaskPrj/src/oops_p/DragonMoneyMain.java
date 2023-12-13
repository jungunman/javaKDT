package oops_p;

class DragonMoney{
	
	String name;
	int myMoney = 0;
	static int mom = 100;
	
	void showTheMoney(int money) {
		if(name.equals("아빠")) {
			System.out.println("이 사람이!!!");
			return;
		}
		myMoney += money;
		mom -= money;
		System.out.println(name+" : "+ money+"("+myMoney+")");
		System.out.println("\t잔액: "+ mom);
	}
	
	void missionComplete(int money) {
		if(!name.equals("아빠")) {
			System.out.println(name+"아 건강하게만 자라다오");
			return;
		}
		myMoney += money;
		mom += money;
		System.out.println(name+" : "+ money+"("+myMoney+")");
		System.out.println("\t잔액: "+ mom);
	}
}


public class DragonMoneyMain {

	public static void main(String[] args) {
		DragonMoney son = new DragonMoney();
		DragonMoney daughter = new DragonMoney();
		DragonMoney scv = new DragonMoney();
		
		son.name = "아들";
		daughter.name = "딸";
		scv.name = "아빠";
		
		son.showTheMoney(15);
		daughter.showTheMoney(13);
		scv.missionComplete(50);
		daughter.showTheMoney(8);
		scv.showTheMoney(30);
		son.showTheMoney(7);
		son.missionComplete(20);
		scv.missionComplete(80);
	}

}
