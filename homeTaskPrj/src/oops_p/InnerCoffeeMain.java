package oops_p;

class OuterMenu{
	String name;
	int price,cnt;
	public OuterMenu(String ttt) {
		String [] arr = ttt.split("_");
		this.name = arr[0];
		this.price = Integer.parseInt(arr[1]);
	}
	@Override
	public String toString() {
		return "[" + name + "] " + price + ", " + cnt;
	}

}

class OuterBrand{
	String name;
	OuterMenu [] menus;
	int cnt=0;
	public OuterBrand(String name, String ... menus) {
		
		this.name = name;
		this.menus = new OuterMenu[menus.length];
		
		for (int i = 0; i < menus.length; i++) {
			this.menus[i] = new OuterMenu(menus[i]);
		}
	}

	void ppp() {
		System.out.println(name +" "+cnt+" >>>");
		for (OuterMenu om : menus) {
			System.out.println(om);
		}
	}
	class Shop{
		String name;
		int cnt=0;
		public Shop(String name) {
			this.name = name;
		}

		void order(String menu) {
			
			for (OuterMenu om : menus) {
				if(om.name.equals(menu)) {
					cnt++;
					om.cnt++;
					OuterBrand.this.cnt++;
					System.out.println(OuterBrand.this.name+" "+name+" "+menu+"("+om.price+") 주문");
					break;
				}
			}	
		}
		@Override
		public String toString() {
			return "["+ OuterBrand.this.name+" > "+ name + "] 결산 - " + cnt;
		}
	}
	
	
}

public class InnerCoffeeMain {

	public static void main(String[] args) {
		OuterBrand star = new OuterBrand(
				"별다방", 
				"아메리카노_2200",
				"아프리카노_2300",
				"아시아노_2500");
		
		OuterBrand been = new OuterBrand(
				"커피빈", 
				"아메리카노_2100",
				"아프리카노_2400",
				"아시아노_2550");
		
		OuterBrand.Shop [] shops = {
				star.new Shop("강남"),
				been.new Shop("강남"),
				been.new Shop("종로"),
				star.new Shop("잠실"),
				star.new Shop("역삼"),
				been.new Shop("양재")
		};
		shops[0].order("아메리카노");
		shops[1].order("아프리카노");
		shops[1].order("아메리카노");
		shops[3].order("아시아노");
		shops[4].order("아메리카노");
		shops[0].order("아시아노");
		shops[1].order("아프리카노");
		shops[2].order("아메리카노");
		shops[0].order("아프리카노");
		
		for (OuterBrand.Shop shop : shops) {
			System.out.println(shop);
		}
		star.ppp();
		been.ppp();
	}
	/*
	 학생 성적을 구현하세요
Outer - 반
   합격 인원, 불합격 인원
   cutline : 일반 - 70, 특기생 - 65

Inner - 학생 시험
   구분 , 이름, 국,영,수, 총점, 평균
	 * */

}
