package coll_p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;



public class LinkedHashSetMain {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		HashSet hs1 = new HashSet();
		LinkedHashSet lhs1 = new LinkedHashSet();
		TreeSet ts1 = new TreeSet();
		
		
		
		for (int i : new int[] {33,44,11,55,22,66,11,33,44,33}) {
			arr.add(i);
			hs1.add(i);
			lhs1.add(i);
			ts1.add(i);
			
		}
		
		System.out.println("arr "+arr);
		System.out.println("hs1 "+hs1);
		System.out.println("lhs1 "+lhs1);
		System.out.println("ts1 "+ts1);
		System.out.println("headSet(44) "+ts1.headSet(44));
		System.out.println("tailSet(44) "+ts1.tailSet(44));
//		System.out.println("hs1 "+hs1.get(2));
//		System.out.println("lhs1 "+lhs1.get(2));
//		System.out.println("ts1 "+ts1.get(2));
		
	}

}
