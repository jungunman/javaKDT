package oops_p;

class SiMenu{
	String name;
	int price, cnt;
	public SiMenu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "(" + price + ") " + cnt;
	}
	
}
class SiCoffeeToT{
	SiMenu [] menus = {
			new SiMenu("아메리카노", 2200),
			new SiMenu("아프리카노", 2300),
			new SiMenu("아시아노", 2700)
	};
	private SiCoffeeToT() {	}
	
	static private SiCoffeeToT me = null;
	
	static SiCoffeeToT getInstance() {
		if(me==null) {
			me = new SiCoffeeToT();
		}
		
		return me;
	}
	
	int price(String menu) {
		
		for (SiMenu sm : menus) {
			if(sm.name.equals(menu)) {
				sm.cnt++;
				return sm.price;
			}
		}
		return 0;
	}
	
	void ppp() {
		System.out.println("총괄 >>>");
		for (SiMenu sm : menus) {
			System.out.println(sm);
		}
	}
}
class SiCoffeeShop{
	SiCoffeeToT sct = SiCoffeeToT.getInstance();
	String name;
	SiMenu [] menus;
	public SiCoffeeShop(String name) {
		super();
		this.name = name;
		menus = new SiMenu[sct.menus.length];
		for (int i = 0; i < menus.length; i++) {
			menus[i] = new SiMenu(sct.menus[i].name,sct.menus[i].price);
		}
	}

	void order(String menu) {
		for (SiMenu sm : menus) {
			if(sm.name.equals(menu)) {
				sm.cnt++;
			}
		}
		System.out.println(name+":"+menu+"=>"+sct.price(menu) );
	}
	
	void ppp() {
		System.out.println(name+" >>>");
		for (SiMenu sm : menus) {
			System.out.println(sm);
		}
	}
}
public class SingleCoffeeMain {

	public static void main(String[] args) {
		SiCoffeeShop sc1 = new SiCoffeeShop("강남점");
		SiCoffeeShop sc2 = new SiCoffeeShop("종로점");
		sc1.order("아메리카노");
		sc2.order("아프리카노");
		sc1.order("아메리카노");
		sc2.order("아시아노");
		
		sc1.ppp();
		sc2.ppp();
		SiCoffeeToT.getInstance().ppp();
		
		

//				 직사각형과 직각삼각형의 넓이와 둘레를 구하고
//
//				 각 도형들의 넓이와 둘레가 가장 큰 도형들을 출력하세요
	}

}
