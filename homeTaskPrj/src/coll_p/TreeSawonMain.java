package coll_p;

import java.util.Comparator;
import java.util.TreeSet;

enum SawonCC{
	부장, 과장, 대리, 사원
}

class TrSawon{
	SawonCC sc;
	String name;
	int jum;
	
	public TrSawon(String sc, String name, int jum) {
		this.sc = SawonCC.valueOf(sc);
		this.name = name;
		this.jum = jum;
	}

	@Override
	public String toString() {
		return sc + "\t" + name + "\t" + jum;
	}
}

class SaCom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		TrSawon me = (TrSawon)o1;
		TrSawon you = (TrSawon)o2;
		
		// 비교 순서  직급 > 점수 > 이름
		
		//직급비교
		//int res = me.sc.ordinal() - you.sc.ordinal();
		//enum 의 ordinal() 비교를 enum의 compareTo() 로 실행
		int res = me.sc.compareTo(you.sc); 
		
		//직급이 같다면 점수 비교
		if(res==0) {
			res = you.jum - me.jum;
		}
		
		//점수가 같다면 이름 비교
		if(res==0) {
				//String은  compareTo() 로 비교
			res = me.name.compareTo(you.name);
		}
		return res;
	}
	
}

public class TreeSawonMain {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new SaCom());
		ts.add(new TrSawon("과장", "현빈", 72));
		ts.add(new TrSawon("부장", "원빈", 62));
		ts.add(new TrSawon("대리", "김우빈", 82));
		ts.add(new TrSawon("과장", "투빈", 92));
		ts.add(new TrSawon("사원", "골빈", 42));
		ts.add(new TrSawon("대리", "커피빈", 72));
		ts.add(new TrSawon("부장", "젤리빈", 62));
		ts.add(new TrSawon("사원", "장희빈", 2));
		ts.add(new TrSawon("과장", "미스터빈", 52));
		ts.add(new TrSawon("대리", "하얼빈", 82));
		ts.add(new TrSawon("사원", "텅빈", 62));
		ts.add(new TrSawon("사원", "자바빈", 32));
		
		for (Object ob : ts) {
			System.out.println(ob);
		}
	}
	/*
1. 반, 등수, 이름 순으로 출력하세요
2. type, 반, 성별 , 등수, 이름 순으로 출력하세요
3. 입력값에 따라 type, 반, 성별을 선택하고  등수, 이름 순으로 출력하세요

   등수가 같으면 이름 오름 차순임
   type : 일반, 예체능

   출력내용 : type, 반 , 이름,  성별 , 국, 영, 수, 예체능, 총점, 평균, 등수 
*/

}
