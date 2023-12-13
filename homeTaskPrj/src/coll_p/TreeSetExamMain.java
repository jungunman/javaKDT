package coll_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

class TreeSetStud{

	String type, name, gender;
	//String name;
	int tot,avg, rank;
	int [] jum;
	Comparable [][] eqArr;
	Integer ban;

	
	TreeSetStud(int ban, String gender, String name, int kor, int eng, int mat) {
		this("일반",ban, name, gender, kor, eng,  mat);
		avg = tot/jum.length;
	}
	TreeSetStud(int ban, String gender, String name, int kor, int eng, int mat, int art) {
		this("예체능",ban, name, gender, kor, eng,  mat, art);
		double dd = 0;
		double [] rate = {0.2,0.15,0.05,0.6};
		for (int i = 0; i < rate.length; i++) {
			dd += jum[i] * rate[i];
		}
		avg = (int)dd;
	}
	
	TreeSetStud(String type,int ban, String name, String gender, int... jum) {
		this.type = type;
		this.ban = ban;
		this.name = name;
		this.gender = gender;
		this.jum = jum;
		eqArr = new Comparable[][] {
			{type},
			{this.ban},
			{gender},
			{type, this.ban},
			{type, gender},
			{this.ban, gender},
			{type, this.ban, gender},
		};
		calcTot();
	}
	
	void calcTot() {
		tot=0;
		for (int i : jum) {
			tot += i;
		}
	}
	//(type), (반), (성별),(type, 반), (type, 성별),(반,성별),(type, 반,성별)
	void rankCalc(ArrayList arr, int rankNo ) {
		rank = 1;
		for (Object object : arr) {
			TreeSetStud you = (TreeSetStud)object;
			
			boolean chk = true;
			for (int i = 0; i < eqArr[rankNo].length; i++) {
				//Comparable meCom = eqArr[rankNo][i];
				//Comparable youCom = you.eqArr[rankNo][i];
				//chk = meCom.equals(youCom);
				//chk = eqArr[rankNo][i].equals(you.eqArr[rankNo][i]);
				if(!(chk = eqArr[rankNo][i].equals(you.eqArr[rankNo][i])) ) {
					break;
				}
			} 
			
			if(avg < you.avg && chk) {
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
		
//		String ttt = eqArr[0] + "\t" + eqArr[1] + "\t" + name + "\t" + eqArr[2] + "\t"
//				+ Arrays.toString(jum) + "\t";
//		if(eqArr[0].equals("일반")) {
//			ttt += "\t";
//		}
		ttt += tot + "\t" + avg + "\t" + rank;
		return ttt;
	}	
}

class TreeStudCom implements Comparator{
	int rankNo;

	public TreeStudCom(int rankNo) {
		super();
		this.rankNo = rankNo;
	}



	@Override
	public int compare(Object o1, Object o2) {
		TreeSetStud me = (TreeSetStud)o1;
		TreeSetStud you = (TreeSetStud)o2;
		
		int res = 0;
		for (int i = 0; i < me.eqArr[rankNo].length; i++) {
//			Comparable meCom = me.eqArr[rankNo][i];
//			Comparable youCom = you.eqArr[rankNo][i];
//			res = meCom.compareTo(youCom);
			
			if((res=me.eqArr[rankNo][i].compareTo(you.eqArr[rankNo][i]))!=0) {
				break;
			}
		} 
		
		
		if(res==0) {
			res = me.rank-you.rank;
		}
		if(res==0) {
			res = me.name.compareTo(you.name);
		}
		
		return res;
	}
}

//3. 입력값에 따라 type, 반, 성별을 선택하고  등수, 이름 순으로 출력하세요
public class TreeSetExamMain {

	public static void main(String[] args) {
		ArrayList data = new ArrayList();
		
		data.add(new TreeSetStud( 1, "남","홍길채",86, 82, 74));
		data.add(new TreeSetStud( 1, "여","김차서",62, 59, 44, 78));
		data.add(new TreeSetStud( 1, "남","홍길준",42, 69, 54, 98));
		data.add(new TreeSetStud( 1, "여","곽용귀",36, 22, 84));
		data.add(new TreeSetStud( 1, "여", "허민준",66, 32, 94));
		data.add(new TreeSetStud( 1, "남", "유길철",72, 74, 64, 58));
		data.add(new TreeSetStud( 1, "여", "홍민서",62, 39, 54, 88));
		data.add(new TreeSetStud( 1, "남", "박길북",76, 52, 84));
		data.add(new TreeSetStud( 1, "남", "김용북",66, 52, 84));
		data.add(new TreeSetStud( 1, "여", "유철북",32, 59, 64, 78));
		
		data.add(new TreeSetStud( 2, "남", "허용동",62, 59, 44, 58));
		data.add(new TreeSetStud( 2, "남", "김철서",66, 42, 74));
		data.add(new TreeSetStud( 2, "여", "배민용",32, 49, 74, 68));
		data.add(new TreeSetStud( 2, "여", "곽철길",66, 72, 74));
		data.add(new TreeSetStud( 2, "남", "허길준",62, 59, 54, 28));
		data.add(new TreeSetStud( 2, "남", "곽철북",62, 59, 43, 68));
		data.add(new TreeSetStud( 2, "여", "허용철",56, 32, 74));
		data.add(new TreeSetStud( 2, "남", "곽서홍",66, 42, 74));
		data.add(new TreeSetStud( 2, "여", "유철준",82, 69, 74, 88));
		data.add(new TreeSetStud( 2, "남", "김가북",56, 32, 64));
		
		data.add(new TreeSetStud( 3, "여", "박허동",62, 69, 74, 68));
		data.add(new TreeSetStud( 3, "여", "유민서",66, 42, 74));
		data.add(new TreeSetStud( 3, "남", "허민남",52, 69, 34, 78));
		data.add(new TreeSetStud( 3, "여", "곽광북",52, 39, 74, 58));
		data.add(new TreeSetStud( 3, "여", "유민극",62, 69, 74, 58));
		data.add(new TreeSetStud( 3, "남", "심서북",86, 52, 64));
		data.add(new TreeSetStud( 3, "남", "유민허",36, 62, 34));
		data.add(new TreeSetStud( 3, "여", "강민절",36, 72, 84));
		data.add(new TreeSetStud( 3, "남", "박용북",32, 69, 34, 68));
		data.add(new TreeSetStud( 3, "여", "탁용민",92, 59, 54, 78));
		
		//(type), (반), (성별),(type, 반), (type, 성별),(반,성별),(type, 반,성별)
		int rankNo = 5;
		
		for (Object object : data) {
			((TreeSetStud)object).rankCalc(data, rankNo);
		}
		
		TreeSet ts = new TreeSet(new TreeStudCom(rankNo));
		ts.addAll(data);
		
		for (Object object : ts) {
			System.out.println(object);
		}
	}

}
