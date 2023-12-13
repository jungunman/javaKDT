package coll_p;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapBaseBallMain {

	public static void main(String[] args) {
		// 1,2,3,4,5,6,7,8,9
		// 2,3,5,8,1,2,5,7,2,3,7,9,2,7,9,2
		/*
		 1 - 1
		 2 - 5
		 3 - 2
		 5 - 2
		 7 - 2
		 8 - 1
		 9 - 2
		 
		 * */
		int [] arr = {2,3,5,8,1,2,5,7,2,3,7,9,2,7,9,2};
		HashMap mm = new HashMap();
		for (int i : arr) {
			
			//System.out.println(i+" : "+mm+mm.containsKey(i));
			int cnt = 1;
			if(mm.containsKey(i)) {
				cnt += (int)mm.get(i);
			}
			mm.put(i, cnt);
			
		}
		
		for (Object oo : mm.entrySet()) {
			Map.Entry me = (Map.Entry)oo;
			System.out.println(me);
		}
//		 h : home,   a:away
		// h3 : home 팀의 3번타자
//	    h3,a5,a7,h9,h1,h3,a5,a6,h2,a3,a5,h9,h3,a7,h9
		System.out.println("------------------------------");
		String [] data = "h3,a5,a7,h9,c1,h3,a5,a6,h2,c3,a5,h9,h3,a7,h9".split(",");
		//HashMap hh = new HashMap();
		//HashMap aa = new HashMap();
		HashMap tot = new HashMap();
		//tot.put('h',new HashMap());
		//tot.put('a',new HashMap());
		for (String str : data) {
			char [] chars = str.toCharArray();
			System.out.println(chars[0]+":"+chars[1]);
			TreeMap buf = null;
			if(tot.containsKey(chars[0])) {
				buf = (TreeMap)tot.get(chars[0]);
			}else {
				buf = new TreeMap();
			}
			
			
			
			int i = 1;
			if(buf.containsKey(str)) {
				i+= (int)buf.get(str);
			}
			buf.put(str, i);
			
			tot.put(chars[0],buf);
		}
		
		
		for (Object oo : tot.entrySet()) {
			Map.Entry me = (Map.Entry)oo;
			System.out.println(me.getKey()+" >>>>");
			
			for (Object oo2 : ((TreeMap )me.getValue()).entrySet()) {
				Map.Entry me2 = (Map.Entry)oo2;
				System.out.println(me2);
			}
		}
		
		/*
		1.반, 이름 순으로 출력하세요
1 >>>>
예체능1	홍길준	남	[42, 69, 54, 98]	263	80	1
일반	1	홍길채	남	[86, 82, 74]		242	80	1
일반	1	박길북	남	[76, 52, 84]		212	70	3
2 >>>>
예체능	2	곽철북	남	[62, 59, 43, 68]	232	64	1
일반	2	곽서홍	남	[66, 42, 74]		182	60	2
일반	2	김철서	남	[66, 42, 74]		182	60	2
예체능	2	허용동	남	[62, 59, 44, 58]	223	58	4
		
		
		2.반, type, 성별 , 등수, 이름 순으로 출력하세요
		
1 >>>>
  예체능 >>>
    남 >>
예체능1	홍길준	남	[42, 69, 54, 98]	263	80	1
예체능1	홍길준	남	[42, 69, 54, 98]	263	80	1
    여 >>
예체능1	홍길준	여	[42, 69, 54, 98]	263	80	1
예체능1	홍길준	여	[42, 69, 54, 98]	263	78	2

  일반 >>>
   남 >>
일반	1	홍길채	남	[86, 82, 74]		242	80	1
일반	1	박길북	남	[76, 52, 84]		212	70	3
   여 >>
일반	1	홍길채	여	[86, 82, 74]		242	80	1
일반	1	박길북	여	[76, 52, 84]		212	70	3
2 >>>>
....

		   등수가 같으면 이름 오름 차순임
		   type : 일반, 예체능

출력내용 : 반 ,type, 성별 , 이름,  국, 영, 수, 예체능, 총점, 평균, 등수 
		*/

		
		
	}

}
