package lang_p;

import java.util.Arrays;

class ObjectStud{

	String name;
	int [] jum;
	int ban, tot, avg;
	public ObjectStud(int ban, String name, int kor, int eng, int mat) {
		super();
		this.ban = ban;
		this.name = name;
		this.jum = new int [] {kor, eng, mat};
		calc();
	}
	
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
	}
	
	@Override
	public String toString() {
		String ttt =
					ban+"\t"+
					name+"\t"+
					Arrays.toString(jum)+"\t"+
					tot+"\t"+
					avg;
		return ttt;
	}	
}
class ObjectRes{
	int [] jum;
	int ban, tot, avg;
	
	
	
	public ObjectRes(int ban) {
		
		this.ban = ban;
		jum = new int[3];
	}

	@Override
	public boolean equals(Object obj) {
		ObjectStud st = (ObjectStud)obj;
		boolean res =  ban == st.ban;
		if(res) {
			for (int i = 0; i < jum.length; i++) {
				jum[i]+=st.jum[i];
			}
			tot += st.tot;
			avg += st.avg;
		}
		return res;
	}

	@Override
	public String toString() {
		String ttt ="-------------------------------------------------\n"+
					ban+"\t"+
					"합계"+"\t"+
					Arrays.toString(jum)+"\t"+
					tot+"\t"+
					avg+"\n";
		return ttt;
	}	
}

public class ObjectExamMain {

	public static void main(String[] args) {
		ObjectStud [] studs = {
				new ObjectStud(1, "차은우", 77,79,72),
				new ObjectStud(2, "커피금우", 97,99,92),
				new ObjectStud(1, "우유은우", 27,29,22),
				new ObjectStud(2, "라떼금우", 37,39,32),
				new ObjectStud(1, "차우차우", 57,59,52),
				new ObjectStud(2, "버블금우", 87,89,82),
				new ObjectStud(1, "쉐이크은우", 47,49,42),
				new ObjectStud(2, "홍금우", 67,69,62),
				new ObjectStud(1, "에이드은우", 17,19,12),
				new ObjectStud(2, "흑당금우", 7,9,2)
		};
		
		ObjectRes [] orArr = {
				new ObjectRes(1),
				new ObjectRes(2)
		};
		
		for (ObjectRes or : orArr) {
			for (ObjectStud st : studs) {
				if(or.equals(st)) {
					System.out.println(st);
				}
			}
			System.out.println(or);
		}
		
/*
도형 클래스를 배열로 생성하여 같은 도형의 넓이와 둘레의 합계를 출력하세요

toString, equals

 * */
	}

}
