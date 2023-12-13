package coll_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

class TreeMapStud{

	String type, name, gender;
	//String name;
	int tot,avg,ban, rank;
	int [] jum;
	
	TreeMapStud(int ban, String gender, String name, int kor, int eng, int mat) {
		this("일반",ban, name, gender, kor, eng,  mat);
		avg = tot/jum.length;
	}
	TreeMapStud(int ban, String gender, String name, int kor, int eng, int mat, int art) {
		this("예체능",ban, name, gender, kor, eng,  mat, art);
		double dd = 0;
		double [] rate = {0.2,0.15,0.05,0.6};
		for (int i = 0; i < rate.length; i++) {
			dd += jum[i] * rate[i];
		}
		avg = (int)dd;
	}
	
	private TreeMapStud(String type,int ban, String name, String gender, int... jum) {
		this.type = type;
		this.ban = ban;
		this.name = name;
		this.gender = gender;
		this.jum = jum;
		
		calcTot();
	}
	
	void calcTot() {
		tot=0;
		for (int i : jum) {
			tot += i;
		}
	}
	
	void rankCalc(TreeSet<TreeMapStud> arr ) {
		rank = 1;
		for (TreeMapStud you : arr) {
			
			if(avg < you.avg) {
				rank++;
			}
		}
	}
	@Override
	public String toString() {
		String ttt = type + "\t" + ban + "\t" + name + "\t" + gender + "\t"
				+ Arrays.toString(jum) + "\t";
		if(type.equals("일반")) {
			ttt += "\t";
		}
		ttt += tot + "\t" + avg + "\t" + rank;
		return ttt;
	}	
}

class MapStudCom implements Comparator<TreeMapStud>{
	

	@Override
	public int compare(TreeMapStud me, TreeMapStud you) {
		 
		int res = you.avg-me.avg;
		
		if(res==0) {
			res = me.name.compareTo(you.name);
		}
		
		return res;
	}
}
public class TreeMapExamMain {

	public static void main(String[] args) {
		ArrayList<TreeMapStud> data = new ArrayList();
		
		data.add(new TreeMapStud( 1, "남","홍길채",86, 82, 74));
		data.add(new TreeMapStud( 1, "여","김차서",62, 59, 44, 78));
		data.add(new TreeMapStud( 2, "남", "김철서",66, 42, 74));
		data.add(new TreeMapStud( 2, "여", "배민용",32, 49, 74, 68));
		data.add(new TreeMapStud( 2, "여", "곽철길",66, 72, 74));
		data.add(new TreeMapStud( 3, "남", "유민허",36, 62, 34));
		data.add(new TreeMapStud( 3, "여", "강민절",36, 72, 84));
		data.add(new TreeMapStud( 3, "남", "박용북",32, 69, 34, 68));
		data.add(new TreeMapStud( 2, "남", "곽서홍",66, 42, 74));
		data.add(new TreeMapStud( 2, "여", "유철준",82, 69, 74, 88));
		data.add(new TreeMapStud( 1, "남","홍길준",42, 69, 54, 98));
		data.add(new TreeMapStud( 1, "여","곽용귀",36, 22, 84));
		data.add(new TreeMapStud( 1, "여", "허민준",66, 32, 94));
		data.add(new TreeMapStud( 2, "남", "허용동",62, 59, 44, 58));
		data.add(new TreeMapStud( 1, "남", "유길철",72, 74, 64, 58));
		data.add(new TreeMapStud( 1, "여", "홍민서",62, 39, 54, 88));
		data.add(new TreeMapStud( 3, "여", "유민서",66, 42, 74));
		data.add(new TreeMapStud( 3, "남", "허민남",52, 69, 34, 78));
		data.add(new TreeMapStud( 3, "여", "곽광북",52, 39, 74, 58));
		data.add(new TreeMapStud( 1, "남", "박길북",76, 52, 84));
		data.add(new TreeMapStud( 1, "남", "김용북",66, 52, 84));
		data.add(new TreeMapStud( 1, "여", "유철북",32, 59, 64, 78));
		data.add(new TreeMapStud( 2, "남", "김가북",56, 32, 64));
		data.add(new TreeMapStud( 3, "여", "박허동",62, 69, 74, 68));
		data.add(new TreeMapStud( 3, "여", "유민극",62, 69, 74, 58));
		data.add(new TreeMapStud( 1, "남", "유길철",72, 74, 64, 58));
		data.add(new TreeMapStud( 2, "남", "허길준",62, 59, 54, 28));
		data.add(new TreeMapStud( 2, "남", "곽철북",62, 59, 43, 68));
		data.add(new TreeMapStud( 2, "여", "허용철",56, 32, 74));
		data.add(new TreeMapStud( 1, "여", "홍민서",62, 39, 54, 88));
		data.add(new TreeMapStud( 1, "남", "박길북",76, 52, 84));
		data.add(new TreeMapStud( 1, "남", "김용북",66, 52, 84));
		data.add(new TreeMapStud( 1, "여", "유철북",32, 59, 64, 78));
		data.add(new TreeMapStud( 3, "남", "심서북",86, 52, 64));
		data.add(new TreeMapStud( 3, "여", "탁용민",92, 59, 54, 78));

		MapStudCom msc = new MapStudCom();
		TreeMap<Integer, TreeSet<TreeMapStud>> totMap = new TreeMap();
		
		/// 입력부
		for (TreeMapStud st : data) {
			
			TreeSet<TreeMapStud> banTS = null;
			if(totMap.containsKey(st.ban)) {
				banTS = totMap.get(st.ban);
			}else {
				banTS = new TreeSet(msc);
				totMap.put(st.ban, banTS);
			}
			
			banTS.add(st);
		}
		
		
		
		
		///연산부
		for (Map.Entry<Integer, TreeSet<TreeMapStud>> meBan : totMap.entrySet()) {
			//Map.Entry<Integer, TreeSet> meBan = (Map.Entry<Integer, TreeSet>)object;
			for (TreeMapStud st : meBan.getValue()) {
				st.rankCalc(meBan.getValue()); 
			}
		}
		
		
		///출력부
		for (Map.Entry<Integer, TreeSet<TreeMapStud>> meBan : totMap.entrySet()) {
			
			System.out.println(meBan.getKey() +"반 >>>>");
			
			for (TreeMapStud st : meBan.getValue()) {
				System.out.println(st);
			}
		}
		
	/*
	도형을 생성하고 도형별로 정렬하여 출력하세요

	도형 정보 : 이름, 넓이, 둘레

  원 >>>
     원  ?    ?
  직사각형 >>>
     직사각형  ?    ?
  직각삼각형 >>>
   직각삼각형  ?    ?  
	
	        */ 
	}

}
