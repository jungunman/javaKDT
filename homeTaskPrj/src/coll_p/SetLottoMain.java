package coll_p;

import java.util.ArrayList;
import java.util.HashSet;

public class SetLottoMain {

	public static void main(String[] args) {
		ArrayList lotto1 = new ArrayList();
		HashSet lotto2 = new HashSet();

		while(true) {
			int no = (int)(Math.random()*45+1);
			lotto1.add(no);
			lotto2.add(no);
			
			if(lotto2.size()==7) {
				break;
			}
		}
		System.out.println("lotto1 "+lotto1);
		System.out.println("lotto2 "+lotto2);
		
		
		
		HashSet bingo = new HashSet();
		/*
		while(true) {
			bingo.add((int)(Math.random()*100+1));
			
			if(bingo.size()==25) {
				break;
			}
		}
		
		//System.out.println(bingo);
		int cnt = 0;
		for (Object obj : bingo) {
			System.out.print(obj+"\t");
			cnt++;
			if(cnt%5==0) {
				System.out.println();
			}
		}*/
		
		int cnt = 0;
		
		while(true) {
			
			int no = (int)(Math.random()*100+1);
			bingo.add(no);
			
			if(cnt!=bingo.size()) {
				cnt=bingo.size();
				System.out.print(no+"\t");
				if(cnt%5==0) {
					System.out.println();
				}
			}
			
			if(bingo.size()==25) {
				break;
			}
		}
		
		System.out.println("\n----------------------");
		
		//기존의 야구팀원리스트--------> 1군리스트
		   //2군리스트
		   //FA리스트----> FA 가능 리스트

		   // 변경전


		   //1군 리스트  박재상, 박정권, 최정, 김광현, 엄정욱, 박희수, 이호준
		   //2군 리스트  이호준 , 엄정욱, 박재홍, 이신협, 장동건
		   //FA리스트  이병규,이승엽, 박정권, 장동건, 박용택, 홍성흔

		//---------------------------------------------------------------------------------------

		    //변경후


		   //1군      박재상, 최정, 김광현, 박희수
		   //2군      이호준 , 엄정욱, 박재홍, 이신협, 
		   //FA 가능  이병규,이승엽, 박용택, 홍성흔
		
		HashSet t1 = new HashSet();
		HashSet t2 = new HashSet();
		HashSet fa = new HashSet();
		
		for (String str : "박재상,박정권,최정,김광현,엄정욱,박희수,이호준".split(",")) {
			t1.add(str);
		}
		for (String str : "이호준,엄정욱,박재홍,이신협,장동건".split(",")) {
			t2.add(str);
		}
		for (String str : "이병규,이승엽,박정권,장동건,박용택,홍성흔".split(",")) {
			fa.add(str);
		}
		System.out.println("변경전 >>>");
		System.out.println("1군 "+t1);
		System.out.println("2군 "+t2);
		System.out.println("FA  "+fa);
		
		HashSet bufT1 = (HashSet)t1.clone();
		HashSet bufT2 = (HashSet)t2.clone();
		t1.removeAll(t2);
		t1.removeAll(fa);
		t2.removeAll(fa);
		fa.removeAll(bufT1);
		fa.removeAll(bufT2);
		
		System.out.println("변경후 >>>");
		System.out.println("1군 "+t1);
		System.out.println("2군 "+t2);
		System.out.println("FA  "+fa);
		
	}

}
