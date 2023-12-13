package basic_p;

enum CoffeeMenu{

	아메리카노(2500), 아프리카노(2200), 아시아노(2300);
	
	CoffeeMenu(int price) {
		
		this.price = price;
		
	}

	
	final int price;
	private int cnt = 0;
	
	void add(){
		cnt++;
	}
	
	@Override
	public String toString() {
		
		return name()+"("+price+") : "+cnt+" => "+price*cnt;
	}
}
public class EnumCoffeeMain {
	
	static void order(String menu) {
		CoffeeMenu cm = CoffeeMenu.valueOf(menu);
		cm.add();
		System.out.println(cm.name()+" : "+cm.price +" 주문");
	}

	public static void main(String[] args) {

		order("아메리카노");
		order("아프리카노");
		order("아메리카노");
		order("아메리카노");
		order("아시아노");
		order("아프리카노");
		
		
		for (CoffeeMenu cm : CoffeeMenu.values()) {
			System.out.println(cm);
		}

	}
	/*
	 찌개집을 구현하세요
	 메뉴는 enum 으로 처리할 것
	 
	 주문시 찌개와 갯수를 명시할 것
	 
	 결산 정보를 메뉴별로 출력할 것
	 * */

}
