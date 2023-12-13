package oops_p;


class SingleCoffeeToT{
	
	int total = 0;
	
	private static SingleCoffeeToT me = null;
	
	private SingleCoffeeToT() {}
	
	static SingleCoffeeToT getInstance() {
		if(me==null) {
			me = new SingleCoffeeToT();
		}
		return me;
	}
	
	@Override
	public String toString() {
		
		return "전체 : "+total;
	}
}

class SingleCoffeeShop{
	SingleCoffeeToT sct = SingleCoffeeToT.getInstance();
	int cnt = 0,total;
	String name;
	
	public SingleCoffeeShop(String name) {
		this.name = name;
	}
	
	void order(String menu) {
		
		String menus = "아메리카노아프리카노 아시아노";
					//  0       5       10
		int [] price = {2200,2300,2700};
		
		int pp = price[menus.indexOf(menu)/5];
		total+= pp;
		sct.total++;
		cnt++;
		System.out.println(name+":"+menu+"=>"+pp);
	}

	@Override
	public String toString() {
		return  "[" + name + "] " + cnt + ", " + total;
	}
	
	
}

public class SingleCoffeeMain2 {

	public static void main(String[] args) {
		SingleCoffeeShop scs1 = new SingleCoffeeShop("역삼점");
		SingleCoffeeShop scs2 = new SingleCoffeeShop("문익점");
		
		scs1.order("아메리카노");
		scs2.order("아시아노");
		scs2.order("아메리카노");
		scs2.order("아메리카노");
		scs1.order("아프리카노");

		System.out.println(scs1);
		System.out.println(scs2);
		System.out.println(SingleCoffeeToT.getInstance());
	}

}
