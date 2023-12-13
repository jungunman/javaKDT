package basic_p;

enum EnumZZiGae{

	김치찌개(7000),동태찌개(8000),된장찌개(6000),부대찌개(8500);
	
	final int price;
	private int cnt = 0;
	private EnumZZiGae(int price) {
		this.price = price;
	}
	
	void add(int cnt) {
		this.cnt += cnt;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name()+"("+price+") "+ cnt+" => "+price*cnt;
	}
}
public class EnumZZiGaeMain {
	
	static void order(String menu, int cnt) {
		EnumZZiGae ez = EnumZZiGae.valueOf(menu);
		ez.add(cnt);
		System.out.println(menu+"("+ez.price+") "+ cnt+" => "+ez.price*cnt);
	}

	public static void main(String[] args) {
		order("김치찌개",1);
		order("된장찌개",2);
		order("부대찌개",3);
		order("김치찌개",2);
		order("된장찌개",1);
		order("동태찌개",1);
		order("김치찌개",2);
		order("동태찌개",4);
		
		System.out.println("결산 >>>>");
		for (EnumZZiGae ez : EnumZZiGae.values()) {
			System.out.println(ez);
		}

	}

}
