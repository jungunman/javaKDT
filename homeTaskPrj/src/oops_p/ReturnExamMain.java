package oops_p;

import java.util.Arrays;


class PPP{
	void println(String aaa) {
		java.lang.System.out.println("너는 감염됐지");
	}
}
class System2{
	static PPP out = new PPP();
}

class ReturnStud{
	
	String name;
	int [] jum;
	int tot, avg;
	
	void init(String name , int ... jum) {
		this.name = name;
		this.jum = jum;
		calc();
	}
	
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
	}
	
	void ppp() {
		System.out.println(name+"\t"+Arrays.toString(jum)+"\t"+tot+"\t"+avg);
	}
	
}

class ReturnTeacher{
	ReturnStud makeStud(String name, int ...jum) {
		ReturnStud st = new ReturnStud();
		st.init(name, jum);
		return st;
	}
}
public class ReturnExamMain {

	public static void main(String[] args) {
		ReturnTeacher rt = new ReturnTeacher();
		//ReturnStud st = rt.makeStud("한가인", 7,8,2);
		//st.ppp();
		
		ReturnStud [] studs = {
				rt.makeStud("한가인", 77,78,72),
				rt.makeStud("한나인", 57,58,52),
				rt.makeStud("한다인", 97,98,92),
				rt.makeStud("한라인", 67,68,62),
				rt.makeStud("한마인", 87,88,82)
		};
		
		for (ReturnStud st : studs) {
			st.ppp();
		}
		
		/*
		 햄버거 가게를 구현하세요

실행클래스 MethodHamMain

클래스 MethodHam

메소드: order 


메뉴 :

햄버거 : 불고기버거, 치즈버거, 새우버거
음료 : 콜라,사이다
사이드 : 감자튀김, 치즈스틱

정보 : 가격, 칼로리


order(불고기버거, 감자튀김, 콜라)
order(불고기버거, 감자튀김, 사이다) 
order(새우버거, 감자튀김, 콜라)
order(새우버거, 치즈스틱, 콜라)
order(치즈버거, 감자튀김, 사이다)
 */
	}

}
