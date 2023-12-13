package coll_p;

import java.util.Comparator;
import java.util.TreeSet;

//비교를 수행하는 클래스 정의
class MyCom2 implements Comparator{

	//비교하는 메소드 재정의 -> 
	// 현재 add 하는 원소 : o1, 기존 collection 의 원소 o2
	@Override
	public int compare(Object o1, Object o2) {
		//System.out.println("compare2 :"+o1+","+o2);
		//return 0;		 생략
		//return 100;	 양수 - 현재 들어온 원소가 뒤로 
		return -100;   //음수 - 현재 들어온 원소가 앞으로
	}
	
}

class MyCom3 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		System.out.println("compare3 :"+o1+","+o2);
		int me = (int)o1;
		int you = (int)o2;
		return you - me;
	}
	
}

public class TreeSetMain {

	public static void main(String[] args) {
		TreeSet ts1 = new TreeSet();
		//생성시 비교 클래스 입력
		TreeSet ts2 = new TreeSet(new MyCom2());
		TreeSet ts3 = new TreeSet(new MyCom3());
		for (int i : new int[] {33,44,11,55,22,33,66,77,44,99}) {
			ts1.add(i);
			ts2.add(i);
			//ts3.add(i);
			System.out.println(i+"-----------------------");
		}
		ts3.addAll(ts1);
		
		System.out.println("ts1 "+ts1);
		System.out.println("ts2 "+ts2);
		System.out.println("ts3 "+ts3);
	}

}
