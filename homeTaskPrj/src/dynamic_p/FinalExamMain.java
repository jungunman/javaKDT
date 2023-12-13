package dynamic_p;

import java.util.Arrays;

class FinalArtStud{
	String name;
	final int [] jum;
	final int tot, avg;
	FinalArtStud(String name, int kor, int eng, int mat, int art) {
		super();
		this.name = name;
		this.jum = new int[] {kor, eng, mat, art};
		
		double [] rate = {0.2,0.15,0.05,0.6};
		double buf = 0;
		int tt = 0;
		for (int i = 0; i < rate.length; i++) {
			tt += jum[i];
			buf += jum[i] * rate[i];
		}
		tot = tt;
		avg = (int)buf;
		
	}
	
	
}

public class FinalExamMain {

	public static void main(String[] args) {
		FinalArtStud st = new FinalArtStud("정우성", 77,78,79,91);
		st.name = "정좌성";
		st.jum[0] = 9; //final 이어도 배열원소 대입 가능!! : 주소가 final
		//st.tot = 300;
		//st.avg = 99;
		System.out.println(st.name+":"+Arrays.toString(st.jum)+","+st.tot+","+st.avg);

	}

}
