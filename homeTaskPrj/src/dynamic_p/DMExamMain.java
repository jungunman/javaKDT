package dynamic_p;

import java.util.Arrays;

abstract class DMStud{
	String kind,name;
	int [] jum;
	int tot, avg;

	DMStud(String kind, String name, int... jum) {
		
		this.kind = kind;
		this.name = name;
		this.jum = jum;
		calc();
	}
	//void calc() {}
	abstract void calc();
	void ppp() {
		
		String ttt = kind+"\t"+name+"\t";
		ttt+=Arrays.toString(jum)+"\t";
		ttt+=tot+"\t"+avg;
		System.out.println(ttt);
	}
}
class DMGenStud extends DMStud{
	
	DMGenStud(String name, int kor, int eng, int mat) {
		super("일반",name,kor,eng,mat);
	}
	
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot / jum.length;
	}
	void ppp() {
		
		String ttt = kind+"\t"+name+"\t";
		ttt+=Arrays.toString(jum)+"\t\t";
		ttt+=tot+"\t"+avg;
		System.out.println(ttt);
	}
}

class DMArtStud extends DMStud{
	
	DMArtStud(String name, int kor, int eng, int mat, int art) {
		super("예능",name,kor,eng,mat,art);
	}
	
	void calc() {
		tot = 0;
		double buf = 0;
		double [] rate = {0.2, 0.15, 0.05, 0.6};
		for (int i = 0; i < rate.length; i++) {
			buf += rate[i] * jum[i];
			tot += jum[i];
		}
		avg = (int)buf;
	}
}

public class DMExamMain {

	public static void main(String[] args) {
		DMStud [] studs = {
			new DMGenStud("차은우", 97, 68, 32),
			new DMArtStud("커피은우", 97, 78, 52, 34),
			new DMGenStud("라떼은우", 37, 68, 92),
			new DMArtStud("스무디은우", 37, 58, 72, 94),
			new DMArtStud("바이크은우", 67, 68, 62, 64),
			new DMGenStud("기차은우", 67, 68,62)
		};

		for (DMStud st : studs) {
			st.ppp();
		}
	}
	/*

	  * 도형 클래스를 추상화하여 구현하세요

	  * 부모
	  * 클래스: 도형 
	  * calc() - 추상메소드

	  * 자식
	  * 클래스 : 
	  * 직사각형(가로, 세로) 
	  * 원(반지름)
	  * 직각삼각형(밑변,높이, 빗변)
	  * calc() 를 이용하여  도형이름, 넓이, 둘레    를 출력하세요



	과제
	
	수영 선수를 구현 하세요

부모 : 수영선수
     필드 : 이름, 종목(자유영, 접영, 평영, 배영)
     메소드 : 수영해요(거리) - 추상화
    
자식 :  자유형  :: 자유형 이름 거리 수영해요 
         접영 :: 접영 이름 몇초 수영해요
         평영:: 평영 이름 잠영 몇m, 평형 몇m 수영해요
         배영:: 배영 이름 거리 오리발 수영해요


	  * */


}
