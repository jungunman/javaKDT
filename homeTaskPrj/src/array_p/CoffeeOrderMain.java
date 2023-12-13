package array_p;

import java.util.Arrays;

public class CoffeeOrderMain {

	public static void main(String[] args) {
		/*
		  주문번호 : 
		  0 - 아메리카노 (2000)
		  1 - 아프리카노 (2300)
		  2 - 아시아노  (2700)
		  
		          아메리카노 ,아프리카노, 아시아노
		  4/10 -     1       2        0
		  4/11 -     2       0        1
		  4/12 -     0       3        0
		  4/13 -     1       1        1
		  
		  
		  4/10 -    6600
		  4/11 -    6700
		  4/12 -    6900
		  4/13 -    7000
		  
		  * */
		
		//원시데이터
		String [] menu = {"아메리카노","아프리카노","아시아노"};
		String [] date = {"4/10","4/11","4/12","4/13"};
		int [] price = {2000,2300,2700};
		int [][] order = {
				{1,       2,        0},
				{2,       0,        1},
				{ 0,       3,        0},
				{ 1,       1,        1}
		};
		//입력부
		int [] tot = new int[date.length];
		int [] menuTot = new int[menu.length];
		//연산부
		for (int i = 0; i < order.length; i++) {//i --> 날짜
			System.out.println(date[i]);
			int [] dateOrder = order[i];
			//System.out.println(Arrays.toString(dateOrder));
			
			
			
			tot[i] = 0;
			for (int j = 0; j < dateOrder.length; j++) {//j --> 메뉴
				System.out.println(j+":"+dateOrder[j]+","+ price[j]+":"+dateOrder[j]*price[j]);
				
				tot[i] += dateOrder[j]*price[j];
				menuTot[j] += dateOrder[j];
			}
		}
		
		//출력부
		for (int i = 0; i < date.length; i++) {
			String ttt = date[i]+"- \t"+tot[i];
			System.out.println(ttt);
		}
		System.out.println("----------------");
		for (int j = 0; j < menuTot.length; j++) {
			System.out.println(menu[j]+":"+menuTot[j]+"("+menuTot[j]*price[j]+")");
		}
	}

}
