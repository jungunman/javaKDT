package coll_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		Object [] data = {33,11,'a',55,97,22,33,55,11,33,"그린","11","그린"};
		
		ArrayList arr1 = new ArrayList(); //중복 O, 순서 O
		HashSet s1 = new HashSet(); //중복 X, 순서 X
		
		for (Object obj : data) {
			arr1.add(obj);
			s1.add(obj);
		}
		System.out.println(Arrays.toString(data));
		System.out.println(arr1);
		System.out.println(s1);
		
		Set s2 = new HashSet();
		//Set s3 = new HashSet(data);
		Set s4 = new HashSet(arr1);
		Set s5 = new HashSet(s1);
		Set s6 = new HashSet();
		s6.addAll(arr1);
		Set s7 = (Set)s1.clone();
		Set s8 = s1;
		System.out.println("s2:"+s2);
		System.out.println("s4:"+s4);
		System.out.println("s5:"+s5);
		System.out.println("s6:"+s6);
		System.out.println("s7:"+s7);
		System.out.println("s8:"+s8);
		System.out.println("s1==s4:"+(s1==s4));
		System.out.println("s1==s5:"+(s1==s5));
		System.out.println("s1==s6:"+(s1==s6));
		System.out.println("s1==s7:"+(s1==s7));
		System.out.println("s1==s8:"+(s1==s8));
		System.out.println("s1.equals(s4):"+s1.equals(s4));
		System.out.println("s1.equals(s5):"+s1.equals(s5));
		System.out.println("s1.equals(s6):"+s1.equals(s6));
		System.out.println("s1.equals(s7):"+s1.equals(s7));
		System.out.println("s1.equals(s8):"+s1.equals(s8));
		System.out.println("s1:"+s1);
		System.out.println("size():"+s1.size());
		System.out.println("contains(22):"+s1.contains(22));
		System.out.println("contains(100):"+s1.contains(100));
		
		Object [] data2 = {33, 'a', 97, 22};
		Set s9 = new HashSet();
		for (Object dd: data2) {
			s9.add(dd);
		}
		System.out.println("s9:"+s9);
		System.out.println("containsAll(s9):"+s1.containsAll(s9));
		s9.add(100);
		System.out.println("s9:"+s9);
		System.out.println("containsAll(s9):"+s1.containsAll(s9));
		System.out.println("s4:"+s4);
		System.out.println("s4.isEmpty():"+s4.isEmpty());
		s4.clear();
		System.out.println("s4.isEmpty():"+s4.isEmpty());
		s1.add(1234);
		//s1.add(5, 1234); 순서가 없으므로 삽입 위치를 지정할 수 없음
		System.out.println("s1:"+s1);
		
		boolean bb = s1.remove(33);
		System.out.println("remove(33):"+s1);
		System.out.println("bb:"+bb);
		bb = s1.remove(100);
		System.out.println("remove(100):"+s1);
		System.out.println("bb:"+bb);
		bb = s1.removeAll(s9);
		System.out.println("s9:"+s9);
		System.out.println("removeAll(s9):"+s1);
		System.out.println("bb:"+bb);
		
		Object [] data3 = {11, 456, 789, 123, 55,1234};
		Set s10 = new HashSet();
		for (Object dd: data3) {
			s10.add(dd);
		}
		bb = s1.retainAll(s10);
		System.out.println("s10:"+10);
		System.out.println("retainAll(s10):"+s1);
		System.out.println("bb:"+bb);
		
		
		Object [] data4 = s1.toArray();
		System.out.println("s4:"+s1);
		System.out.println("toArray():"+Arrays.toString(data4));
		Object [] data5 = new Object[5];
		s1.toArray(data5);
		System.out.println("toArray(new Object[5]):"+Arrays.toString(data5));
		Object [] data6 = new Object[2];
		s1.toArray(data6);
		System.out.println("toArray(new Object[2]):"+Arrays.toString(data6));
		System.out.println("forEach----------");
		for (Object obj : s1) {
			System.out.println(obj);
		}
		System.out.println("for----------");
		for (int i = 0; i < s1.size(); i++) {
			//System.out.println(s1.get(i));
		}
		System.out.println("iterator----------");
		Iterator it = s1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		ArrayList arr2 = new ArrayList(s1);
		ArrayList arr3 = new ArrayList();
		arr3.addAll(s1);
		System.out.println("arr2:"+arr2);
		System.out.println("arr3:"+arr3);
	}

}


