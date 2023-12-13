package basic_p;

public class CoffeeMain {

	public static void main(String[] args) {
		//커피이름: ex)아프리카노
		  //포장유무: ex)  true

		 //크기:  ex) L (S, M , L 중 택 1) 

		 //단가 : ex) 2100

		  // 수량 : ex) 3

		 // 금액 : ex) 6300
		String coffeeName = "아프리카노";
		boolean takeOut = true;
		char size = 'L';
		int price = 2100;
		byte cnt = 3;
		int total = price * cnt;
		System.out.printf("이름 : %s %n",coffeeName);
		System.out.printf("포장 : %b %n",takeOut);
		System.out.printf("크기 : %c %n",size);
		System.out.printf("가격 : %d %n",price);
		System.out.printf("수량 : %d %n",cnt);
		System.out.printf("금액 : %d %n",total);

	}

}
