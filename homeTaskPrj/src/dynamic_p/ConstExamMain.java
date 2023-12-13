package dynamic_p;

import java.util.Arrays;

class ConstStud{
	String name, kind;
	int [] jum;
	int tot, avg;
	
	
	ConstStud(String name, int kor, int eng, int mat) {
		this("일반",name, kor, eng, mat);
		avg = tot/jum.length;
		ppp();
	}
	
	ConstStud(String name, int kor, int eng, int mat, int art) {
		this("예체능",name, kor, eng, mat, art);
		double [] rate = {0.2,0.15,0.05,0.6};
		double buf = 0;
		for (int i = 0; i < rate.length; i++) {
			buf += rate[i] * jum[i];
		}
		avg = (int)buf;
		ppp();
	}
	
	private ConstStud(String kind,String name, int... jum) {
		this.kind = kind;
		this.name = name;
		this.jum = jum;
		
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
	}
	
	void ppp() {
		String ttt = kind +"\t"+name+"\t"+
					Arrays.toString(jum)+"\t"+
					tot+"\t"+avg;
		
		System.out.println(ttt);
	}
	
}


public class ConstExamMain {

	public static void main(String[] args) {
		new ConstStud("한가인", 77,78,71);
		new ConstStud("두가인", 77,78,71,76);
		//new ConstStud("외국인","삼가인", 77,78,71,78,89,87,65);
	}
	
	/// 도형 클래스를 생성자 위임 하여 구현하세요

}
