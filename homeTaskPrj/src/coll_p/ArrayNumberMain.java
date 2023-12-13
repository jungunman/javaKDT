package coll_p;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayNumberMain {

	public static void main(String[] args) {
		int [] arr = {23,56,78,12,90,23,65,75,18,934,57,32,12,67,80};
		
		ArrayList even = new ArrayList();
		ArrayList three = new ArrayList();
		
		for (int no :arr) {
			//System.out.println(no);
			if(no%2==0) {
				even.add(no);
			}
			if(no%3==0) {
				three.add(no);
			}
		}
		System.out.println("2의 배수 "+even);
		System.out.println("3의 배수 "+three);
//		56,78,92,45,78,25,100,77,94,77,56,83,85,56,45,72  --> 수우미양가 구간으로 나누어서 점수를 정렬하세요
//
//		각 구간은 내림차순(높은 점수가 앞에 위치) 하세요
		
		int [] jum = {56,74,92,45,78,25,100,8,77,94,77,53,83,85,56,49,72 };
		
		ArrayList arrarr = new ArrayList();
		
		for (int i = 0; i <=10; i++) {
			arrarr.add(new ArrayList());
		}
		
		for (int i : jum) {
//			ArrayList now = (ArrayList)arrarr.get(i/10);
//			now.add(i);
//			System.out.println(i+","+i/10+":"+now);
			((ArrayList)arrarr.get(i/10)).add(i);
			
		}
		ArrayList ga = (ArrayList)arrarr.get(5);
		for (int i = 0; i < 5; i++) {
			ga.addAll((ArrayList)arrarr.get(i));
		}
		((ArrayList)arrarr.get(9)).addAll((ArrayList)arrarr.get(10));
		String title = "가양미우수";
		for (int i = 9; i >= 5; i--) {
			ArrayList now = (ArrayList)arrarr.get(i);
			Collections.sort(now);
			Collections.reverse(now);
			System.out.println(title.charAt(i-5)+":"+now);
		}
	}

}
