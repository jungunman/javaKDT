package basic_p;

public class VarOrderMain {

	public static void main(String[] args) {
		/*
		
		 커피이름 : 아프리카노
		 가격 : 2400
		 수량 : 3
		 금액 : ?
		 
		 커피이름,가격,수량,금액  변수로 처리하고 출력하세요
		 금액을 달러로 환산하세요
		 
		  
		 */
		double pos = 100;
		String cfeName = "아프리카노";
		int price = 2400, cnt = 3;
		int total = price * cnt;
		int rate = 1349;
		double dollar = (double)total / rate;
		double dollar2 = (double)(int)(dollar*pos+0.5)/pos;
		System.out.printf("커피이름 : %s \n",cfeName);
		System.out.printf("가격 : %d \n",price);
		System.out.printf("수량 : %d \n",cnt);
		System.out.print("금액 : ");
		System.out.println(total);
		System.out.print("달러 : ");
		System.out.println(dollar); //5.333333333333333
		
		System.out.print("달러2 : ");
		System.out.println(dollar2);
		/*
		 5.333333333333333
		 	* 100
		 533.3333333333333 
		 	int 형변환
		 533
		 	double 형변환
		 533.0
		 	/ 100
		 5.33
		 * 
		 * */
		
	}

}
