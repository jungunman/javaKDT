package array_p;

import java.util.Arrays;

public class MulArrMain {

	public static void main(String[] args) {

		String [][] arr = {
				{"0_0","0_1","0_2","0_3"},
				{"1_0","1_1","1_2","1_3"},
				{"2_0","2_1","2_2","2_3"}
		};
		
		System.out.println("arr:"+arr);
		System.out.println("arr[0]:"+arr[0]);
		System.out.println("arr.length:"+arr.length);
		System.out.println("arr[0].length:"+arr[0].length);
		System.out.println("arr[1][2]:"+arr[1][2]);
		
		
		String [] name = {"장동건", "장남건", "장서건", "장중건", "북두신건"};
		/*
		int [][] jum = {
				{87, 	67, 	97, 	77, 	53},
				{86, 	68, 	91, 	77, 	57},
				{86, 	69, 	97, 	72, 	57}
		};*/
		int [][] jum = {
				{77,79,72},
				{57,59,52},
				{97,99,92},
				{67,69,62},
				{87,89,82}
		};
		int [][] res = new int[name.length][2];
									// 0- 총점, 1- 평균
		/*
		 {
			 {총점, 평균},
			 {총점, 평균},
			 {총점, 평균},
			 {총점, 평균},
			 {총점, 평균}
		 }
		  
		 * */
		
		for (int i = 0; i < res.length; i++) {
			
			
			for (int j : jum[i]) {
				res[i][0]+= j;
			//	System.out.println(j);
			}
			res[i][1] = res[i][0]/jum[i].length;
			//System.out.println(jum[i]+Arrays.toString(jum[i])+res[i]);
		}
		
		
		
		for (int i = 0; i < jum.length; i++) {
			String ttt = name[i]+"\t";
			
			for (int j : jum[i]) {
				//System.out.print(j);
				ttt += j+"\t";
			}
			
			//ttt+=res[i][0]+"\t"+res[i][1];
			for (int j : res[i]) {
				ttt += j+"\t";
			}
			System.out.println(ttt);
		}
		
		
		/*
		  CoffeeOrderMain
		  다음은 주문 메뉴의 배열이다
		  각 날짜의 주문 합계를 출력하세요
		  
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
		
		
	}

}
