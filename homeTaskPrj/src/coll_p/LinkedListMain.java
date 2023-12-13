package coll_p;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
	
	static void add_1(String name, List list) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 3000000; i++) {
			list.add(1234);
		}
		
		System.out.println(name+" 순차 추가 : "+(System.currentTimeMillis()-start));
	}
	
	static void add_2(String name, List list) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
			list.add(100,1234);
		}
		
		System.out.println(name+" 비순차 추가 : "+(System.currentTimeMillis()-start));
	}
	
	static void remove_2(String name, List list) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
			list.remove(100);
		}
		
		System.out.println(name+" 비순차 삭제 : "+(System.currentTimeMillis()-start));
	}
	
	static void remove_1(String name, List list) {
		long start = System.currentTimeMillis();
		
		for (int i = 2999999; i >= 0; i--) {
			list.remove(i);
		}
		
		System.out.println(name+" 순차 삭제 : "+(System.currentTimeMillis()-start));
	}

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		LinkedList link = new LinkedList();

		add_1("arr",arr);
		add_1("link",link);
		add_2("arr",arr);
		add_2("link",link);
		remove_2("arr",arr);
		remove_2("link",link);
		remove_1("arr",arr);
		remove_1("link",link);
		
		System.out.println("arr:"+arr.size());
		System.out.println("link:"+link.size());
	}

}

