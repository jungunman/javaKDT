package dynamic_p;

interface InCounter{
	void hello();
	void cashier(int tableNo);
}

interface InHall{
	void hello();
	void serving(int tableNo, String menu);
}
interface InKitchen{
	void dishwashing();
}

class InAlba implements InCounter, InHall, InKitchen{
	InAlbaData data;
	String name;
	int cnt = 0;

	public InAlba(InAlbaData data,String name) {
		this.name = name;
		this.data = data;
		data.alba++;
	}

	@Override
	public void dishwashing() {
		cnt++;
		data.cnt++;
		System.out.println(data.name+" : "+ name +" 설겆이해요");
		
	}

	@Override
	public void serving(int tableNo, String menu) {
		cnt++;
		data.cnt++;
		System.out.println(data.name+" : "+ name+" "+tableNo+"번 테이블에 "+menu+" 서빙해요");
		
	}

	@Override
	public void hello() {
		cnt++;
		data.cnt++;
		System.out.println(data.name+" : "+ name+" 인사해요");
	}

	@Override
	public void cashier(int tableNo) {
		cnt++;
		data.cnt++;
		System.out.println(data.name+" : "+ name+" "+tableNo+"번 테이블 계산해요");
	}
	
	void ppp() {
		System.out.println(data.name+" : "+ name+" : "+cnt);
	}
}

class InAlbaData{
	String name;
	
	public InAlbaData(String name) {
		
		this.name = name;
	}
	int alba = 0;
	int cnt = 0;
	
	void ppp() {
		System.out.println(name+" >>>" + alba +" : "+ cnt);
	}
}

public class InterAlbaMain {

	public static void main(String[] args) {
		
		InAlbaData data = new InAlbaData("보영만두 강남점");
		
		InAlba [] alba = {
				new InAlba(data,"조보아"),
				new InAlba(data,"정인선"),
				new InAlba(data,"금새록"),
				new InAlba(data,"김성주")
		};
		
		InCounter counter = alba[0];
		InHall hall = alba[1];
		InKitchen kitchen = alba[3];
		
		counter.hello();
		hall.hello();
		hall.serving(1, "김치찌개");
		hall = alba[2];
		hall.serving(1, "해물파전");
		kitchen.dishwashing();
		counter.cashier(1);
		
		for (InAlba ab : alba) {
			ab.ppp();
		}
		
		data.ppp();
	}

}
