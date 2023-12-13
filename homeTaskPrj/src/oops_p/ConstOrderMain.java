package oops_p;

import java.util.Arrays;

class DateMenu{
	String sushi,date;
	SushiMenu [] menu;
	
	DateMenu(String sushi, String date, SushiMenu[] menu) {
		super();
		this.sushi = sushi;
		this.date = date;
		
		this.menu = new SushiMenu[menu.length];
		for (int i = 0; i < menu.length; i++) {
			this.menu[i] = new SushiMenu(menu[i].name, menu[i].price);
		}
		
	}
	
	void sort(int no) {
		for (int me = 0; me < menu.length; me++) {
			for (int you = me+1; you < menu.length; you++) {
				
				boolean [] chk = {
						menu[me].getTot() <menu[you].getTot(),
						menu[me].cnt <menu[you].cnt
				};
				
				if(chk[no]) {
					SushiMenu buf = menu[me];
					menu[me] = menu[you];
					menu[you] = buf;
				}
			}
		}
	}
	
	
	void order(String ...mm) {
		int tot = 0;

		for (String m : mm) {
			for (SushiMenu sm : menu) {
				if(sm.name.equals(m)) {
					sm.cnt++;
					tot+= sm.price;
					break;
				}
			}
		}
		
		System.out.println(sushi+" - "+date+Arrays.toString(mm)+"("+mm.length+"):"+tot);
	}
	
	
	void ppp() {
		int cnt = 0;
		int tot = 0;
		
		//System.out.println(name+" >>>> ");
		for (SushiMenu sm : menu) {
			sm.ppp();
			cnt+=sm.cnt;
			tot += sm.getTot();
		}
		
		System.out.println(date+"------  : "+cnt +" , "+tot);
	}
	
}

class SushiMenu{
	String name;
	int price;
	int cnt;
	
	SushiMenu(String name, int price) {
		this.name = name;
		this.price = price;
		cnt = 0;
	}
	
	int getTot() {
		return price*cnt;
	}
	
	void ppp() {
		System.out.println(name+"("+price+"):"+cnt+","+getTot());
	}
}

class Sushi{
	String name;
	SushiMenu [] menu;
	DateMenu [] doArr = new DateMenu[0];
	
	Sushi(String name, SushiMenu...menu) {
		this.name = name;
		this.menu = menu;
		
		/*doArr = new DateMenu[] {
			new DateMenu(name, "11/3", menu),
			new DateMenu(name, "11/5", menu),
			new DateMenu(name, "11/6", menu),
			new DateMenu(name, "11/11", menu)
		};*/
//		addDateNenu("11/3");
//		addDateNenu("11/5");
//		addDateNenu("11/6");
//		addDateNenu("11/11");
//		addDateNenu("11/3");
	}
	
	void addDateNenu(String date) {
		
		boolean exist = false;
		
		for (DateMenu dm : doArr) {
			if(dm.date.equals(date)) {
				exist = true;
				break;
			}
		}
		
		if(exist) {
			return;
		}
		
		
		DateMenu [] buf = new DateMenu[doArr.length+1];
		
		for (int i = 0; i < doArr.length; i++) {
			buf[i] = doArr[i];
		}
		
		buf[doArr.length] = new DateMenu(name, date, menu);
		doArr = buf;
		
	}
	
	void order(String ...mm) {
		//int tot = 0;

		for (String m : mm) {
			for (SushiMenu sm : menu) {
				if(sm.name.equals(m)) {
					sm.cnt++;
					//tot+= sm.price;
					break;
				}
			}
		}
		
		//System.out.println(name+" - "+Arrays.toString(mm)+"("+mm.length+"):"+tot);
	}
	
	
	
	
	
	void dateOrder(String date,String ...mm) {
		addDateNenu(date);
		for (DateMenu da: doArr) {
			if(da.date.equals(date)) {
				da.order(mm);
				break;
			}
		}
		
		order(mm);
		
	}
	
	
	
	
	void sort(int no) {
		String [] title = {"가격","갯수"};
		System.out.println(" ["+title[no]+"] 별 정렬");
		
		for (DateMenu dm: doArr) {
			dm.sort(no);
		}
		
		for (int me = 0; me < menu.length; me++) {
			for (int you = me+1; you < menu.length; you++) {
				
				boolean [] chk = {
						menu[me].getTot() <menu[you].getTot(),
						menu[me].cnt <menu[you].cnt
				};
				
				if(chk[no]) {
					SushiMenu buf = menu[me];
					menu[me] = menu[you];
					menu[you] = buf;
				}
			}
		}
		ppp();
	}
	
	void ppp() {
		int cnt = 0;
		int tot = 0;
		
		datePpp();
		
		System.out.println(name+" 전체 >>>> ");
		for (SushiMenu sm : menu) {
			sm.ppp();
			cnt+=sm.cnt;
			tot += sm.getTot();
		}
		
		System.out.println("------전체 합계 : "+cnt +" , "+tot);
	}
	
	void datePpp() {
		//System.out.println(name+" >>>> ");
		for (DateMenu dm : doArr) {
			dm.ppp();
		}
	}
}



public class ConstOrderMain {

	public static void main(String[] args) {
		Sushi ssh = new Sushi("강남스시", 
				new SushiMenu("광어", 2000),
				new SushiMenu("연어", 1900),
				new SushiMenu("우럭", 1800),
				new SushiMenu("계란", 1500),
				new SushiMenu("장어", 2300),
				new SushiMenu("소고기", 4000)
			);
		
		/*
		ssh.order("광어","소고기","우럭");
		ssh.order("연어");
		ssh.order("우럭");
		ssh.order("연어","장어","우럭");
		ssh.order("소고기","우럭");
		ssh.order("장어","장어");
		ssh.ppp();
		ssh.sort(0);
		ssh.sort(1);
		*/
		
		ssh.dateOrder("11/5", "광어","소고기","우럭");
		ssh.dateOrder("11/5","광어","소고기","우럭");
		ssh.dateOrder("11/6","연어");
		ssh.dateOrder("11/6","우럭");
		ssh.dateOrder("11/5","연어","장어","우럭");
		ssh.dateOrder("11/3","소고기","우럭");
		ssh.dateOrder("11/11","장어","장어");
		
		
		//ssh.datePpp();
		ssh.ppp();
		ssh.sort(0);
		ssh.sort(1);
	}

}
