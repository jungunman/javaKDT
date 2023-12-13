package coll_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		
		System.out.println(" [CRUD] >>>>  ");
		//생성
		List arr1 = new ArrayList();
		ArrayList arr2 = new ArrayList();
		
		System.out.println(arr2);
		arr2.add(10);	//추가
		arr2.add(30);
		arr2.add(20);
		System.out.println(arr2);
		arr2.add("건우야");
		arr2.add(true);
		arr2.add(new int[] {11,22,33});
		arr2.add(123.456);	
		System.out.println(arr2);
		arr2.add(10);
		arr2.add(30);
		arr2.add(30);
		arr2.add(10);
		System.out.println(arr2);
		//System.out.println(arr2.length);
		System.out.println(arr2.size());
		String str;
		//str = arr2.get(3);
		Object obj  = arr2.get(3); //get의 리턴 : Object, 호출
		str = (String)arr2.get(3);
		System.out.println(str);
		arr2.set(4, 987.654); 	//대입
		System.out.println(arr2);
		arr2.add(8, "아기상어");	//삽입 :: 열거데이터 중간에 추가
		System.out.println(arr2);
		
		arr2.remove(5);//5번째 삭제
		System.out.println(arr2);
		arr2.remove("건우야");//"건우야"를 삭제
		System.out.println(arr2);
		//arr2.remove(20);//20번째를 삭제하려고 함 - 인덱스가 없어서 에러발생
		arr2.remove((Object)20);//20을 삭제
		System.out.println(arr2);
		arr2.remove((Object)30);//30을 삭제 -> 중복된 요소는 앞에서부터 차례대로 1개씩 삭제
		System.out.println(arr2);
		arr2.remove((Object)30);//30을 삭제 -> 중복된 요소는 앞에서부터 차례대로 1개씩 삭제
		System.out.println(arr2);
		arr2.remove((Object)30);//30을 삭제 -> 중복된 요소는 앞에서부터 차례대로 1개씩 삭제
		System.out.println(arr2);
		arr2.remove((Object)30);//Object인 경우 지우고자 하는 요소가 없어도 에러발생 안함
		System.out.println(arr2);
		
		
		System.out.println(" [검색] >>>>  ");
		System.out.println(arr2.indexOf(123.456));
		System.out.println(arr2.indexOf(9999)); //없으면 -1
		System.out.println(arr2.indexOf(10));
		System.out.println(arr2.lastIndexOf(10));
		//System.out.println(arr2.indexOf(10,2));
		System.out.println(arr2.contains(123.456));
		System.out.println(arr2.contains(9999));
		
		
		System.out.println(" [All] >>>>  ");
		ArrayList arr4 = new ArrayList();
		arr4.add(987.654);
		arr4.add(123.456);
		System.out.println(arr4);
		System.out.println(arr2.containsAll(arr4)); //and
		arr4.add(123.456);
		System.out.println(arr4);
		System.out.println(arr2.containsAll(arr4));
		arr4.add(246.135);
		System.out.println(arr4);
		System.out.println(arr2.containsAll(arr4));
		ArrayList arr5 = new ArrayList();
		arr5.add(10);
		arr5.add(20);
		arr5.add("아기상어");
		arr5.add("아기상어");
		System.out.println(arr5);
		System.out.println(arr2);
		arr2.removeAll(arr5);
		System.out.println(arr2);
		ArrayList arr6 = new ArrayList();
		arr6.add("나는");
		arr6.add("무너");
		arr6.add(8877);
		arr6.add("나는");
		System.out.println(arr6);
		arr2.addAll(1, arr6);
		System.out.println(arr2);
		arr6.add("꿈을 꾸는");
		System.out.println(arr6);
		System.out.println(arr2);
		ArrayList arr7 = arr2;	//shallow copy
		ArrayList arr8 = new ArrayList(arr2); //deep copy
		ArrayList arr88 = (ArrayList)arr2.clone(); //deep copy
		System.out.println("arr2:"+arr2);
		System.out.println("arr7:"+arr7);
		System.out.println("arr8:"+arr8);
		System.out.println("arr88:"+arr88);
		arr2.add(6655);
		System.out.println("arr2:"+arr2);
		System.out.println("arr7:"+arr7);
		System.out.println("arr8:"+arr8);
		System.out.println("arr88:"+arr88);
		ArrayList arr9 = new ArrayList();
		arr9.add(123.456);
		arr9.add(8877);
		arr9.add(4433);
		arr9.add(2211);
		arr9.add("나는");
		
		System.out.println("arr9:"+arr9);
		System.out.println("arr2:"+arr2);
		arr2.retainAll(arr9);
		System.out.println("arr2:"+arr2);
		arr2.add(20);
		arr2.add(10);
		arr2.add(50);
		arr2.add(10);
		arr2.add(50);
		arr2.add(30);
		System.out.println(" [추출] >>>>  ");
		System.out.println("arr2:"+arr2);
		Object [] arr = arr2.toArray();
		System.out.println(Arrays.toString(arr));
		List arr10 = arr2.subList(2, 6); //부분집합
		ArrayList arr11 = new ArrayList(arr2.subList(2, 6));
		System.out.println("subList(2, 6):"+arr10);
		System.out.println("arr10.get(1):"+arr10.get(1));
		System.out.println("arr11:"+arr11);
		System.out.println("arr2:"+arr2);
		arr10.add(777); // 부분집합 추가시 원본 list 도 변경
		arr10.remove((Object)10); // 부분집합 삭제시 원본 list 도 변경
		arr10.set(1,true);		// 부분집합 변경시 원본 list 도 변경	
		
		arr11.add(888);  // new 로 새로 ArrayList를 생성하였기에 변경시 원본list에 영향을 주지 않음
		System.out.println(" sublist 변경 --------");
		System.out.println("arr10:"+arr10);
		System.out.println("arr11:"+arr11);
		System.out.println("arr2:"+arr2);
		arr2.set(4, 2222);  // 원본수정시 sublist 부분 집합 같이 변경
		
		//-- > 원본list 에서 sublist 구간이 아닌 다른 곳에서 변경되어도 sublist 인식불가
		arr2.add(5,"장수풍뎅이"); //원본 추가시 sublist로 추출한 list 인식 실패
		arr2.remove(8); //원본 삭제시 sublist로 추출한 list 인식 실패 
						 
		System.out.println(" 원본 변경 --------");
		//System.out.println("arr10:"+arr10);  //원본 추가, 삭제 시 sublist 인식 불가
		System.out.println("arr11:"+arr11);
		System.out.println("arr2:"+arr2);
		
		System.out.println(" [Collections] >>>>  ");
		Collections.replaceAll(arr2, "나는", "me");
		System.out.println("replaceAll :"+arr2);
		Collections.reverse(arr2);
		System.out.println("reverse    :"+arr2);
		Collections.swap(arr2, 3, 7);
		System.out.println("swap       :"+arr2);
		Collections.shuffle(arr2);
		System.out.println("shuffle    :"+arr2);
		//Collections.sort(arr2);
		ArrayList arr12 = new ArrayList();
		arr12.add(33);
		arr12.add(22);
		arr12.add(33);
		arr12.add(99);
		arr12.add(11);
		arr12.add(66);
		arr12.add(22);
		arr12.add(55);
		arr12.add(88);
		arr12.add(77);
		System.out.println("arr12:"+arr12);
		Collections.sort(arr12);
		System.out.println("sort :"+arr12);
		arr12.clear();
		System.out.println("clear :"+arr12);
	}

}
