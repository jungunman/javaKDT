package oops_p;

import java.util.Arrays;




class ConstStud{
	String kind, name, type;
	int [] jum;
	int tot, avg;
	//ConstStud [] statistics;
	ConstExamStat ces;

	///학생 - 일반
	ConstStud(ConstExamStat [] ces,String name, int kor, int eng, int mat){
		//this.statistics = statistics;
		//this.ces = ces;
		kind = "일반";
		
		for (ConstExamStat tt : ces) {
			if(tt.kind.equals(kind)) {
				this.ces = tt;
			}
		}
		
		
		type = "학생";
		this.name = name;
		jum = new int[] {kor, eng, mat};
		genCalc();
		
		
	}
	
	//학생 - 예체능
	ConstStud(ConstExamStat [] ces, String name, int kor, int eng, int mat, int art){
		//this.ces = ces;
		kind = "예체능";
		type = "학생";
		for (ConstExamStat tt : ces) {
			if(tt.kind.equals(kind)) {
				this.ces = tt;
			}
		}
		this.name = name;
		jum = new int[] {kor, eng, mat, art};
		genCalc();
		artCalc();
		
	}
	
	//통계
	ConstStud(String kind, String name){
		this.kind = kind;
		type = "통계";
		this.name = name;
		jum = new int[4];
		
	}
	
	
	void genCalc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
		
		
		//통계 데이터 처리
		ces.calc(this);
		/*for (ConstExamStat tt : ces) {
			tt.calc(this);
		}
		
		for (ConstStud tt : statistics) {
			tt.statisticsCalc(this);
		}*/
		
		
	}
	
	void artCalc() {
		double avg2 = 0;
		double [] rate = {0.2, 0.15,0.05,0.6};
		for (int i = 0; i < rate.length; i++) {
			avg2 += rate[i] * jum[i];
		}
		
		avg = (int)avg2;
	}
	
	
	void ppp() {
		System.out.println(kind+"\t"+name+"\t"+Arrays.toString(jum)+"\t"+tot+"\t"+avg);
	}
	
	/*
	void statisticsCalc(ConstStud st){
		if(st.kind.equals(kind)) {
			for (int i = 0; i < jum.length; i++) {
				jum[i]+=st.jum[i];
			}
		}
	}*/
}

class ConstExamStat{
	String kind;
	ConstStud [] stat;
	int cnt = 0;
	public ConstExamStat(String kind) {
		
		this.kind = kind;
		
		stat = new ConstStud[] {
				new ConstStud(kind, "합계"),
				new ConstStud(kind,"평균"),
				new ConstStud(kind,"최대"),
				new ConstStud(kind,"최소")
		};
	}
	
	//학생 1명에 대한 통계 계산
	void calc(ConstStud st) {
		cnt++;
		//최대,최소 초기화
		if(cnt==1) {
			stat[2].jum = st.jum.clone();
			stat[3].jum = st.jum.clone();
		}
		
		//합계
		for (int i = 0; i < st.jum.length; i++) {
			stat[0].jum[i]+=st.jum[i];
		}
		
		for (int i = 0; i < st.jum.length; i++) {
			//평균
			stat[1].jum[i] = stat[0].jum[i]/cnt;
			//최대
			 if(stat[2].jum[i] <st.jum[i]) {
				 stat[2].jum[i] = st.jum[i];
			 }
			//최소
			 if(stat[3].jum[i] > st.jum[i]) {
				 stat[3].jum[i] = st.jum[i];
			 }
		}
		
	}
	
	void ppp() {
		
		System.out.println("----------------------------");
		//System.out.println(kind+" >>>");
		for (ConstStud cs : stat) {
			cs.ppp();
		}
	}
	
}


public class ConstExamMain {

	public static void main(String[] args) {
		/*
		ConstStud [] tot = {
				new ConstStud("합계", 0, 0, 0),
				new ConstStud("합계", 0, 0, 0,0)
		};*/
		
		ConstExamStat [] ces = {
				new ConstExamStat("일반"),
				new ConstExamStat("예체능")
			};
		
		ConstStud [] studs = {
			new ConstStud(ces,"현빈", 71, 58, 77),
			new ConstStud(ces,"원빈", 51, 78, 97,31),
			new ConstStud(ces,"투빈", 51, 78, 37,91),
			new ConstStud(ces,"김우빈", 61, 98, 57),
			new ConstStud(ces,"장희빈", 81, 78, 67),
			new ConstStud(ces,"젤리빈", 91, 38, 47,65),
			new ConstStud(ces,"미스터빈", 31, 98, 47,65),
			new ConstStud(ces,"텅빈", 91, 78, 87),
			new ConstStud(ces,"커피빈", 91, 98, 97,93),
			new ConstStud(ces,"골빈", 51, 78, 97)
		};
		
		//String [] kind = {"일반","예체능"};
		
		
		
		//통계 처리
		
		
		
		///출력
		for (ConstExamStat tt: ces) {
			System.out.println(tt.kind+" >>>");
			
			for (ConstStud st : studs) {
				
				if(tt.kind.equals(st.kind)) {
					st.ppp();
				}
			}
			
			
			tt.ppp();
		}
//		for (ConstStud st : studs) {	
//			st.ppp();
//		}
		//ces[0].ppp();
		//ces[1].ppp();
		
		
		/*for (String title : kind) {
			System.out.println(title+" >>>");
			
			for (ConstStud st : studs) {
				
				if(title.equals(st.kind)) {
					st.ppp();
				}
			}
			System.out.println("---------------------------");
			for (ConstStud tt : tot) {
				if(title.equals(tt.kind)) {
					tt.ppp();
				}
			}
		}*/
		
	}
	/*
	 ///////// 
도형 클래스를 구현하세요

인수의 갯수로 도형을 구분할 것

도형 : 사각형, 원, 직각삼각형

출력 : 도형(원, 사각형)의 넓이, 둘레


-----------------------------------------
사각형의 넓이 : 30, 둘레 : 22
원의 넓이 : ? , 둘레 : ?
직각삼각형의 넓이 : ?, 둘레: ?


주말과제 :
음식 주문 통계 데이터를 구현하세요


	 * */

}

