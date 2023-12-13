package thread_p;

import java.util.ArrayList;
import java.util.Objects;

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
class Menu{
	String title;
	int price, cookingTime, cnt, currTime;
	public Menu(String title, int price, int cookingTime) {
		super();
		this.title = title;
		this.price = price;
		this.cookingTime = cookingTime;
	}
	

	Menu clone2() {
		// TODO Auto-generated method stub
		return new Menu(title, price,cookingTime);
	}
	@Override
	public String toString() {
		return "[" + title + "(" + price +") ";
		
	}
	
	void ppp() {
	 	System.out.println("[" + title + "(" + price + "," + cookingTime + ") " + cnt + "]");	
	}


	@Override
	public int hashCode() {
		return Objects.hash(title);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		return Objects.equals(title, other.title);
	}
	
}

class Chef{
	String name, status = "대기중";
	ArrayList<Menu> totMenus, myMenus;
	Menu currMenu = null;
	RestaurantTimer timer;
	public Chef(RestaurantTimer timer, String name, ArrayList<Menu> totMenus) {
		this.timer = timer;
		this.name = name;
		this.totMenus = totMenus;
		
		myMenus = new ArrayList<Menu>();
		
		for (Menu menu : totMenus) {
			myMenus.add(menu.clone2());
		}
	}
	void cooking() {
		if(status.equals("대기중")) {
			status = "요리중";
			currMenu = myMenus.get((int)(Math.random()*myMenus.size()));
			currMenu.currTime = 0;
		}else if(status.equals("요리중")) {
			currMenu.currTime++;
			if(currMenu.cookingTime <= currMenu.currTime) {
				status = "요리완료";
			}
		}else if(status.equals("요리완료")) {
			if(timer.ready==null) {
				timer.ready = currMenu;
				currMenu.cnt++;
				for (Menu menu : totMenus) {
					if(menu.equals(currMenu)) {
						menu.cnt++;
					}
				}
				
				currMenu = null;
				status = "대기중";
			}
			
		}
		
		System.out.println(name+status+currMenu);
	}	
	
	void ppp() {
		System.out.println("["+name+"]");
		for (Menu menu : myMenus) {
			menu.ppp();
		}
	}
}

class Customer{
	String name;
	ArrayList<Menu> menus;
	RestaurantTimer timer;
	int currTime = 0, limitTime;
	Menu currMenu = null;
	boolean enter = true;
	
	
	public Customer(RestaurantTimer timer, String name) {
		this.timer = timer;
		this.name = name;
		menus = new ArrayList<Menu>();
	}
	
	void pick() {
		if(enter) {
			if(currMenu == null && timer.ready!=null) {
				
				currMenu = timer.ready;
				System.out.println(name +"픽업 "+currMenu);
				menus.add(currMenu);
				timer.ready = null;
				limitTime = (int)(Math.random()*20+10);
				currTime = 0;
			}else if(currMenu != null) {
				currTime++;
				
				if(currTime>=limitTime) {
					System.out.println(name +"식사완료 "+currMenu);
					currMenu = null;
					currTime = 0;
					limitTime = 0;
					if(menus.size()>=4) {
						int total = 0;
						
						
						System.out.println(name +" 사장님 계산이요 "+menus.size());
						for (Menu menu : menus) {
							System.out.println(menu);
							total += menu.price;
						}
						System.out.println("합계 : "+total +"---------------");
						enter = false;
					}
					
				}else {
					System.out.println(name +"식사중 "+currMenu + currTime+" , "+limitTime);
				}
			}
			
		}
	}
	
	
}




class RestaurantTimer extends Thread{
	ArrayList<Menu> menus;
	ArrayList<Chef> chefs;
	ArrayList<Customer>customers;
	Menu ready = null;
	
	public RestaurantTimer() {
		menus = new ArrayList<Menu>();
		
		menus.add(new Menu("스테이크",11000,5));  
		menus.add(new Menu("파스타", 7000,3));   
		menus.add(new Menu("피자",9000,7));
		
		chefs = new ArrayList<Chef>();
		chefs.add(new Chef(this,"백종원", menus));
		chefs.add(new Chef(this,"천종원", menus));
		chefs.add(new Chef(this,"만종원", menus));
		
		customers = new ArrayList<Customer>();
		customers.add(new Customer(this, "전병우"));
		customers.add(new Customer(this, "최성재"));
		customers.add(new Customer(this, "박건우"));
		customers.add(new Customer(this, "이상훈"));
		customers.add(new Customer(this, "이정현"));
	}
	
	public void run() {
		
		int mm = 0;
		while(true) {
			
			try {
				sleep(10);
				System.out.println(mm+"분 지났다");
				for (Chef chef : chefs) {
					chef.cooking();
				}
				boolean enters = false;
				for (Customer ctm : customers) {
					ctm.pick();
					if(ctm.enter) {
						enters = true;//식사중이면 true
					}
					
				}
				if(!enters) { //모두 식사 종료
					break;
				}
				mm++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("정산 >>>>>");
		for (Chef chef : chefs) {
			chef.ppp();
		}
		
		System.out.println("[total]");
		for (Menu menu : menus) {
			menu.ppp();
		}
	}
}

public class RestaurantMain {
	
	public static void main(String[] args) {
		new RestaurantTimer().start();
	}

}
