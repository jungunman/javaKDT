package coll_p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorMain {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(11);
		arr.add(22);
		arr.add(33);
		arr.add(44);
		arr.add(55);
		arr.add(66);
		arr.add(77);
		
		System.out.println(arr);
		for (Object obj : arr) {
			int i = (int)obj;
			if(i==33) {
				//arr.remove(obj); 반복문 안에서 삭제 불가
			}
			System.out.println(obj);
		}
		System.out.println(arr);
		
		Iterator it = arr.iterator();
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		while(it.hasNext()) {
			Object obj = it.next();
			int i = (int)obj;
			if(i==33) {
				//arr.remove(obj);// 반복문 안에서 삭제 불가
				it.remove(); //반복문에서 삭제 용이
			}
			//System.out.println(obj+","+it.nextIndex());
			System.out.println(obj);
		}
		
		/*
		while(it.hasPrevious()) {
			System.out.println(it.previous()+","+it.previousIndex());
		}*/
		
		System.out.println(arr);
		
		
		ListIterator lit = arr.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next()+","+lit.nextIndex());
		}
		System.out.println("----------------");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous()+","+lit.previousIndex());
		}
		System.out.println("----------------");

		
		ArrayList arr2 = new ArrayList();
		for (int i : new int[] {34,56,12,43,90,89,654,43,21234,675,45}) {
			arr2.add(i);
		}
		
		System.out.println(arr2);
		Iterator it2 = arr2.iterator();
		
		while(it2.hasNext()) {
			
			if(((int)it2.next())%3==0) {
				it2.remove();
			}
		}
		System.out.println(arr2);
		//34,56,12,43,90,89,654,43,21234,675,45

		 //1. 모든 원소를 arrayList에 넣어 출력하세요
		 //2, 3의 배수를 제외한 arrayList로 변환하세요
	}

}
